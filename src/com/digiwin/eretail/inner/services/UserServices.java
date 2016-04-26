/**
 * Project Name:ERetailSystem
 * File Name:LoginServices.java
 * Package Name:com.digiwin.eretail.inner.services
 * Date:2016年4月5日下午5:39:41
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digiwin.eretail.inner.mapper.UserMapper;
import com.digiwin.eretail.inner.model.User;
import com.digiwin.eretail.inner.model.UserExample;

/**
 * ClassName:LoginServices <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年4月5日 下午5:39:41 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */

@Service
public class UserServices implements IUserServices{

	private static Logger log = Logger.getLogger(UserServices.class);
	@Autowired
	private UserMapper userMapper;
	@Override
	public User loginCheck(String userid, String password) {
		
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUseridEqualTo(userid).
									 andPasswordEqualTo(password);
		List<User> newUser = null;
		try {
			newUser = userMapper.selectByExample(userExample);
		} catch (Exception e) {	
			log.error("登陆错误：" + e);
		}
		return newUser.get(0);
		
	}
	@Override
	public boolean AddUser(User user) {
		try {
			userMapper.insert(user);
		} catch (Exception e) {
			log.error("添加错误：" + e);
			return false;
		}
		return true;
	}
	@Override
	public List<User> getUserList() {
		try {
			return userMapper.selectByExample(null);
		} catch (Exception e) {
			log.error("获取用户信息错误：" + e);
			return null;
		}
	}

}

