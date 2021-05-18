package com.osjager.beanlifecycle.component;

/**
 * @Author isjager
 */
public class Car {

	public Car() {
		System.out.println("Car 的构造方法......");
	}

	public void init() {
		System.out.println("Car 初始化方法......init");
	}

	public void destroy() {
		System.out.println("Car 销毁方法......destroy");
	}
}
