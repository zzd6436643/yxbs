<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="decorator" content="none">
<title>yxbs</title>
<link rel="stylesheet" href="${ctx}/resources/js/lib/bootstrap/css/bootstrap.css" />
<script src="${ctx}/resources/js/lib/bootstrap/js/bootstrap.js" type="text/javascript"></script>
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
  <script src="${ctx}/resources/js/lib/bootstrap/js/html5shim.js" type="text/javascript"></script>
<![endif]-->
<style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }
</style>
<link rel="shortcut icon" href="/resources/images/depp.png" type="">
</head>
<body>
	<div class="container">

      <form class="form-signin" name='loginForm' action='${ctx}/j_spring_security_check' method='POST'>
        <h2 class="form-signin-heading">请登录</h2>
        <input type="text" class="input-block-level" name='j_username' placeholder="user name">
        <input type="password" class="input-block-level" name='j_password' placeholder="Password">
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> 记住我
        </label>
        <button class="btn btn-large btn-primary" type="submit" id="btnlogin">登录</button>
      </form>

    </div>
</body>