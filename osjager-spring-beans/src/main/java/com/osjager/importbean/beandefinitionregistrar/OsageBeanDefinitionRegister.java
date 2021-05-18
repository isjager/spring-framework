package com.osjager.importbean.beandefinitionregistrar;

import com.osjager.importbean.component.Car;
import com.osjager.importbean.component.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author isjager
 *
 * 通过 @Import 的 ImportBeanDefinitionRegistrar 导入组件（可以指定 bean 的名称）
 */
public class OsageBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		// 创建一个 bean 定义对象
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Cat.class);
		// 把 bean 定义对象导入到容器中
		registry.registerBeanDefinition("cat", rootBeanDefinition);
	}
}
