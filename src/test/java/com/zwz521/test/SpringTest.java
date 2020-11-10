package com.zwz521.test;

import com.zwz521.pojo.User;
import com.zwz521.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 赵文卓
 * @version 1.0
 * @date 2020/11/3 10:55
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
public class SpringTest {

    @Autowired
    private UserService userService;

    @Test
    public void test01(){
        User user = userService.findById(1);
        System.out.println(user);
    }
}
