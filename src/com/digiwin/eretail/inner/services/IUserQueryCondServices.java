/**
 * Project Name:ERetailSystem
 * File Name:IUserQueryCondServices.java
 * Package Name:com.digiwin.eretail.inner.services
 * Date:2016年4月18日下午4:07:49
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.services;

import java.util.List;

import com.digiwin.eretail.inner.model.UserQueryCond;

/**
 * ClassName:IUserQueryCondServices <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年4月18日 下午4:07:49 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface IUserQueryCondServices {

	public List<UserQueryCond> getAllUserQueryConds(String userId, String ticketId);
}

