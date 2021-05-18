package com.osjager.importbean;

import com.osjager.importbean.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author isjager
 */
public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println("beanName：" + beanName);
		}

		Object bean = ctx.getBean("carFactoryBean");
		System.out.println(bean);
		Object bean2 = ctx.getBean("&carFactoryBean");
		System.out.println(bean2);
	}
}
