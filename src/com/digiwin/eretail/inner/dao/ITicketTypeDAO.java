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

import com.digiwin.eretail.inner.model.TicketType;
import com.digiwin.eretail.inner.model.User;

/**
 * ClassName:IUserDAO <br/>
 * Date:     2016年4月5日 下午2:33:14 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface ITicketTypeDAO {

	public void addTicketType(TicketType ticketType) throws Exception;
	
	public void updateTicketType(TicketType ticketType) throws Exception;
	
	public void delTicketTypeByID(String ticketTypeID) throws Exception;
	
	public User getTicketTypeByID(String ticketTypeID) throws Exception;
	
	public List<User> getAllTicketType() throws Exception;
	
	public List<User> getTicketTypeByPage(HashMap<String, Object> map) throws Exception;
	
	public int getTicketTypeCount() throws Exception;
}

