<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<c:set var="typeid" value="6"></c:set>
<LINK href="css/home.css" type=text/css rel=stylesheet>
<TABLE id=ChannelGrid6 style="FONT-SIZE: x-small; WIDTH: 268px; BORDER-COLLAPSE: collapse" 
                        cellSpacing=0 border=0>
<TBODY>
<c:forEach items="${messageMap[typeid] }" var="message" begin="0" end="7">
<tr>
  <TD style="WIDTH: 80%">&nbsp;¡¤ <A 
    href="${ctx}/message.do?messageid=${message.id }">
	${fn:substring(message.message_title,0,10) }
  	${fn:length(message.message_title) le 10?"":"..."}
	</A>( 
    <SPAN class=txt1 > ${fn:substring(message.create_time,5,10) }¡¡</SPAN>)
  </TD>
</TR>
</c:forEach>
</TBODY>
</TABLE>