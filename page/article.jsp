<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<script language=JavaScript>
function updateArticle(articleid){
	var url = 'dealArticle.do?action=mod&articleid=' + articleid;
	window.location=url;
}
function deleteArticle(articleid){
	var url = 'dealArticle.do?action=del&articleid=' + articleid;
	if(confirm('确认删除吗?'))
		window.location=url;
}
</script>
<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
		<TR>
			<TD class=left2 background="${ctx}/images/page/article/right5_1_4.jpg" height=30>
				选购文章
			</TD>
		</TR>
		<TR>
			<TD class="left , main" background="${ctx }/images/page/article/right5_2.jpg" height=255>
				<P align=center>
				<TABLE id=Table1 cellSpacing=0 cellPadding=0 width="97%" border=0>
					<TBODY>
						<TR>
							<TD align=left width=75%>
								<SPAN id=TitleLabel style="FONT-WEIGHT: bold; FONT-SIZE: small">
								${article.title}
								</SPAN>
							</TD>
							<td align=left>
								<c:if test="${not empty role}">
								<button onclick="updateArticle('${article.id }');">修改</button>
								<button onclick="deleteArticle('${article.id }');">删除</button>
								</c:if>
							</TD>
						</TR>
						<TR>
							<TD colspan=2>
								${article.content}
							</TD>
						</TR>
					</TBODY>
				</TABLE>
			</TD>
		</TR>
		<TR>
			<TD>
				<IMG height=10 src="${ctx }/images/page/article/right5_3.jpg"
					width=566>
			</TD>
		</TR>
	</TBODY>
</TABLE>
