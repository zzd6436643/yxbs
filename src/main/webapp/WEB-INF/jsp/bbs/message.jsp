<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<script src="${ctx}/resources/js/lib/bootstrap-paginator/bootstrap-paginator.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/bbs/replyPage.js" type="text/javascript"></script>
<meta name="decorator" content="bbs">
<div class="col-md-12">
		<ol class="breadcrumb">
  			<li><a href="${ctx}/bbs/index" >魔力红社区</a></li>
  			<li><a href="${ctx}/bbs/topic?tid=${message.tid}">${topic.title}</a>
  			<li class="active"><c:out value="${message.mtitle}" /></li>
		</ol>
</div>
<div class="col-md-12">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title"><c:out value="${message.mtitle}" /></h3>
		</div>
		<div class="panel-body">
			<div class="col-md-3">
				<div class="panel panel-default">
					<div class="panel-body">
						<span class="label label-primary"><b><c:out value="${message.username}" escapeXml="true"/></b></span>
						<img data-src="holder.js/140x140" class="img-rounded" alt="140X140" style="width: 200px; height: 140px;">
						<pre>注册日期：</pre>
						<pre>已发贴：</pre>
						<pre>身份：</pre>
					</div>
				</div>
			</div>
			<div class="col-md-9">
				<div class="panel panel-default">
					<div class="panel-body">
						<p><c:out value="${message.mcontent}" escapeXml="true"/></p>
						<blockquote class="pull-right">
							<small><c:out value="${message.lastReplyTime}" /></small>
						</blockquote>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<form class="form" id="replyForm" name="replyForm"
	action="${ctx}/bbs/message?mid=${message.mid}" method="POST">
	<c:forEach items="${replyList}" var="reply">
		<div class="col-md-12">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						<c:out value="${reply.rtitle}" escapeXml="true" />
					</h3>
				</div>
				<div class="panel-body">
					<div class="col-md-3">
						<div class="panel panel-default">
							<div class="panel-body">
								<span class="label label-primary"><b><c:out
											value="${reply.username}" escapeXml="true" /></b></span> <img
									data-src="holder.js/140x140" class="img-rounded" alt="140X140"
									style="width: 200px; height: 140px;">
								<pre>注册日期：</pre>
								<pre>已发贴：</pre>
								<pre>身份：</pre>
							</div>
						</div>
					</div>
					<div class="col-md-9">
						<div class="panel panel-default">
							<div class="panel-body">
								<p>
									<c:out value="${reply.rcontent}" escapeXml="true" />
								</p>
								<blockquote class="pull-right">
									<small><c:out value="${reply.dateTime}" /></small>
								</blockquote>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
	<input id="pageIndex" name="pageIndex" type="hidden"> 
	<input id="pageSize" name="pageSize" type="hidden" value="${rc.pageSize}">
	<input id="currentPage" type="hidden" value="${currentPage}">
	<input id="totalPage" type="hidden" value="${totalPage}">
	<input id="ctx" type="hidden" value="${ctx}">
</form>
<div class="col-md-12">
	<div id="pagination" style="float: left;"></div>
</div>
<div class="col-md-12">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">快速回复</h3>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" role="form" action="${ctx}/bbs/cmtReply" method="POST">
				<div class="form-group">
					<label for="rtitle" class="col-md-2 control-label">标题</label>
					<div class="col-md-10">
						<input type="text" class="form-control" id="rtitle" name="rtitle"
								placeholder="标题">
					</div>
				</div>
				<div class="form-group">
					<label for="rcontent" class="col-md-2 control-label">正文</label>
					<div class="col-md-10">
						<textarea class="form-control" rows="10" id="rcontent" name="rcontent" placeholder="内容"></textarea>
					</div>
				</div>
				<input id="tid" name="tid" type="hidden" value="${topic.tid}">
				<input id="mid" name="mid" type="hidden" value="${message.mid}">
				<div class="form-group">
					<div class="col-md-offset-11 col-md-1">
						<button type="submit" class="btn btn-primary">回复</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

