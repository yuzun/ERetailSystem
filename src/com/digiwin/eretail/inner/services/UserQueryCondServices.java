/**
 * Project Name:ERetailSystem
 * File Name:UserQueryCondServices.java
 * Package Name:com.digiwin.eretail.inner.services
 * Date:2016年4月18日下午4:10:39
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digiwin.eretail.inner.mapper.UserQueryCondMapper;
import com.digiwin.eretail.inner.model.UserQueryCond;
import com.digiwin.eretail.inner.model.UserQueryCondExample;

/**
 * ClassName:UserQueryCondServices <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年4月18日 下午4:10:39 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */

@Service
public class UserQueryCondServices implements IUserQueryCondServices {

	@Autowired
	private UserQueryCondMapper userquerycondMapper;
	
	@Override
	public List<UserQueryCond> getAllUserQueryConds(String userId,
			String ticketId) {
		UserQueryCondExample example = new UserQueryCondExample();
		example.createCriteria().andUseridEqualTo(userId)
								.andTicketidEqualTo(ticketId);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("ticketId", ticketId);
		return userquerycondMapper.selectByExample(example);
	}

}

