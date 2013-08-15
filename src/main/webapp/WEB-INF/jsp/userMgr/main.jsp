<%@ page contentType="text/html;charset=UTF-8"%><%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%><script src="${ctx}/resources/js/lib/bootstrap-paginator/bootstrap-paginator.js" type="text/javascript"></script><script src="${ctx}/resources/js/page/userMgr.js" type="text/javascript"></script><style type="text/css">.blanktable {	border: 1px solid black;	border-collapse: collapse;}.blanktable th {	border: 1px solid black;}.blanktable td {	border: 1px solid black;	color: blue;}</style><div class="row-fluid">	<div class="span8">		<div style="padding-top: 15px;">			<form id="userListForm" action='${ctx}/userMgr/main' method='POST'>				<table style="font-size: 8px;">					<tr>						<td>用户编码</td>						<td><input id="userId" name="userId" type="text" value='<c:out value="${userCondition.userId}"  escapeXml="true"></c:out>'></td>					</tr>					<tr>						<td>用户名</td>						<td><input id="username" name="username" type="text" value='<c:out value="${userCondition.username}"  escapeXml="true"></c:out>'></td>					</tr>					<tr>						<td>用户级别</td>						<td><input id="role" name="role" type="text" value='<c:out value="${userCondition.role}"  escapeXml="true"></c:out>'></td>					</tr>					<tr>						<td>用户状态</td>						<td><input id="displayIsenable" name="displayIsenable" type="text" value="${userCondition.displayIsenable}"></td>					</tr>				</table>				<input id="pageIndex" name="pageIndex" type="hidden"> <input id="pageSize" name="pageSize" type="hidden" value="${userCondition.pageSize}">				<button class="btn btn-primary" type="submit" id="btnlogin">查询</button>			</form>			<input id="totalCount" type="hidden" value="${totalCount}"> <input id="currentPage" type="hidden" value="${currentPage}"> <input id="totalPage" type="hidden"				value="${totalPage}">		</div>		<div style="padding-top: 15px;">用户列表:</div>		<div style="padding-top: 10px;">			<display:table name="resultList" id="row" class="blanktable" style="text-align:center;" cellspacing="0" cellpadding="0">				<display:column property="userId" title="用户编码" />				<display:column property="username" title="用户帐号" escapeXml="true" />				<display:column property="role" title="角色级别" />				<c:choose>					<c:when test="${row.displayIsenable eq 'enabled'}">						<display:column property="displayIsenable" title="是否可用" style="color:green;" />					</c:when>					<c:otherwise>						<display:column property="displayIsenable" title="是否可用" style="color:red;" />					</c:otherwise>				</c:choose>				<display:column property="createDate" title="创建时间" format="{0,date,yyyy-MM-dd HH:mm:ss}" />				<display:column property="modifyDate" title="最近修改时间" format="{0,date,yyyy-MM-dd HH:mm:ss}" />				<display:column title="操作"></display:column>			</display:table>		</div>		<div id="pagination" style="padding-top: 10px; float: left;"></div>		<div id="paginationCount" style="padding-left: 20px; float: left; margin-top: 35px; margin-left: 10px;">符合条件数据共有 ${totalCount}条</div>	</div>	<div class="span3">usermgr2</div></div>