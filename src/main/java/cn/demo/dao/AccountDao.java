package cn.demo.dao;
/**
 * Created by chengcheng on 2017/6/2 0002.
 */


import cn.demo.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/22.
 */
@Repository
public interface AccountDao {

    public List<Account> getAllAccount();

//    List<List<?>> getNamesAndItems();

    String updateUser(Map<String, Object> parms);
}