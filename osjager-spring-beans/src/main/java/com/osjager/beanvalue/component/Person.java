package com.osjager.beanvalue.component;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * 通过 @Value + @PropertySource 来给组件赋值
 *
 * @Author isjager
 */
@ToString
public class Person {

	// 通过普通的方式
	@Value("司马")
	private String firstName;

	// spel 方式来赋值
	@Value("#{28-8}")
	private Integer age;

	// 通过读取外部配置文件的值
	@Value("${person.lastName}")
	private String lastName;
}
