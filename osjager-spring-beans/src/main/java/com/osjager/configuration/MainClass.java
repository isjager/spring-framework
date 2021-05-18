package com.osjager.configuration;

import com.osjager.configuration.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author isjager
 */
public class MainClass {

	public static void main(String[] args) {
		// 1、classpath:/beans/beans.xml：XML 配置文件的形式
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/beans/beans.xml");
		// 去容器中读取 Bean
		System.out.println(ctx.getBean("car"));

		// 2、基于读取配置类（MainConfig.class ）的形式定义 Bean 信息
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		// 去容器汇总读取 Bean 的信息（传入配置类）
		System.out.println(context.getBean("tank"));
	}
}
