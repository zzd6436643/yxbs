<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="decorator" content="none">
<title>yxbs</title>
</head>
<body>
	<div id="loginpanel" align="center" style="padding-top: 200px;">
		<form name='loginForm' action='${ctx}/j_spring_security_check' method='POST'>
			<input type='text' name='j_username' value='' style='top: 176px;' /> <input type='password' name='j_password' value='' style='top: 235px;' /> <input type="submit"
				style="position: absolute; top: 310px;" id="btnlogin" value="login" />
		</form>
	</div>
</body>