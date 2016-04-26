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

import com.digiwin.eretail.inner.model.Depart;
import com.digiwin.eretail.inner.model.User;

/**
 * ClassName:IUserDAO <br/>
 * Date:     2016年4月5日 下午2:33:14 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface IDepartDAO {

	public void addDepart(Depart depart) throws Exception;
	
	public void updateDepart(Depart depart) throws Exception;
	
	public void delDepartByID(String departID) throws Exception;
	
	public User getDepartByID(String departID) throws Exception;
	
	public List<User> getAllDepart() throws Exception;
	
	public List<User> getDepartByPage(HashMap<String, Object> map) throws Exception;
	
	public int getDepartCount() throws Exception;
}

