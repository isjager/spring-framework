package com.osjager.conditional;

import com.osjager.conditional.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author isjager
 */
public class MainClass {

	public static void main(String[] args) {

		// 注解方式加载配置类
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		// 从容器中获取组件
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println("beanName：" + beanName);
		}
	}
}
