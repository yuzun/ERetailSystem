/**
 * 登陆验证
 */
$(function () {
	//登录界面
	$('#login').dialog({
		title: "登录", top: 250, width: 300, height: 180,
		autoVCenter: true,
        autoHCenter: true,
		modal : true,
		iconCls : 'icon-login',
		buttons : '#btn',
		autoCloseOnEsc: true,
		
	});	
	//管理员帐号验证
	$('#userid').validatebox({
		required : true,
		validType: 'engNum;length[5,10]',
		missingMessage : '请输入登陆工号'
	});	
	//管理员密码验证
	$('#password').validatebox({
		required : true,
		validType : 'engNum;length[5,10]',
		missingMessage : '请输入密码'
	});	
	//加载时判断验证
	if (!$('#userid').validatebox('isValid')) {
		$('#userid').focus();
	} else if (!$('#password').validatebox('isValid')) {
		$('#password').focus();
	}	
	
	//单击登录
	$('#btnLogin').click(function () {
		if (!$('#userid').validatebox('isValid')) {
			$('#userid').focus();
		} else if (!$('#password').validatebox('isValid')) {
			$('#password').focus();
		} else {
			$.ajax({
				url : 'inner/checkLogin',
				type : 'post',
				data : {
					userid : $('#userid').val(),
					password : $('#password').val(),
				},
				beforeSend : function () {
					$.messager.progress({
						text : '正在登录中...',
					});
				},
				success : function (data, response, status) {
					$.messager.progress('close');
					if(data != 'inner/index'){
						$.messager.alert(data);
					}else{
						window.location.href = data;
					}
				}
			});
		}
	});
	
	$('#btnReg').click(function () {
		window.location.href = "inner/reg";
	});
	
});







