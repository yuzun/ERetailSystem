<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>欢迎使用易成内部管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/js/easyui/jquery-easyui-theme/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/js/easyui/jquery-easyui-theme/icon.css" />
<link href="<%=path%>/resources/js/easyui/icons/icon-all.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/inner/login.css" />
<script src="<%=path%>/resources/js/easyui/jquery/jquery-1.11.1.js" type="text/javascript"></script>
<script type="text/javascript"
	src="<%=path%>/resources/js/easyui/jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=path%>/resources/js/easyui/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js" ></script>
<script src="<%=path%>/resources/js/easyui/jquery.jdirk.js" type="text/javascript"></script>
<script src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.js" type="text/javascript"></script>

<script type="text/javascript" src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.validatebox.js"></script>
<script type="text/javascript" src="<%=path%>/resources/js/easyui/jeasyui-extensions/jeasyui.extensions.dialog.js"></script>
<script type="text/javascript" src="<%=path%>/resources/js/inner/login.js"></script>

</head>

<body>
	<div id="login"> 
		<p>登陆工号：<input type="text" id="userid" class="textbox" value="admin"></p>
		<p>登陆密码：<input type="password" id="password" class="textbox" value="admin"></p>
	</div>

	<div id="btn">
		<a id="btnReg" href="#" class="easyui-linkbutton">注册</a>
		<a id="btnLogin" href="#" class="easyui-linkbutton">登录</a>
	</div>

  </body>
</html>
