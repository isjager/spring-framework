package com.osjager.beanlifecycle.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 通过 InitializingBean 和 DisposableBean 的二个接口实现 bean 的初始化以及销毁方法
 *
 * @Author isjager
 */
@Component
public class Person implements InitializingBean, DisposableBean {

	public Person() {
		System.out.println("Person 的构造方法");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean 的 destroy() 方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 的 afterPropertiesSet() 方法");
	}
}
