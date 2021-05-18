package com.osjager.beanaware.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自己定义的组件需要使用 spring ioc 的底层组件的时候，比如：ApplicationContext 等
 * （可以通过实现 xxxAware 接口来实现）
 *
 * @Author isjager
 */
@Configuration
@ComponentScan(basePackages = "com.osjager.beanaware")
public class MainConfig {


}
