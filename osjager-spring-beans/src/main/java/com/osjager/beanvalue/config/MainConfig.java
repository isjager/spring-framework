package com.osjager.beanvalue.config;

import com.osjager.beanvalue.component.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 通过 @Value + @PropertySource 来给组件赋值
 *
 * @Author isjager
 */
@Configuration
@PropertySource(value = {"classpath:person.properties"}) 	// 指定外部文件的位置
public class MainConfig {

	@Bean
	public Person person() {
		return new Person();
	}
}
