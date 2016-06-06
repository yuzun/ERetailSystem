/**
 * Project Name:ERetailSystem
 * File Name:LoginController.java
 * Package Name:com.digiwin.eretail.inner.controller
 * Date:2016年4月5日下午5:26:43
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.digiwin.eretail.inner.model.TableInfo;
import com.digiwin.eretail.inner.model.User;
import com.digiwin.eretail.inner.services.ICommonSQLServices;
import com.digiwin.eretail.inner.services.IUserServices;

/**
 * ClassName:LoginController <br/>
 * Date:     2016年4月5日 下午5:26:43 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */

@Controller
@RequestMapping("/inner")
public class UserController {
	private static Logger log = Logger.getLogger(UserController.class);
	@Autowired
	private IUserServices userServices;
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private ICommonSQLServices commonSQLServices;
	
	@RequestMapping("/index")
	public String index(){
		return "inner/index";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "inner/login";
	}
	
	@RequestMapping("/checkLogin")
	@ResponseBody
	public String loginCheck(String userid, String password){
		User user = userServices.loginCheck(userid, password);
		if (user != null){//登陆成功
//			model.addAttribute("user", user);
			request.getSession().setAttribute("user", user);
			return "inner/index";
		}
		return "用户名或密码错误"; 
		
	}
	
	@RequestMapping("/reg")
	public String reg(){
		return "inner/reg";
	}
	
	/**
	 * 注册处理
	 * @author 余正
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping("/regdo")
	@ResponseBody
	public String regdo(User user){
		if (userServices.addUser(user)) {
			request.getSession().setAttribute("user", user);
			return "inner/index";
		}
		return "注册失败";
	}

	@RequestMapping("/user")
	public String getUserPage(){
		return "inner/user";
	}
	
	@RequestMapping("/common")
	public String getCommonPage(){
		return "inner/common";
	}
	
	/**
	 * 查看用户信息
	 * @author 余正
	 * @return
	 * @since JDK 1.7
	 */
	@RequestMapping("/userList")
	@ResponseBody
	public Object getUserList(){
		List<User> users = userServices.getUserList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", 50);
		map.put("rows", users);
		String result = JSON.toJSONString(map);
		log.debug(result);
		return JSONObject.parseObject(result);
	}

	@RequestMapping("/userListByCond")
	@ResponseBody
	public Object getUserListByCond(String cond){
		log.debug(cond);
		List<User> users = userServices.getUserListByCond(cond);
		Map<String, Object> map = new HashMap<String, Object>();
		if(users == null){
			map.put("total", 0);
			map.put("rows", null);
		} else{
			map.put("total", users.size());
			map.put("rows", users);
		}
		String result = JSON.toJSONString(map);
		log.debug(result);
		return JSONObject.parseObject(result);
	}
	
	@RequestMapping("/getUserQueryCondPage")
	public String getUserQueryCondPage(Model model, String table){
		List<TableInfo> list = commonSQLServices.getAllFields(table);
		String result = JSON.toJSONString(list);
		JSONArray array = JSON.parseArray(result);
		log.debug(result);
		model.addAttribute("fieldList", array);
		return "inner/userQueryForm";
	}
}

