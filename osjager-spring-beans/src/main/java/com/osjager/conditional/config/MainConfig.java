package com.osjager.conditional.config;

import com.osjager.conditional.component.OsageAspect;
import com.osjager.conditional.component.OsageLog;
import com.osjager.conditional.condition.OsageCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author isjager
 */
@Configuration
public class MainConfig {

//	@Bean
	public OsageAspect osageAspect() {
		return new OsageAspect();
	}

	/**
	 * @Conditional 注解：进行条件判断等（例：有两个组件 OsageAspect 和 OsageLog，
	 * OsageLog 组件依赖于 OsageAspect 的组件）
	 *
	 * 当前容器中有 osageAspect 的组件，那么 osageLog 才会被实例化。
	 */
	@Bean
	@Conditional(value = OsageCondition.class)
	public OsageLog osageLog() {
		return new OsageLog();
	}
}
