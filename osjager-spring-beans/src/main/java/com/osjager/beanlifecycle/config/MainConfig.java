package com.osjager.beanlifecycle.config;

import com.osjager.beanlifecycle.beanpostprocessor.OsageBeanPostProcessor;
import com.osjager.beanlifecycle.component.Book;
import com.osjager.beanlifecycle.component.Car;
import com.osjager.beanlifecycle.component.OsageLog;
import com.osjager.beanlifecycle.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 什么是 Bean 的生命周期？（bean 的创建 -> 初始化 -> 销毁方法）
 *
 * 由容器管理 Bean 的生命周期，我们可以通过自己指定 bean 的初始化方法和 bean 的销毁方法
 *
 * 使用方式：
 * 1、指定了 bean 的生命周期的初始化方法和销毁方法
 *
 * 2、通过 InitializingBean 和 DisposableBean 的二个接口实现 bean 的初始化以及销毁方法
 *
 * 3、通过 JSR250 规范提供的注解 @PostConstruct 和 @ProDestroy 标注的方法
 *
 * 4、通过 Spring 的 BeanPostProcessor 的 bean 的后置处理器会拦截所有 bean 创建过程
 * - postProcessBeforeInitialization：在 init() 方法之前调用
 * - postProcessAfterInitialization：在 init() 方法之后调用
 *
 * @Author isjager
 */
@Configuration
@ComponentScan(basePackages = "com.osjager.beanlifecycle")
public class MainConfig {

	/**
	 * 指定了 bean 的生命周期的初始化方法和销毁方法
	 *
	 * 1、针对单实例 bean 的话，容器启动的时候，bean 的对象就创建了，而且容器销毁的时候，也会调用 Bean 的销毁方法。
	 * 2、针对多实例 bean 的话，容器启动的时候，bean 是不会被创建的而是在获取 bean 的时候被创建，而且 bean 的销毁不受 IOC 容器的管理。
	 */
	@Scope(value = "prototype")
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Car car() {
		return new Car();
	}

	@Bean
	public Person person() {
		return new Person();
	}

	@Bean
	public Book book() {
		return new Book();
	}

	@Bean(initMethod = "init")
	public OsageLog osageLog() {
		return new OsageLog();
	}

	@Bean
	public OsageBeanPostProcessor osageBeanPostProcessor() {
		return new OsageBeanPostProcessor();
	}
}
