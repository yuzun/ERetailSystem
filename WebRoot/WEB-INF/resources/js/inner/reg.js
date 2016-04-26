/**
 * 注册js
 */
$(function () {
	//登录界面
	$('#reg').dialog({
		title: "注册", top: 250, width: 350, height: 400,
		autoVCenter: true,
        autoHCenter: true,
		modal : true,
		iconCls : 'icon-login',
		buttons : '#btn',
		
	});	
	//管理员帐号验证
	$('#userid').validatebox({
		required : true,
		validType: ['engNum','length[5,10]'],
		missingMessage : '请输入登陆工号',
	});	
	$('#username').validatebox({
		required : true,
		validType: ['chinese','length[2,5]'],
		missingMessage : '请输入姓名',
	});	
	//管理员密码验证
	$('#password').validatebox({
		required : true,
		validType : ['engNum','length[5,10]'],
		missingMessage : '请输入密码'
	});	
	//邮箱验证
	$('#email').validatebox({
		required : true,
		validType : 'email'
	});	
	//cellphone验证
	$('#cellphone').validatebox({
		required : true,
		validType : 'mobile'
	});
	//phone验证
	$('#phone').validatebox({
		required : true,
		validType : 'tel'
	});
	//QQ验证
	$('#QQ').validatebox({
		required : true,
		validType : 'qq'
	});	
	
	//单击登录
	$('#btnReg').click(function () {
		if (!$('#userid').validatebox('isValid')) {
			$('#userid').focus();
		} else if (!$('#password').validatebox('isValid')) {
			$('#password').focus();
		} else if (!$('#email').validatebox('isValid')) {
			$('#email').focus();
		} else if (!$('#cellphone').validatebox('isValid')) {
			$('#cellphone').focus();
		} else if (!$('#phone').validatebox('isValid')) {
			$('#phone').focus();
		} else if (!$('#QQ').validatebox('isValid')) {
			$('#QQ').focus();
		} else {
			$.ajax({
				url : 'inner/regdo',
				type : 'post',
				data : {
					userId : $('#userid').val(),
					userName : $('#username').val(),
					password : $('#password').val(),
					email : $('#email').val(),
					cellphone : $('#cellphone').val(),
					phone : $('#phone').val(),
					qq : $('#QQ').val(),
				},
				beforeSend : function () {
					$.messager.progress({
						text : '正在处理中...',
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
	
	$('#btnReset').click(function () {
		$("#userid").value = '';
		$("#username").value = '';
		$("#password").value = '';
		$("#email").value = '';
		$("#cellphone").value = '';
		$("#phone").value = '';
		$("#QQ").value = '';
	});
	
});