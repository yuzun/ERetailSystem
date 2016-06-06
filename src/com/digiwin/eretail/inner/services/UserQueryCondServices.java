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

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sun.util.logging.resources.logging;

import com.digiwin.eretail.inner.mapper.UserQueryCondMapper;
import com.digiwin.eretail.inner.model.UserQueryCond;
import com.digiwin.eretail.inner.model.UserQueryCondExample;
import com.digiwin.eretail.inner.model.UserQueryCondKey;

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

	private static Logger log = Logger.getLogger(UserServices.class);
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

	@Override
	public boolean addUserQueryCond(UserQueryCond userQueryCond) {
		try {
			userquerycondMapper.insert(userQueryCond);
		} catch (Exception e) {
			log.error("添加错误：" + e);
			return false;
		}
		return true;
		
	}

	@Override
	public boolean delUserQueryCondByKey(UserQueryCondKey userQueryCondKey) {
		try {
			userquerycondMapper.deleteByPrimaryKey(userQueryCondKey);
		} catch (Exception e) {
			log.error("删除错误：" + e);
			return false;
		}
		return true;
	}
}

