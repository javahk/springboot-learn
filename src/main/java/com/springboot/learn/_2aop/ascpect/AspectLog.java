package com.springboot.learn._2aop.ascpect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLog {

    /**
     * 使用注解进行切入
     */
    @Pointcut("@annotation(com.springboot.learn._2aop.ascpect.Log)")
    private void method1() {
    }

    /**
     * 使用表达式进行切入
     */
    @Pointcut("execution(* com.springboot.learn._2aop.service.UserService.*(..))")
    private void method2() {
    }

    @Before("method1()")
    public void aspectMethodBefore() {
        System.out.println("fuck before。。。");
    }

    @After("method1()")
    public void aspectMethodAfter() {
        System.out.println("fuck after。。。");
    }

}
