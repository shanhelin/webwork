

layui.use('form', function(){
	var form = layui.form;
});

$(function() {
	$("#loginButton").click(function() {
		var ident = $("#ident").val();
		var username = $("#username").val();
		var password=$("#password").val()
		if (username === "") {
			alert("请输入用户名");
			return;
		} else if ( password=== "") {
			alert("请输入密码");
			return;
		} else if (ident === "") {
			alert("请选择你的身份");
			return;
		}
		dldata={"username": username,"password":password,"ident": ident};
		var data=JSON.stringify(dldata);

		$.ajax({
			type: "post",
			url: "/loginUser",
			data: data,
			contentType:"application/json",
			dataType:"json",
			success: function(result) {
				if (result === 1) {
					$.cookie("username", username);
					$.cookie("ident", ident);
					if (ident === "0") {
						window.location.href = "/indexStudent";
					} else if (ident === "1") {
						window.location.href = "/indexTeacher";
					} else if (ident === "2") {
						window.location.href = "/indexAdmin";
					}
				} else if (result === 0) {
					alert("用户名或密码错误");
					$("#loginForm")[0].reset();
				}
			},
			error: function() {
				console.log("error");
				alert("登录失败，请稍后再试")
			}
		});
	});
});



