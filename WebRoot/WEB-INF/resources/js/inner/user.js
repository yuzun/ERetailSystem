/**
 * 用户信息js
 */

$(function() {
	var columnFilter = {
		panelHeight : 30,
		position : "top"
	};

	var tt = $("#tt").tree({
		method : "get",
		url : turl,
		onClick: function(node) {
			var data = getDataByCond(node, url);
			$("#t1").datagrid("loadData")
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
								},
								{
									field : 'operator',
									title : '测试(不存在的字段)',
									width : 120,
									formatter : function(val, row, index) {
										return "<a class='l-btn l-btn-plain'><span class='l-btn-left'><span class='l-btn-text icon-ok l-btn-icon-left'>操作</span></span></a>";
									}
								} ] ],
						//columnFilter: columnFilter,
						enableHeaderClickMenu : false,
						enableHeaderContextMenu : false,
						enableRowContextMenu : false,
						toolbar : [ {
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
						/* rowContextMenu: [
						    {
						        text: "平均身高", iconCls: "", handler: function (e, index, row) {
						            var val = t.datagrid("getRows").avg(function (r) { return r.Height; }).round(2);
						            $.easyui.messager.show("平均身高为：" + val);
						        }
						    },
						    {
						        text: "体重总和", iconCls: "icon-standard-sum", handler: function (e, index, row) {
						            var val = t.datagrid("getRows").sum(function (r) { return r.Weight; }).round(2);
						            $.easyui.messager.show("体重总和为：" + val);
						        }
						    },
						], */
						onLoadSuccess : function() {
							var t = $(this), col = t.datagrid("getColumnDom",
									"operator"), rows = t.datagrid("getRows");
							col.find("a.l-btn").each(function(i, ele) {
								$(this).click(function(e) {
									alert(rows[i].Name);
									e.stopPropagation();
								});
							});
						}
					});

	/* $("#test").click(function(){
		alert("test");
		t.datagrid("setColumnFilter", columnFilter);
		console.log($("#t1").datagrid("getRows"));
	}); */
});