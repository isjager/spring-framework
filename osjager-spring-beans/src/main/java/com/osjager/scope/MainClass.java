package com.osjager.scope;

import com.osjager.scope.component.Person;
import com.osjager.scope.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author isjager
 */
public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		Person person = (Person) ctx.getBean("person");
		Person person1 = (Person) ctx.getBean("person");

		System.out.println(person == person1);
	}
}
