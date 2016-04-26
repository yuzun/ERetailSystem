/**
 * Project Name:ERetailSystem
 * File Name:IUserQueryCond.java
 * Package Name:com.digiwin.eretail.inner.dao
 * Date:2016年4月18日下午3:23:05
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.dao;

import java.util.List;
import java.util.Map;

import com.digiwin.eretail.inner.model.UserQueryCond;

/**
 * ClassName:IUserQueryCond <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年4月18日 下午3:23:05 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface IUserQueryCondDAO {

	public void addUserQueryCond(UserQueryCond userQueryCond);
	
	public void delUserQueryCond(Map<String, Object> map);
	
	public List<UserQueryCond> getAllUserQueryCond(Map<String, Object> map);
}

