<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<meta name="decorator" content="bbs">
<div class="col-12">
		<ol class="breadcrumb">
  			<li><a href="${ctx}/bbs/index" >魔力红社区</a></li>
  			<li class="active"><c:out value="${topic.title}" /></li>
		</ol>
</div>
<div class="row">
	<div class="col-9">
		<ul class="pagination">
			<li><a href="#">&laquo;</a></li>
			<c:forEach var="pageIndex" begin="1" end="${totalPage}" step="1">
				<c:choose>
					<c:when test="${pageIndex eq currentPage}">
						<li class="active"><c:out value="${pageIndex}" /></li>
					</c:when>
					<c:otherwise>
						<li><a href="#"><c:out value="${pageIndex}" /></a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="#"><c:out value="${pageIndex}" /></a></li>
			</c:forEach>
			<li><a href="#">&raquo;</a></li>
		</ul>
	</div>
	<div class="col-3">
		<button type="button" class="btn btn-primary">发贴</button>
	</div>
</div>
<div class="col-12">
		<div class="panel panel-info">
				<div class="panel-heading">
					<img src="${ctx}/resources/images/bbs/topic.gif" class="img-thumbnail">
					<a href="#"><c:out value="${topic.title}" /></a>
				</div>
				<div class="panel-body">
					<table class="table">
						<c:forEach items="${listMessage}" var="message">
							<tr>
								<td>
									<img src="${ctx}/resources/images/bbs/message.gif" class="img-thumbnail">
									<a href="${ctx}/bbs/message?mid=${message.mid}"><c:out value="${message.mtitle}"/></a>
								</td>
								<td>
									<a href="${ctx}/bbs/message?mid=${message.mid}"><c:out value="${message.username}"/></a>
								</td>
								<td>
									<h5><span class="label label-default"><c:out value="${message.lastReplyTime}"/></span></h5>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>
		</div>
</div>
<div class="col-12">
	<div class="col-9">
		<ul class="pagination">
			<li><a href="#">&laquo;</a></li>
			<c:forEach var="pageIndex" begin="1" end="${totalPage}" step="1">
				<c:choose>
					<c:when test="${pageIndex eq currentPage}">
						<li class="active"><c:out value="${pageIndex}" /></li>
					</c:when>
					<c:otherwise>
						<li><a href="#"><c:out value="${pageIndex}" /></a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="#"><c:out value="${pageIndex}" /></a></li>
			</c:forEach>
			<li><a href="#">&raquo;</a></li>
		</ul>
	</div>
	<div class="col-3">
		<button type="button" class="btn btn-primary">发贴</button>
	</div>
</div>
