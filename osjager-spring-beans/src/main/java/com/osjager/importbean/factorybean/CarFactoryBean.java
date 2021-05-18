package com.osjager.importbean.factorybean;

import com.osjager.importbean.component.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * 通过实现 FactoryBean 接口来实现注册组件
 *
 * @Author isjager
 */
public class CarFactoryBean implements FactoryBean<Car> {

	// 返回 bean 的对象
	@Override
	public Car getObject() throws Exception {
		return new Car();
	}

	// 返回 bean 的类型
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	// 是否为单例
	@Override
	public boolean isSingleton() {
		return false;
	}
}
