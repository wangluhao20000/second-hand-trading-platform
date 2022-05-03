<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="../common/taglibs.jsp"%>
<script type="text/javascript">
<!--
function isNotEmpty(elem, msg) {
	var str = elem.value;
	if (str == null || str.length == 0) {
		alert(msg);
		elem.focus();
		return false;
	} else {
		return true;
	}
}
//-->
</script>
<form action="${ctx}/dealArticleForm.do?action=${empty article?"add":"mod" }" method="post" onsubmit="return(isNotEmpty(this.title,'标题不能为空！'))">
<input type=hidden name="articleid" value="${article.id }">
<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
		<TR>
			<TD class=left2 background="${ctx }/images/page/type/right5_1_3.jpg"
				height=30>
				新增二手指南
			</TD>
		</TR>
		<TR>
			<TD vAlign=top height=255>
				<TABLE cellSpacing=1 cellPadding=0 width=560 align=center
					bgColor=#cccccc border=0>
					<TBODY>
						<TR>
							<TD width=75 bgColor=#ffffff height=25>
								<DIV align=center>
									指南标题:
								</DIV>
							</TD>
							<TD class=left bgColor=#ffffff>
								<INPUT id=HeadBox style="WIDTH: 308px" maxLength=30 name="title" value='${article.title }'/>
								*
								<SPAN id=RequiredFieldValidator6
									style="VISIBILITY: hidden; COLOR: red">不能为空</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=110>
								<DIV align=center>
									内容:
								</DIV>
							</TD>
							<TD class=left>
								<TEXTAREA id=IntroBox style="WIDTH: 406px; HEIGHT: 500px"
									name="content">${article.content }</TEXTAREA>
								*
								<SPAN id=RequiredFieldValidator3
									style="VISIBILITY: hidden; COLOR: red">不能为空</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD colSpan=2 height=25>
								<DIV align=center>
									&nbsp;
									<INPUT id=btnSubmit style="WIDTH: 62px" type=submit value=提交
										name=btnSubmit >
									<INPUT id=btnReset style="WIDTH: 63px" type=reset value=重置
										name=btnReset>
								</DIV>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
			</TD>
		</TR>
	</TBODY>
</TABLE>
</form>