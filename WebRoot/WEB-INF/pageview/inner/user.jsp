<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<script type="text/javascript">
		var turl = "userQueryCond/getAllQueryCond?userId="
			+ "${sessionScope.user.userid}" + "&ticketId=user";
	</script>
<script src="<%=path%>/resources/js/inner/common.js" type="text/javascript"></script>
<script src="<%=path%>/resources/js/inner/user.js" type="text/javascript"></script>
<div id="cc" class="easyui-layout" data-options="fit:true">
	
	<div id=condPanel
			data-options="region:'west',title:'条件',split:true,tools: [{
        iconCls:'icon-add',
        handler:function(){
				addUserQueryCond();
			}
   		 },{
        iconCls:'icon-remove',
        handler:function(){

			}
   		 }] "
			style="width:150px;">
				<ul id="tt"></ul>
			 </div>
		 <div id=demoPanel data-options="region:'center', fit:true">
				<table id="t1"></table>

		</div> 	
</div>