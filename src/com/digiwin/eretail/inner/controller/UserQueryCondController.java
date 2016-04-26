/**
 * Project Name:ERetailSystem
 * File Name:UserQueryCondController.java
 * Package Name:com.digiwin.eretail.inner.controller
 * Date:2016年4月18日下午3:55:42
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sun.util.logging.resources.logging;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.digiwin.eretail.inner.model.UserQueryCond;
import com.digiwin.eretail.inner.services.IUserQueryCondServices;

/**
 * ClassName:UserQueryCondController <br/>
 * Date:     2016年4月18日 下午3:55:42 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */

@Controller
@RequestMapping("/userQueryCond")
public class UserQueryCondController {
	
	private Logger log = Logger.getLogger(UserQueryCondController.class);
	
	@Autowired
	private IUserQueryCondServices userQueryCondServices;
	
	@RequestMapping("/getAllQueryCond")
	@ResponseBody
	public Object getALLQueryCond(String userId, String ticketId){
		List<UserQueryCond> userQueryConds = userQueryCondServices.getAllUserQueryConds(userId, ticketId);
		JSONArray jsonArray = new JSONArray();
		//添加一個所有的
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", 0);
		jsonObject.put("text", "所有");
		jsonObject.put("iconCls", "icon-search");
		jsonObject.put("attributes", "");
		jsonArray.add(jsonObject);
		for (UserQueryCond userQueryCond : userQueryConds) {
			jsonObject = new JSONObject();
			jsonObject.put("id", userQueryCond.getSerial());
			jsonObject.put("text", userQueryCond.getQueryName());
			jsonObject.put("iconCls", "icon-search");
			jsonObject.put("attributes", userQueryCond.getQueryCond());
			jsonArray.add(jsonObject);
		}
		log.debug(jsonArray);
		return jsonArray;
	}

}

