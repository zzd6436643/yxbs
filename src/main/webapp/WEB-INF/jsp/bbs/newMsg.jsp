<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<meta name="decorator" content="bbs">

<div class="col-12">
	<ol class="breadcrumb">
		<li><a href="${ctx}/bbs/index">魔力红社区</a></li>
		<li><a href="${ctx}/bbs/topic?tid=${topic.tid}"><c:out value="${topic.title}" /></a></li>
		<li class="active">发表新贴</li>
	</ol>
</div>
<div class="col-12">
	<div class="panel panel-info">
		<div class="panel-heading">
			发表新贴
		</div>
		<div class="panel-body">
			<form class="form-horizontal" role="form" action="${ctx}/bbs/cmtMsg" method="POST">
				<div class="form-group">
					<label for="mtitle" class="col-2 control-label">输入标题</label>
					<div class="col-10">
						<input type="text" class="form-control" id="mtitle"
								placeholder="标题">
					</div>
				</div>
				<div class="form-group">
					<label for="mcontent" class="col-2 control-label">输入正文</label>
					<div class="col-10">
						<textarea class="form-control" rows="10" id="mcontent" placeholder="内容"></textarea>
					</div>
				</div>
				<input id="tid" name="tid" type="hidden" value="${topic.tid}">
				<div class="form-group">
					<div class="col-offset-10 col-1">
						<button type="button" class="btn btn-default">保存草稿</button>
					</div>
					<div class="col-1">
						<button type="submit" class="btn btn-primary">发贴</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
