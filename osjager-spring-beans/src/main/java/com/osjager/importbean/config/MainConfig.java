package com.osjager.importbean.config;

import com.osjager.importbean.component.Person;
import com.osjager.importbean.beandefinitionregistrar.OsageBeanDefinitionRegister;
import com.osjager.importbean.factorybean.CarFactoryBean;
import com.osjager.importbean.importselect.OsageImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author isjager
 *
 * 往 IOC 容器添加组件的方式：
 *
 * 1、通过 @ComponentScan + @Controller、@Service、@Repository、@Component
 *（适用场景：针对自己写的组件可以通过该方式来进行加载到容器中。）
 *
 * 2、通过 @Bean 的方式来导入组件（适用于导入第三方组件的类）
 *
 * 3、通过 @Import 来导入组件（导入组件的 id 为全类名路径）
 *（通过 @Import 的 ImportSelector 类实现组件的导入（导入组件的 id 为全类名路径））
 *
 * 4、通过实现 FactoryBean 接口来实现注册组件
 */
@Configuration
//@Import(value = {Person.class, Car.class, OsageImportSelector.class})
//@Import(value = {Person.class, OsageImportSelector.class, OsageBeanDefinitionRegister.class})
@ImportResource(locations = {"classpath:/beans/beans.xml"})
public class MainConfig {

	@Bean
	public CarFactoryBean carFactoryBean() {
		return new CarFactoryBean();
	}
}
