/**
 * Project Name:ERetailSystem
 * File Name:IUserDAO.java
 * Package Name:com.digiwin.eretail.inner.dao
 * Date:2016年4月5日下午2:33:14
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.dao;

import java.util.HashMap;
import java.util.List;

import com.digiwin.eretail.inner.model.User;

/**
 * ClassName:IUserDAO <br/>
 * Date:     2016年4月5日 下午2:33:14 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface IUserDAO {

	public void addUser(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public void delUserByID(String userID) throws Exception;
	
	public User getUserByID(String userID) throws Exception;
	
	public List<User> getAllUser() throws Exception;
	
	public List<User> getUserByPage(HashMap<String, Object> map) throws Exception;
	
	public int getUserCount() throws Exception;
	
	public User getUserByIdAndPsw(User user) throws Exception;
}

