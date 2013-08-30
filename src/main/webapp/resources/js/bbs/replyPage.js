$(function()
{
	var ctx = $('#ctx').val();
	
	var currPageIndex = parseInt($('#currentPage').val(), 10);
	var totalPageSize = parseInt($('#totalPage').val(), 10);
	
	var options = {
			currentPage : currPageIndex,
			totalPages : totalPageSize,
			numberOfPages : 8,
			onPageClicked : function(event, originalEvent, type, page) {
				var pageIndex = 0;
				if (page < 1) {
					pageIndex = 0;
				} else {
					pageIndex = page - 1;
				}
				if (page > totalPagesNum) {
					pageIndex = totalPagesNum;
				}
				$('#pageIndex').val(pageIndex);
				$('#replyForm').submit();
			},
			onPageChanged : function(event, oldPage, newPage) {
				// alert(456);
			}
		};
		if (currentPageNum != 0 && totalPagesNum != 0 && currentPageNum <= totalPagesNum) {
			$('#pagination').bootstrapPaginator(options);
		}
});
