package com.osjager.componentscan.config;

import com.osjager.componentscan.filtertype.OsageFilterType;
import com.osjager.componentscan.service.OsageService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Author isjager
 *
 * 配置类上写 @ComponentScan 注解来进行包扫描
 *
 * 1、excludeFilters 排除用法：（排除 @Controller 和 OsageService）
 * 2、includeFilters 包含用法：（使用包含的用法，需要把 useDefaultFilters 设置为 false，true 表示扫描全部）
 *
 * @ComponentScan.Filter type 的类型
 *
 * 1、注解形式的：FilterType.ANNOTATION（@Controller、@Service、@Repository、@Component）
 * 2、指定类型的：FilterType.ASSIGNABLE_TYPE（OsageService.class）
 * 3、aspectj 类型的： FilterType.ASPECTJ
 * 4、正则类型的：FilterType.REGEX
 * 5、自定义类型：FilterType.CUSTOM
 */
@Configuration
/*@ComponentScan(basePackages = {"com.osjager.componentscan"}, excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {OsageService.class})
})*/
/*@ComponentScan(basePackages = {"com.osjager.componentscan"}, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class, Service.class})
}, useDefaultFilters = false)*/
/*@ComponentScan(basePackages = {"com.osjager.componentscan"}, includeFilters = {
		@ComponentScan.Filter(type = FilterType.CUSTOM, value = {OsageFilterType.class})
}, useDefaultFilters = false)*/
@ComponentScan(basePackages = {"com.osjager.componentscan"})
public class MainConfig {

}
