package com.osjager.beanlifecycle.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 通过 JSR250 规范提供的注解 @PostConstruct 和 @ProDestroy 标注的方法
 *
 * @Author isjager
 */
public class Book {

	public Book() {
		System.out.println("book 的构造方法");
	}

	@PostConstruct
	public void init() {
		System.out.println("book 的 PostConstruct 标志的方法");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("book 的 PreDestroy 标注的方法");
	}
}
