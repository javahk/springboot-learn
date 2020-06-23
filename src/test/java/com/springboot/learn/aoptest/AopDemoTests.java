package com.springboot.learn.aoptest;

import javax.annotation.Resource;

import com.springboot.learn.SpringbootDemoApplication;
import com.springboot.learn.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.learn._2aop.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class AopDemoTests {
    @Resource
    private UserService userService;

    @Test
    public void aopTest() {
        userService.addUser(new User());
    }

}
