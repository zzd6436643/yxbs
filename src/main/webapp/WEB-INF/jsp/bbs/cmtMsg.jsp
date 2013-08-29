<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<meta name="decorator" content="bbs">
<script type="text/javascript">
	var sec = 5;
	function countDown()
	{
		if (sec > 0) {
			var str = "${desc}"  + '系统将在' + sec + '后自动返回';
			sec --;
			document.getElementById('autoDir').innerHTML = str;
			setTimeout(countDown, 1000);
		}
		else
		{
			window.location.href = "${ctx}/bbs/message";
		}
	}
	window.onload = countDown;
</script>
<div id="autoDir"></div>
