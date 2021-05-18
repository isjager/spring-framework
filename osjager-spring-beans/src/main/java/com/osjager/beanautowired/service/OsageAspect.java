package com.osjager.beanautowired.service;

import com.osjager.beanautowired.dao.OsageLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author isjager
 */
@Component
public class OsageAspect {

	private OsageLog osageLog;

	public OsageLog getOsageLog() {
		return osageLog;
	}

	/**
	 * 标注 set 方法
	 */
//	@Autowired
	public void setOsageLog(OsageLog osageLog) {
		this.osageLog = osageLog;
	}

	/**
	 * 标注构造方法
	 */
//	@Autowired
	public OsageAspect(OsageLog osageLog) {
		this.osageLog = osageLog;
	}

	@Override
	public String toString() {
		return "OsageAspect{" +
				"osageLog=" + osageLog +
				'}';
	}
}
