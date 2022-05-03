<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<TABLE id=Top1_TopGrid style="WIDTH: 170px; BORDER-COLLAPSE: collapse"
	cellSpacing=0 border=0>
	<TBODY>
		<c:forEach items="${TopMessageList}" var="message" begin="0" end="10">
		<TR>
			<TD></TD>
		<TR>
			<TD height=18>
				<IMG id=Top1_TopGrid_ctl02_Image1
					style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; WIDTH: 9px; HEIGHT: 15px; BORDER-RIGHT-WIDTH: 0px"
					src="${ctx}/images/page/article/article.gif" alt="${message.message_title }">
				<A class="p1 , txt2" id=Top1_TopGrid_ctl02_HaperLink 
					href="${ctx}/message.do?messageid=${message.id }">
					${fn:substring(message.message_title,0,5) }
  					${fn:length(message.message_title) le 5?"":".."}
					</A>(
				<SPAN class=txt1 id=Top1_TopGrid_ctl02_Label1>
				${message.flag==0?"³öÊÛ":"Çó¹º"}
				</SPAN>)
			</TD>
		</TR>
		</c:forEach>
	</TBODY>
</TABLE>
