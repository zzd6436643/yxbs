<%@ page contentType="text/html;charset=UTF-8"%><%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%><!doctype html><html><head><%@ include file="/WEB-INF/jsp/common/meta.jsp"%><title><decorator:title /> | yxbs</title><script src="${ctx}/resources/js/lib/jquery/jquery-1.8.3.min.js" type="text/javascript"></script><script src="${ctx}/resources/js/lib/json2/json2.js" type="text/javascript"></script><link rel="stylesheet" href="${ctx}/resources/js/lib/bootstrap/css/bootstrap.css" /><script src="${ctx}/resources/js/lib/bootstrap/js/bootstrap.js" type="text/javascript"></script><!-- Le HTML5 shim, for IE6-8 support of HTML5 elements --><!--[if lt IE 9]>  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script><![endif]--><link rel="shortcut icon" href="/resources/images/depp.png" type=""><decorator:head /><style type="text/css">body {	padding-top: 60px;	padding-bottom: 40px;}.sidebar-nav {	padding: 9px 0;}</style></head><body id="mainframe">	<div class="navbar navbar-fixed-top navbar-inverse">		<div class="navbar-inner">			<div class="container-fluid">				<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>				</a> <a class="brand" href="#">yxbs</a>				<div class="nav-collapse">					<ul class="nav">						<li class="active"><a href="${ctx}/index/login">主页</a></li>						<li><a href="${ctx}/index/about">关于</a></li>						<li><a href="${ctx}/bbs/index">魔力红社区</a></li>						<li><a href="#contact">联系我们</a></li>					</ul>					<p class="navbar-text pull-right">						<sec:authentication property="principal" var="authentication"/>						欢迎您回来，${authentication.username } <a href="${ctx}/j_spring_security_logout">退出登录</a>					</p>				</div>			</div>		</div>	</div>	<div class="container-fluid">		<div class="row-fluid">			<div class="span2">				<div class="well sidebar-nav">					<ul class="nav nav-list" style="text-align: right; font-size: 16pt;">						<li><a class="active" href="${ctx}/userMgr/main">用户管理</a></li>						<li><a href="">菜单2</a></li>					</ul>				</div>			</div>			<div class="span10">				<decorator:body />			</div>		</div>	</div>	<footer style="text-align: center; margin: 10px 0;">		<p>Copyright@2013-2018 jzw 版权所有</p>	</footer></body></html>
