/**
 * Created by chengcheng on 2017/6/2 0002.
 */
package cn.demo.service;

import cn.demo.dao.AccountDao;
import cn.demo.model.Account;
import cn.demo.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2017/3/22.
 */

@Service
public class AccountService {

    /**
     *帐户信息
     */
    @Autowired
    public AccountDao accountDao;

    /**
     *
     * @return
     */
    @Transactional
    public List<Account> getAllAccount(){

        List<Account> accountList=new ArrayList<Account>();
        accountList=accountDao.getAllAccount();


        SessionUtil.getSession().setAttribute("user",accountList);
        return accountList;
    }

    /**
     * 获得session中的帐户信息
     * @return
     */
    public List<Account> getSessionAccount() {
        List<Account> sessionAccountList = (List<Account>) SessionUtil.getSession().getAttribute("user");
        for (Account sessionAccount: sessionAccountList ) {
            sessionAccount.setId(sessionAccount.getId()+1);
            sessionAccount.setName(sessionAccount.getName()+1);
        }
        return sessionAccountList;
    }
}