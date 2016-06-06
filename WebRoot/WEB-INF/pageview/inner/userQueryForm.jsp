<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<script type="text/javascript">
	var fieldList = ${requestScope.fieldList};
	//var fieldList = JSON.parse('[{"text":"用户编号","value":"userId"},{"text":"用户名称","value":"userName"},{"text":"用户密码","value":"password"},{"text":"邮箱","value":"email"},{"text":"手机号码","value":"cellphone"},{"text":"座机号码","value":"phone"},{"text":"部门ID","value":"departId"},{"text":"状态","value":"status"},{"text":"备注","value":"comment"},{"text":"QQ","value":"qq"}]');
	//console.log("${fieldList}");
	//console.log(fieldList);
	//var fieldList = [{"text":"用户编号","value":"userId"},{"text":"用户名称","value":"userName"},{"text":"用户密码","value":"password"},{"text":"邮箱","value":"email"},{"text":"手机号码","value":"cellphone"},{"text":"座机号码","value":"phone"},{"text":"部门ID","value":"departId"},{"text":"状态\r\n   0 注册\r\n   1 在用\r\n   2 停用","value":"status"},{"text":"备注","value":"comment"},{"text":"QQ","value":"qq"}];
	$(function() {
		var operators = [{ "value": ">", "text": "大于" },  
						 { "value": "<", "text": "小于" },
						 { "value": "=", "text": "等于" },
						 { "value": "<>", "text": "不等于" },
						 { "value": "like", "text": "相似于" },
						 { "value": "b", "text": "之间" }];
	
		var getRow = function() {
			return {
				fieldname : fieldList[0]['value'],
				operator : '>',
				value1 : '',
				value2 : ''
			};
		};
		var queryGrd = $('#queryTable').datagrid({
			striped: true,
			selectOnCheck: false,
			columns : [ [ {
				field : 'fieldname',
				title : '字段名称',
				width : 100,
				editor : {
						type: 'combobox', options: { data: fieldList, valueField: "value", textField: "text",readOnly: true } 
					}
			}, {
				field : 'operator',
				title : '操作符',
				width : 60,
				editor : {
						type: 'combobox', options: { data: operators, valueField: "value", textField: "text",readOnly: true } 
					}
			}, {
				field : 'value1',
				title : '值1',
				width : 100,
				align : 'right',
				editor : {
						type: 'validatebox', options: { required : true } 
					}
			}, {
				field : 'value2',
				title : '值2',
				width : 100,
				align : 'right',
				editor : "text"
			} ] ],
			toolbar : [ {
				text : '新增一行',
				iconCls : 'icon-add',
				handler : function() {
					queryGrd.datagrid("appendRow", getRow());
				}
			}, '-', {
				text : '删除一行',
				iconCls : 'icon-remove',
				handler : function() {
					var row = queryGrd.datagrid("getSelected");
					if (row == null) return;	
					var index = queryGrd.datagrid("getRowIndex", row);	
					queryGrd.datagrid("deleteRow",index);
				}
			} ],
			rowContextMenu : [ {
				text : "编辑",
				iconCls : "icon-edit",
				handler : function(e, index) {
					queryGrd.datagrid("beginEdit", index);
				}
			} ],
			onDblClickCell: function(index,field,value){
				var ed = $(this).datagrid('getEditor', {index:index,field:field});
				//$(ed.target).
			},
			
			autoFocusField : "fieldname",
			rownumbers: true,
			singleSelect: true,
			autoEditing : false, //该属性启用双击行时自定开启该行的编辑状态
			extEditing : true, //该属性启用行编辑状态的 ExtEditing 风格效果，该属性默认为 true。
			singleEditing : true
		//该属性启用datagrid的只允许单行编辑效果，该属性默认为 true。

		});

	});
	window.onbeforeunload = function() {
		alert(queryGrd.datagrid('getData'));
	}
</script>
	<div id=editpanel data-options="region:'north',split:true"
		style="height:30px; margin-top: 6px">
		<span style="margin-left: 15px">查询名称：</span><input id="queryName" name="queryName"
			type="text" class="easyui-validatebox"
			data-options="required: true,autoFocus: true" style="height: 25px" />
	</div>

	<div id=grdpanel data-options="region:'center', fit:true">
		<table id="queryTable"></table>
	</div>
