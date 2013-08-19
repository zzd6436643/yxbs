<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<meta name="decorator" content="bbs">
<c:forEach items="${listSections}" var="section">
	<div class="span12">
		<div class="form-panel">
				<div class="form-panel-heading">
					<a class="panel-title" href="${ctx}/bbs/detail"><c:out value="${section.sname}" escapeXml="false"/></a>
					<i class="icon-signal pull-right"></i>
				</div>
				<div class="panel-content">
					<h5>test test!</h5>
				</div>
		</div>
	</div>
</c:forEach>
