package com.osjager.beanprofiles.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;

/**
 * 通过 @Profile 注解，根据环境来激活不同的 Bean
 *
 * 1、@Profile 标识在类上，那么只有当前环境匹配，整个配置类才会生效。
 *
 * 2、@Profile 标识在 Bean 上，那么只有当前环境的 Bean 才会生效。
 *
 * @Author isjager
 */
@Configuration
@PropertySource(value = {"classpath:ds.properties"})
public class MainConfig implements EmbeddedValueResolverAware {

	@Value("${ds.username}")
	private String userName;

	@Value("${ds.password}")
	private String password;

	private String jdbcUrl;

	private String classDriver;

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		this.jdbcUrl = resolver.resolveStringValue("${ds.jdbcUrl}");
		this.classDriver = resolver.resolveStringValue("${ds.classDriver}");
	}

	// 标识为测试环境才会被装配
	@Bean
	@Profile(value = "test")
	public DataSource testDs() {
		return builderDataSource(new DruidDataSource());
	}

	// 标识开发环境才会被激活
	@Bean
	@Profile(value = "dev")
	public DataSource devDs() {
		return builderDataSource(new DruidDataSource());
	}

	// 标识生产环境才会被激活
	@Bean
	@Profile(value = "prod")
	public DataSource prodDs() {
		return builderDataSource(new DruidDataSource());
	}

	private DataSource builderDataSource(DruidDataSource dataSource) {
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(classDriver);
		dataSource.setUrl(jdbcUrl);
		return dataSource;
	}
}
