package com.osjager.beanautowired;

import com.osjager.beanautowired.config.MainConfig;
import com.osjager.beanautowired.service.BaiduService;
import com.osjager.beanautowired.service.OsageAspect;
import com.osjager.beanautowired.service.OsageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author isjager
 */
public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		OsageService osageService = ctx.getBean(OsageService.class);
		System.out.println(osageService.toString());

		Object obj = ctx.getBean("osageDao2");
		System.out.println(obj.toString());

		BaiduService baiduService = ctx.getBean(BaiduService.class);
		System.out.println(baiduService);

		OsageAspect osageAspect = ctx.getBean(OsageAspect.class);
		System.out.println(osageAspect);
	}
}
