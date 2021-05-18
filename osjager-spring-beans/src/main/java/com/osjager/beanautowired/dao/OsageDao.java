package com.osjager.beanautowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @Repository 注册 Bean，或者在配置类中声明
 *
 * @Author isjager
 */
//@Repository(value = "osageDao2")
public class OsageDao {

	private int flag = 1;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "OsageDao{" +
				"flag=" + flag +
				'}';
	}
}
