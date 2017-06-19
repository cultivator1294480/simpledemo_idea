package cn.demo.service;

import cn.demo.dao.AccountDao;
import cn.demo.dao.AreaDao;
import cn.demo.model.Account;
import cn.demo.model.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 2017/3/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//这个是用来加载写好的配置文件，传入的值是数组形式多个配置文件如下 {"····","·······"}
@ContextConfiguration({"classpath:spring/spring-dao-config.xml"})
public class AccountServiceTest {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private AreaDao areaDao;

//    @Test
    public void getAllAccount() throws Exception {
        List<Account> accountList = accountDao.getAllAccount();
        System.out.println("accountList=" + accountList.toString());
    }

//    @Test
    public void testGetNamesAndItems() {
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("in_id", 1);
        parms.put("in_user_name", "子了");
        parms.put("out_user_phone", new String());
        accountDao.updateUser(parms);
        assertEquals("13285250574", parms.get("out_user_phone"));


    }

    @Test
    public void testGetAllArea() {
       List<Area> areas = areaDao.getAllArea();
        System.out.print(areas.toString());
//        for (Area area:areas) {
//            System.out.print(area.toString());
//        }


    }


}