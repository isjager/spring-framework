package com.osjager.beanautowired.service;

import com.osjager.beanautowired.dao.OsageDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @Author isjager
 */
@Service
public class OsageService {

	/**
	 * @Resource 是不支持 @Primary 的
	 *
	 * @InJect（JSR330规范）需要导入jar包依赖，功能和支持 @Primary 功能，但是没有 Require=false 的功能
	 */
//	@Resource
	@Inject
	private OsageDao osageDao;

	public OsageDao getOsageDao() {
		return osageDao;
	}

	public void setOsageDao(OsageDao osageDao) {
		this.osageDao = osageDao;
	}

	@Override
	public String toString() {
		return "OsageService{" +
				"osageDao=" + osageDao +
				'}';
	}
}
