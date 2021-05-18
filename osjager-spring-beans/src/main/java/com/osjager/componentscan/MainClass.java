package com.osjager.componentscan;

import com.osjager.componentscan.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author isjager
 */
public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();

		for (String name : beanDefinitionNames) {
			System.out.println("bean 的定义信息：" + name);
		}
	}
}
