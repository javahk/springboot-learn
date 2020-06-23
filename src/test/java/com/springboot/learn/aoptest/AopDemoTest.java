package com.springboot.learn.aoptest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.learn.SpringbootDemoApplication;
import com.springboot.learn._2aop.service.UserService;
import com.springboot.learn.model.User;

/**
 * 测试aop功能(源码分析) http://www.baidu.com
 *
 * Spring AOP 是 Spring核心功能，关注于横向切面的问题，比如日志、事务、安全、权限等等<br />
 * Spring AOP 整合了Aspect的注解功能，减少了繁琐的xml配置<br />
 * Spring AOP 实现原理是基于JDK动态代理和Cglib动态代理，并没有使用Aspect提供的代理，只是使用了Aspect注解<br />
 * SpringBoot默认使用CGLIB代理，如果代理的目标类是接口则使用JDK代理<br />
 * 
 * @see org.springframework.aop.framework.DefaultAopProxyFactory
 * @see com.springboot.learn._2aop
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class AopDemoTest {
    @Resource
    private UserService userService;

    @Test
    public void aopTest() {
        userService.addUser(new User());
    }

}
