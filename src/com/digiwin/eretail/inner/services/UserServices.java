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

import com.digiwin.eretail.inner.dao.IUserDAO;
import com.digiwin.eretail.inner.model.User;

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
	private IUserDAO userDAO;
	@Override
	public User loginCheck(String userid, String password) {
		
		User user = new User();
		user.setUserId(userid);
		user.setPassword(password);
		
		User newUser = null;
		try {
			newUser = userDAO.getUserByIdAndPsw(user);
		} catch (Exception e) {	
			log.error("登陆错误：" + e);
		}
		return newUser;
		
	}
	@Override
	public boolean AddUser(User user) {
		try {
			userDAO.addUser(user);
		} catch (Exception e) {
			log.error("添加错误：" + e);
			return false;
		}
		return true;
	}
	@Override
	public List<User> getUserList() {
		try {
			return userDAO.getAllUser();
		} catch (Exception e) {
			log.error("获取用户信息错误：" + e);
			return null;
		}
	}

}

