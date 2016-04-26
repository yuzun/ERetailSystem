/**
 * Project Name:ERetailSystem
 * File Name:ILoginServices.java
 * Package Name:com.digiwin.eretail.inner.services
 * Date:2016年4月5日下午5:40:58
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.services;

import java.util.List;

import com.digiwin.eretail.inner.model.User;

/**
 * ClassName:ILoginServices <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年4月5日 下午5:40:58 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface IUserServices {

	public User loginCheck(String userid, String password);
	
	public boolean AddUser(User user);
	
	public List<User> getUserList();
}

