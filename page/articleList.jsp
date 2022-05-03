<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<c:if test="${not empty delSucess }">
<script language=JavaScript>
alert('删除成功！');
</script>
</c:if>
<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
		<TR>
			<TD class=left2 background="${ctx }/images/page/article/right5_1_5.jpg" height=30>
				二手指南&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<c:if test="${not empty role}"><a href="toAddArticle.do">新增指南</a></c:if>
			</TD>
		</TR>
		<TR>
			<TD class="left , main" vAlign=top background=${ctx }/images/page/article/right5_2.jpg
				height=255>
				<TABLE id=ArticleList
					style="WIDTH: 368px; BORDER-COLLAPSE: collapse" cellSpacing=0
					border=0>
					<TBODY>
						<c:forEach items="${articleList}" var="article">
						<TR>
							<TD>
								&nbsp;&nbsp;
								<IMG id=ArticleList_ctl00_Image1
									style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px"
									src="${ctx }/images/page/article/articlelist.gif">
								<FONT face=宋体>&nbsp;&nbsp;</FONT>
								<A href="article.do?articleid=${article.id }">${article.title }</A>
							</TD>
						</TR>
						</c:forEach>
					</TBODY>
				</TABLE>
			</TD>
		</TR>
		<TR>
			<TD>
				<IMG height=10 src="${ctx }/images/page/article/right5_3.jpg" width=566>
			</TD>
		</TR>
	</TBODY>
</TABLE>
