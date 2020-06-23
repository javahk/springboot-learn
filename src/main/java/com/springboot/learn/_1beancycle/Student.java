package com.springboot.learn._1beancycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * spring bean 生命周期<br />
 * 
 * @see AbstractAutowireCapableBeanFactory#createBean(String, RootBeanDefinition, Object[])<br />
 *      1.实例化<br />
 *      调用InstantiationAwareBeanPostProcessor 的 postProcessBeforeInstantiation接口<br />
 *      在实例化之前调用获取一个代理的bean<br />
 *      返回bean代理则直接执行，postProcessAfterInstantiation接口
 * 
 * @see AbstractAutowireCapableBeanFactory#doCreateBean( String , RootBeanDefinition , Object[])<br />
 *      2.属性赋值（自动注入逻辑）<br />
 *      InstantiationAwareBeanPostProcessor 的 postProcessAfterInstantiation接口<br />
 *      最后一次在属性注入对象前修改bean的属性<br />
 *      自动注入依赖的对象 autoByName 或者 autoByType<br />
 * 
 *      3.初始化<br />
 *      调用各类感知Aware接口<br />
 *      执行applyBeanPostProcessorsBeforeInitialization初始化前的 处置操作<br />
 *      调用InitializingBean接口初始化<br />
 *      如果配置了method-init，则调用其方法初始化<br />
 *      调用applyBeanPostProcessorsAfterInitialization 初始化之后的处置操作
 * 
 *      4.销毁 后续补充
 */
//@Component
public class Student implements InstantiationAwareBeanPostProcessor, BeanNameAware, BeanFactoryAware,
        BeanClassLoaderAware, InitializingBean, BeanPostProcessor, ApplicationContextAware {

    // InstantiationAwareBeanPostProcessor 实例化对象之前执行
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    // InstantiationAwareBeanPostProcessor 实例化对象之后执行
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return false;
    }

    // Aware 初始化阶段，初始化各种Aware接口
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }

    // Aware 初始化阶段，初始化各种Aware接口
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    // Aware 初始化阶段，初始化各种Aware接口
    @Override
    public void setBeanName(String name) {

    }

    // BeanPostProcess 初始化前处理器
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    // 调用init-method方法会初始化InitializingBean接口
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    // BeanPostProcess 初始化后处理器
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
    // BeanPostProcess 初始化前处理器之前执行的注入
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    }
}
