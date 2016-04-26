/**
 * Project Name:ERetailSystem
 * File Name:UserQueryCond.java
 * Package Name:com.digiwin.eretail.inner.model
 * Date:2016年4月18日下午3:23:49
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.model;
/**
 * ClassName:UserQueryCond <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年4月18日 下午3:23:49 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class UserQueryCond {
	
	private String userId;
	private String ticketId;
	private int serial;
	private String queryName;
	private String queryCond;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getQueryName() {
		return queryName;
	}
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	public String getQueryCond() {
		return queryCond;
	}
	public void setQueryCond(String queryCond) {
		this.queryCond = queryCond;
	}
	
	
}

