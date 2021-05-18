package com.osjager.configuration.config;

import com.osjager.configuration.component.Tank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author isjager
 *
 * 配置类的形式定义 Bean 信息
 */
@Configuration
public class MainConfig {

	/**
	 * 通过 @Bean 的形式使用的话，bean 的默认名称是方法名。若 @Bean(value="bean的名称") 那么 bean 的名称是指定的。
	 */
	@Bean
	public Tank tank() {
		return new Tank(1, "tank");
	}
}
