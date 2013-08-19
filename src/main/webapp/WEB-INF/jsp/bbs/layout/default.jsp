<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<!doctype html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/meta.jsp"%>
<title><decorator:title /> | yxbs</title>
<script src="${ctx}/resources/js/lib/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/lib/json2/json2.js" type="text/javascript"></script>
<link rel="stylesheet" href="${ctx}/resources/js/lib/bootstrap/css-bbs/bootstrap.css" />
<script src="${ctx}/resources/js/lib/bootstrap/js-bbs/bootstrap.js" type="text/javascript"></script>
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
<![endif]-->
<link rel="shortcut icon" href="/resources/images/depp.png" type="">
<decorator:head />
<style type="text/css">
	.form-panel {
		  padding: 15px;
		  margin-bottom: 20px;
		  background-color: #ffffff;
		  border: 1px solid #dddddd;
		  border-radius: 4px;
		  -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.05);
		          box-shadow: 0 1px 1px rgba(0, 0, 0, 0.05);
	}
	
	.form-panel-heading {
		  padding: 10px 15px;
		  margin: -15px -15px 15px;
		  background-color: #f5f5f5;
		  border-bottom: 1px solid #dddddd;
		  border-top-right-radius: 3px;
		  border-top-left-radius: 3px;
	}
</style>
</head>
<title>魔力红社区</title>
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
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12" >
				<i class="icon-signal"></i>今日：|昨日：|贴子：|会员：
			</div>
			<div class="span12">
				<decorator:body />
			</div>
		</div>
	</div>
	<footer style="text-align: center; margin: 10px 0;">
		<p>Copyright@2013-2018 jzw 版权所有</p>
	</footer>
</body>
</html>
