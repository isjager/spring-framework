package com.osjager.scope.config;

import com.osjager.scope.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @Author isjager
 */
@Configuration
public class MainConfig {

	/**
	 * 一、配置 Bean 的作用域对象
	 *
	 * 1、在不指定 @Scope 的情况下，所有的 bean 都是单实例的 bean，而且是饿汉加载（容器启动实例就是创建好了）
	 *
	 * 2、指定 @Scope 为 prototype 表示为多实例的，而且还是懒汉模式加载（IOC 容器启动的时候，并不会创建对象，而是在第一次使用的时候才会创建）
	 *
	 * 二、@Scope 指定的作用域方法取值：
	 *
	 *   1、singleton 单实例的（默认）
	 * 	 2、prototype 多实例
	 * 	 3、request 同一个请求
	 *	 4、session 同一个会话
	 *
	 * 三、@Lazy：Bean 的懒加载（主要针对单实例的 bean，容器启动的时候，不创建对象，在第一次使用的时候才会创建该对象）
	 */
	@Bean
	@Scope(value = "prototype")
	@Lazy
	public Person person() {
		return new Person();
	}
}
