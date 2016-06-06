/**
 * Project Name:ERetailSystem
 * File Name:ICommonSQLServices.java
 * Package Name:com.digiwin.eretail.inner.services
 * Date:2016年6月1日下午5:43:57
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.digiwin.eretail.inner.services;

import java.util.List;

import com.digiwin.eretail.inner.model.TableInfo;

/**
 * ClassName:ICommonSQLServices <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年6月1日 下午5:43:57 <br/>
 * @author   余正
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface ICommonSQLServices {
	public List<TableInfo> getAllFields(String table);
}

