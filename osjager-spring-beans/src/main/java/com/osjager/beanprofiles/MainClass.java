package com.osjager.beanprofiles;

import com.osjager.beanprofiles.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 激活切换环境的方法：
 *
 * 方法一：通过运行时 jvm 参数来切换：-Dspring.profiles.active=dev｜test｜prod
 *
 * 方法二：通过代码的方式来激活
 *
 * @Author isjager
 */
public class MainClass {

	public static void main(String[] args) {
		// 通过运行时 jvm 参数来切换：-Dspring.profiles.active=dev｜test｜prod
		/*AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(MainConfig.class);

		String[] beanNames = ctx.getBeanDefinitionNames();

		for (String beanName : beanNames) {
			System.out.println("容器中的 BeanName：" + beanName);
		}*/

		// 通过代码的方式来激活
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext();

		ctx.getEnvironment().setActiveProfiles("test", "dev", "prod");

		ctx.register(MainConfig.class);
		ctx.refresh();
		printBeanName(ctx);
	}

	private static void printBeanName(AnnotationConfigApplicationContext ctx) {
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println("容器中的 BeanName：" + beanName);
		}
	}
}
