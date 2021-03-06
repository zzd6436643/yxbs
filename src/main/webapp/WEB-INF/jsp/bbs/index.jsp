<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<meta name="decorator" content="bbs">
<div class="col-md-12">
		<ol class="breadcrumb">
  			<li><a href="${ctx}/bbs/index" class="active">魔力红社区</a></li>
		</ol>
</div>
<c:forEach items="${listSections}" var="section">
	<div class="col-md-12">
		<div class="panel panel-primary">
				<div class="panel-heading">
					<span class="glyphicon glyphicon-book"></span>
					<c:out value="${section.sname}" escapeXml="false"/>
				</div>
					<c:set var="keys" value="${section.sid}" />
					<c:forEach items="${mapTopic[pageScope.keys]}" var="topic">
						<table class="table table-striped">
							<tr>
								<td>
									<img src="${ctx}/resources/images/bbs/topic.gif" class="img-thumbnail">
									<a href="${ctx}/bbs/topic?tid=${topic.tid}"><c:out value="${topic.title}"/></a>
								</td>
								<td>
									<p><c:out value="${topic.tmcount}"/>/<c:out value="${topic.trcount}"/></p>
								</td>
							</tr>
						</table>
						
					</c:forEach>
		</div>
	</div>
</c:forEach>
