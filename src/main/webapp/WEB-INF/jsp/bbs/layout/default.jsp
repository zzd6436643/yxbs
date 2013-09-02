<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<!doctype html>
<html>
<title>魔力红社区</title>
<head>
<%@ include file="/WEB-INF/jsp/common/meta.jsp"%>
<link rel="stylesheet" href="${ctx}/resources/css/blog.css" />
<script src="${ctx}/resources/js/bbs/kindeditor-min.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/lib/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/lib/json2/json2.js" type="text/javascript"></script>
<link rel="stylesheet" href="${ctx}/resources/js/lib/bootstrap/css-bbs/bootstrap.css" />
<link rel="stylesheet" href="${ctx}/resources/js/lib/bootstrap/css-bbs/bootstrap-theme.css" />
<script src="${ctx}/resources/js/lib/bootstrap/js-bbs/bootstrap.js" type="text/javascript"></script>
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
<![endif]-->
<link rel="shortcut icon" href="/resources/images/depp.png" type="">
<decorator:head />
</head>

<body id="mainframe">
	<div class="container-narrow">
      <div class="masthead">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="#">Home</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
        <h3 class="muted">Hello world</h3>
      </div>
      <hr>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-12" >
				<span class="glyphicon glyphicon-align-right"></span><small>今日：|昨日：|贴子：|会员：</small><span class="glyphicon glyphicon-align-left"></span>
			</div>
		</div>
		<div class="row">
			<decorator:body />
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-info">
						<div class="panel-heading">
							<span class="glyphicon  glyphicon-heart"></span>
							在线人数
						</div>
						<div class="panel-body">
						</div>
				</div>
			</div>
		</div>
	</div>
	
	<footer style="text-align: center; margin: 10px 0;">
		<p>Copyright@2013-2018 jzw 版权所有</p>
	</footer>
</body>
</html>
