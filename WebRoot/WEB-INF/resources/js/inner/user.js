/**
 * 用户信息js
 */

function addQueryCond(){
	addUserQueryCond(userId, 'user','user');
}

function delQueryCond(){
	if(serial != 0){
		 $.messager.confirm("您确定要删除该项吗？", function (c) { 
			 if(c){
				 delUserQueryCond(userId, 'user', serial);
			 }
		 });
	} else {
		$.messager.show({icon: 'error', msg: '请先选择条件节点！', position: "topCenter" });
	}
}

$(function() {
	var columnFilter = {
		panelHeight : 30,
		position : "top"
	};

	
	var tt = $("#tt").tree({
		method : "get",
		url : turl,
		onClick: function(node) {
			var aUrl = 'inner/userListByCond';
//			var cond = getWhereSqlByCond(node.attributes);
//			$.ajax({
//				url: aUrl,
//				async: false, //同步请求
//				type: 'POST',
//				data: 'cond=' + cond,
//				success: function(data){
//					console.log(data);
//					$("#t1").datagrid("loadData", data);
//				},
//				error: function(){
//					alert('请求数据失败');
//				}
//			});
			serial = node.id;
			var data = getDataByCond(node, aUrl);
			$("#t1").datagrid("loadData", data);
		}
	});

	var t = $("#t1")
			.datagrid(
					{
						title : '用户信息',
						//width : 1120,
						//height : 600,
						//method : "get",
						//url : "inner/userList",
						idField : 'userid',
						remoteSort : false,
						rownumbers : true,
						//pagination : true,
						offset : {
							width : -30,
							height : -50
						},
						frozenColumns : [ [ {
							field : 'ck',
							checkbox : true
						}, {
							field : 'userid',
							title : '编号',
							width : 80,
							sortable : true
						} ] ],
						columns : [ [
								{
									field : 'username',
									title : '姓名',
									width : 140,
									filter : "livebox"
								},
								{
									field : 'email',
									title : '邮箱',
									width : 140,
									filter : "checkbox"
								},
								{
									field : 'cellphone',
									title : '手机号码',
									width : 140,
									filter : "livebox"
								},
								{
									field : 'phone',
									title : '座机号码',
									width : 140,
									filter : "livebox"
								},
								{
									field : 'qq',
									title : 'qq号码',
									width : 180,
									filter : "livebox"
								}
//								,
//								{
//									field : 'operator',
//									title : '测试(不存在的字段)',
//									width : 120,
//									formatter : function(val, row, index) {
//										return "<a class='l-btn l-btn-plain'><span class='l-btn-left'><span class='l-btn-text icon-ok l-btn-icon-left'>操作</span></span></a>";
//									}
//								} 
					] ],
						//columnFilter: columnFilter,
						enableHeaderClickMenu : false,
						enableHeaderContextMenu : false,
						enableRowContextMenu : false,
						singleSelect: true,
						toolbar : [ 
						{
							text : '新增',
							iconCls : 'icon-add',
							handler : function() {
								$('#containerTabs').tabs('select',1);
							}
						}, '-',
						{
							text : '更改',
							iconCls : 'icon-edit',
							handler : function() {
								t.datagrid("setColumnFilter", columnFilter);
							}
						}, '-',
						{
							text : '删除',
							iconCls : 'icon-remove',
							handler : function() {
								t.datagrid("setColumnFilter", columnFilter);
							}
						}, '-',
						{
							text : '显示过滤项',
							iconCls : 'icon-filter',
							handler : function() {
								t.datagrid("setColumnFilter", columnFilter);
							}
						}, '-', {
							text : '隐藏过滤项',
							iconCls : 'icon-undo',
							handler : function() {
								t.datagrid("setColumnFilter");
							}
						} ],
//						onLoadSuccess : function() {
//							var t = $(this), col = t.datagrid("getColumnDom",
//									"operator"), rows = t.datagrid("getRows");
//							col.find("a.l-btn").each(function(i, ele) {
//								$(this).click(function(e) {
//									alert(rows[i].Name);
//									e.stopPropagation();
//								});
//							});
//						}
					});

	/* $("#test").click(function(){
		alert("test");
		t.datagrid("setColumnFilter", columnFilter);
		console.log($("#t1").datagrid("getRows"));
	}); */
});