package com.osjager.beanautowired.service;

import com.osjager.beanautowired.dao.OsageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Autowired 自动装配
 *
 * @Author isjager
 */
@Service
public class BaiduService {

//	@Autowired
//	@Qualifier("osageDao")
	private OsageDao osageDao2;

	public OsageDao getOsageDao2() {
		return osageDao2;
	}

	// 标注在 set() 方法上
//	@Autowired
	public void setOsageDao2(OsageDao osageDao2) {
		this.osageDao2 = osageDao2;
	}

	// 标注在构造方法上
	@Autowired
	public BaiduService(OsageDao osageDao2) {
		this.osageDao2 = osageDao2;
	}

	@Override
	public String toString() {
		return "BaiduService{" +
				"osageDao2=" + osageDao2 +
				'}';
	}
}
