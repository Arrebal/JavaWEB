<%@ page  language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登陆</title>
<style type="text/css">
.header {
	height: 100px;
	background-color: blue;
}

.a {
	margin-left: 40px;
	margin-top: 40px;
	text-align: center;
}

.button {
	background-color: blue;
	border: none;
	height: 40px;
	width: 80px;
}
</style>
</head>
<body>
	<h1 class="header" style="text-align: center">图书管理系统</h1>
	<h2 style="color: red; text-align: center; padding-top: 20px">登陆</h2>
	<form action="check.jsp" method="get" onsubmit="return check()">
		<table border="0" style="align: center; margin: auto;">
			<div class="a">
				用户名： <input type="text" name="user" id="user">
			</div>
			<div class="a">
				&nbsp;&nbsp;密码： &nbsp;&nbsp;<input type="password" name="password"
					id="password">
			</div>
			<div class="a">
				<button type="submit" class="button">登陆</button>
			</div>
		</table>
	</form>
</body>
<script type="text/javascript">
function check()
{
	var user=document.getElementById("user");
	var password=document.getElementById("password");
	if(user.value==""||mima.value=="")
		{
		alert("请把信息填写完整！");
		return false;
		}
}
</script>
</html>

