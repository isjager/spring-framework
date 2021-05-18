package com.osjager.beanlifecycle.component;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Author isjager
 */
public class OsageLog implements InitializingBean {

	public OsageLog() {
		System.out.println("OsageLog 的构造方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("OsageLog 的 afterPropertiesSet 方法");
	}

	public void init() {
		System.out.println("OsageLog 的 init 方法");
	}
}
