/**
 * 通用js函数处理
 */

//弹出设置userQueryCond用户查询条件框
function addUserQueryCond(userId, ticketId, table){
	$.easyui.showDialog({
        title: "添加-修改查询条件",
        width: 600, height: 420, topMost: false,
        minWidth: 400, minHeight: 300,
        enableApplyButton: false,
        href: "inner/getUserQueryCondPage?table=" + table,
        onSave: function (d) {
            var validate = d.form("validate");
            if (validate) {
            	var rowData = $('#queryTable').datagrid('getData').rows;
            	var queryName = $('#queryName').val();
            	//console.log($('#queryTable').datagrid('getChanges', 'inserted'));  
            	var cond = '';
            	for(var i=0; i<rowData.length;i++){
            		cond = cond == '' ? '0;' + rowData[i]['fieldname'] + ',' + rowData[i]['operator'] + ',' + rowData[i]['value1'] + ',' + rowData[i]['value2'] :
        				cond + ';' + rowData[i]['fieldname'] + ',' + rowData[i]['operator'] + ',' + rowData[i]['value1'] + ',' + rowData[i]['value2'];
            	}
            	console.log(cond);
                //$.easyui.showOption(d.form("getData"), { title: "您输入的数据为" });
            	$.ajax({
            		url: 'userQueryCond/addQueryCond',
            		async: false, //同步请求
            		type: 'POST',
            		data: 'userId=' + userId + '&ticketId=' + ticketId + '&queryName=' + queryName + '&cond=' + cond,
            		success: function(data){
            			$.messager.show({icon: 'info', msg: '增加自定义查询条件成功！', position: "topCenter" });
            			$("#tt").tree('reload');
            		},
            		error: function(){
            			$.messager.show({icon: 'error', msg: '增加自定义查询条件失败！', position: "topCenter" });
            		}
            	});
            } else {
                return false;
            }
        },
    });
}

function delUserQueryCond(userId, ticketId, serial){
	$.ajax({
		url: 'userQueryCond/delQueryCond',
		async: true, //同步请求
		type: 'POST',
		data: 'userId=' + userId + '&ticketId=' + ticketId + '&serial=' + serial,
		success: function(data){
			$.messager.show({icon: 'info', msg: '删除用户自定义查询条件成功！', position: "topCenter" });
			$("#tt").tree('reload');
		},
		error: function(){
			$.messager.show({icon: 'error', msg: '删除用户自定义查询条件失败！', position: "topCenter" });
		}
	});
}

function addQuoteForString(value){
	return "'" + value + "'";
}

//根据不同的条件组成sql语句
//cond:格式：类型;字段，操作符，搜索值;字段，操作符，搜索值
//     格式：0代表设计，1代表自定义，及自己写sql条件
//     操作符：> < = <> 相似于 之间(b)
//cond eg: 1；userId，=，yuzheng;
function getWhereSqlByCond(cond) {
	if (cond == '') return '';
	var condArray = cond.split(';');
	var condTemp = [];
	var result = '';
	if (condArray[0] == '0'){//如果是设计则解析条件
		for(var i=1; i<condArray.length;i++){
			condTemp = condArray[i].split(',');
			if (condTemp[1] == 'b'){
				result = result == '' ? 
						('(' + condTemp[0] + ' between ' + addQuoteForString(condTemp[2]) + ' and ' + addQuoteForString(condTemp[3]) + ')') :
							(' and (' + condTemp[0] + ' between ' + addQuoteForString(condTemp[2]) + ' and ' + addQuoteForString(condTemp[3]) + ')');
			} else {
				if (condTemp[1] == 'like'){
					result = result == '' ? 
							('(' + condTemp[0] + ' ' + condTemp[1] + ' ' + addQuoteForString('%' + condTemp[2] + '%') + ')') :
								(' and (' + condTemp[0] + ' ' + condTemp[1] + ' ' + addQuoteForString('%' + condTemp[2] + '%') + ')');
				} else {
					result = result == '' ? 
							('(' + condTemp[0] + ' ' + condTemp[1] + ' ' + addQuoteForString(condTemp[2]) + ')') :
								(' and (' + condTemp[0] + ' ' + condTemp[1] + ' ' + addQuoteForString(condTemp[2]) + ')');
				}
				
			}
		}
		return result;
	} else if(condArray[0] == '1'){//如果是自定义则直接返回
		return cond;
	}
	
}

//根据条件返回数据
function getDataByCond(node, turl){
	var cond = getWhereSqlByCond(node.attributes);
	var userJson;
	$.ajax({
		url: turl,
		async: false, //同步请求
		type: 'POST',
		data: {'cond': cond},
		success: function(data){
			userJson = data;
		},
		error: function(){
			$.messager.show({icon: 'error', msg: '请求数据失败！', position: "topCenter" });
		}
	});
	return userJson;
}