package com.osjager.beanautowired.config;

import com.osjager.beanautowired.dao.OsageDao;
import com.osjager.beanautowired.dao.OsageLog;
import com.osjager.beanautowired.service.OsageAspect;
import com.osjager.beanautowired.service.OsageService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Autowired 自动装配
 *
 * 1、自动装配首先按照类型进行装配，若在 IOC 容器中发现多个相同类型的组件，那么就按照属性名称来进行装配
 * （比如：容器中有两个 OsageDao 类型的组件一个叫 osageDao，一个叫 osageDao2，那么通过 @Autowired 来修饰
 * 的属性名称时 osageDao，那么就加载容器的 osageDao 组件，若属性名称为 osageDao2 那么就加载 osageDao2 组件）
 *
 * 2、假设需要指定特定的组件来进行装配，可以通过使用 @Qualifier("osageDao") 来指定装配的组件或者在配置类上的
 * @Bean 加上 @Primary
 *
 * 3、假设容器中既没有 osageDao 和 osageDao2，那么在装配的时候就会抛出异常，若不想抛异常，需指定 required = false
 * （No qualifying bean of type 'com.osjager.beanautowired.dao.OsageDao' available）
 *
 * 4、@Resource（JSR250规范）：功能和@AutoWired的功能差不多一样，但是不支持@Primary 和@Qualifier的支持
 *
 * 5、@InJect（JSR330规范）：需要导入jar包依赖，功能和支持 @Primary 功能 ,但是没有Require=false的功能
 * <dependency>
 * 		<groupId>javax.inject</groupId>
 * 		<artifactId>javax.inject</artifactId>
 * 		<version>1</version>
 * </dependency>
 *
 * 6、使用 autowired 可以标注在方法上
 * - 标注在 set() 方法上
 * - 标注在构造方法上
 * - 标注在配置类上的入参中（可以不写）
 *
 *
 * @Author isjager
 */
@Configuration
@ComponentScan(basePackages = {"com.osjager.beanautowired"})
public class MainConfig {

	@Bean
	public OsageDao osageDao2() {
		OsageDao osageDao = new OsageDao();
		osageDao.setFlag(2);
		return osageDao;
	}

//	@Primary
	@Bean
	public OsageDao osageDao() {
		OsageDao osageDao = new OsageDao();
		osageDao.setFlag(1);
		return osageDao;
	}

//	@Bean(autowire = Autowire.BY_NAME)
//	@Bean(autowire = Autowire.BY_TYPE)
//	@Bean
	public OsageService osageService() {
		return new OsageService();
	}

	@Bean
	public OsageAspect osageAspect(@Autowired OsageLog osageLog) {
		OsageAspect osageAspect = new OsageAspect(osageLog);
		return osageAspect;
	}
}
