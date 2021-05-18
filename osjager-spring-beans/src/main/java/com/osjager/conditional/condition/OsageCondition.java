package com.osjager.conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * @Author isjager
 *
 * @Conditionl 进行条件判断使用方式：实现 Condition 接口
 */
public class OsageCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 判断容器中是否有 osageAspect 组件
		if (Objects.requireNonNull(context.getBeanFactory()).containsBean("osageAspect")) {
			return true;
		}
		return false;
	}
}
