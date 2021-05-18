package com.osjager.beanvalue;

import com.osjager.beanvalue.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author isjager
 */
public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		String[] names = ctx.getBeanDefinitionNames();

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println(ctx.getBean("person").toString());
	}
}
