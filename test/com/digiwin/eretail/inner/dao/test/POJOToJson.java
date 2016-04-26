/**
 * Project Name:ERetailSystem
 * File Name:POJOToJson.java
 * Package Name:com.digiwin.eretail.inner.dao.test
 * Date:2016年4月14日下午2:18:05
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.dao.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.digiwin.eretail.inner.model.User;

/**
 * ClassName:POJOToJson <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年4月14日 下午2:18:05 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class POJOToJson {

	@Test
	public void testToJson(){
		List<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setUserId("admin");
		user1.setUserName("管理员");
		user1.setCellphone("13324");
		user1.setDepartId("23");
		user1.setEmail("sdfsg@sdfds.com");
		users.add(user1);
		User user2 = new User();
		user2.setUserId("admin");
		user2.setUserName("管理员");
		user2.setCellphone("13324");
		user2.setDepartId("23");
		user2.setEmail("sdfsg@sdfds.com");
		users.add(user2);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", 55);
		map.put("rows", users);
		
		System.out.println(JSON.toJSON(map));
	}
}

