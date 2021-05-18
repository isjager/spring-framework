package com.osjager.beanaware.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 自己定义的组件需要使用 spring ioc 的底层组件的时候，比如：ApplicationContext 等
 *（可以通过实现 xxxAware 接口来实现）
 *
 * @Author isjager
 */
@Component
public class OsageComponent implements ApplicationContextAware, BeanNameAware {

	private ApplicationContext applicationContext;

	@Override
	public void setBeanName(String name) {
		System.out.println("current bean name is : [" + name + "]");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
