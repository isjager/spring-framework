package com.osjager.beanlifecycle.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 通过 Spring 的 BeanPostProcessor 的 bean 的后置处理器会拦截所有 bean 创建过程
 *
 * BeanPostProcessor 的执行源码：
 * 1、AbstractAutowireCapableBeanFactory.doCreateBean() ->
 * 		populateBean(beanName, mbd, instanceWrapper);
 *		exposedObject = initializeBean(beanName, exposedObject, mbd);
 * 2、applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
 * 3、invokeInitMethods(beanName, wrappedBean, mbd);
 *    	((InitializingBean) bean).afterPropertiesSet();
 *    	自定义的 init 方法
 * 4、applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
 *
 * @Author isjager
 */
public class OsageBeanPostProcessor implements BeanPostProcessor {

	/**
	 * postProcessBeforeInitialization：在 init() 方法之前调用
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("OsageBeanPostProcessor......postProcessBeforeInitialization：" + beanName);
		return bean;
	}

	/**
	 * postProcessAfterInitialization：在 init() 方法之后调用
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("OsageBeanPostProcessor.....postProcessAfterInitialization：" + beanName);
		return bean;
	}
}
