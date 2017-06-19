package cn.demo.controller;

import cn.demo.model.Account;
import cn.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chengcheng on 2017/3/22.
 */
@Controller
public class Demo1Controller {



    @Autowired
    private AccountService accountService;


    /***
     * value表示在浏览器输入的地址如：http://localhost:8080/simple-demo/demo
     * method可以不写，默认为GET，当处理POST请求时必须要写method = RequestMethod.POST，否则找不到地址
     *
     * @return 返回的是页面的地址，在配置文件InternalResourceViewResolver中配置prefix和suffix相当于最后返回/WEB-INF/jsp/demo1.jsp
     */
    @RequestMapping(value = "/simple-demo/demo",method = RequestMethod.GET)
    public String demo1View(Model model){
        List<Account> accountList= accountService.getAllAccount();
        for (Account account:accountList) {
            System.out.println(account.toString()+"=======================================================================================================");
        }
        model.addAttribute("accountList",accountList);
        return "demo1";
    }

//    @ResponseBody
//    @ResponseBody
    @RequestMapping(value = "/simple-demo/demo2",method = RequestMethod.GET)
    public String getUser(Model model){
        List<Account> sessionAccountList = accountService.getSessionAccount();
        model.addAttribute("sessionAccountList",sessionAccountList);
        return "demo2";
    }
}