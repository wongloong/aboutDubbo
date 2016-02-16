package com.yks.crm;

import com.yks.crm.pojo.user.UserInfo;
import com.yks.crm.service.user.UserServiceApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AppTest {
    @Autowired
    private UserServiceApi userService;
    @Test
    public void testAdd(){
        UserInfo userInfo = new UserInfo();
        userInfo.setPassword("test");
        userService.saveUserInfo(userInfo);
    }
}
