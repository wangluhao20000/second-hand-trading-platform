<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<script language=JavaScript>
function updateMessage(messageid){
	var url = 'topost.do?messageid=' + messageid;
	window.location=url;
}
function deleteMessage(messageid){
	var url = 'deleteMessage.do?messageid=' + messageid;
	if(confirm('确认删除吗?'))
		window.location=url;
}
</script>
<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
		<TR>
			<TD class=left2 background=${ctx}/images/page/type/right5_1_6.jpg
				height=30>
				个人二手信息管理&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<c:if test="${not empty role}"><a href="myMessage.do?manager=user">会员二手信息管理</a></c:if>
			</TD>
		</TR>
		<TR>
			<TD class="left , main"
				background=${ctx}/images/page/type/right5_2.jpg height=255>
				<TABLE id=UserNewsGrid
					style="FONT-SIZE: x-small; WIDTH: 536px; BORDER-COLLAPSE: collapse"
					cellSpacing=0 rules=all border=1>
					<TBODY>
						<TR style="BACKGROUND-COLOR: silver" align=middle>
							<TD>
								信息标题
							</TD>
							<TD>
								类型
							</TD>
							<TD>
								交易地区
							</TD>
							<TD>
								发布时间
							</TD>
							<TD>
								修改
							</TD>
							<TD>
								删除
							</TD>
						</TR>
						<c:forEach items="${myMessageList }" var="message" begin="${first }" end="${last }">
						<TR align="center">
							<TD align="left">
								<A href="${ctx}/message.do?messageid=${message.id }">
											${fn:substring(message.message_title,0,10) }
											${fn:length(message.message_title) le 10?"":"..."}</a>
							</TD>
							<TD align="center">
								${ message.MType.type_desc }
							</TD>
							<TD align="center">
								${message.MArea.area_desc}
							</TD>
							<TD align="center">
								<fmt:formatDate value="${message.create_time }" type="date" dateStyle="medium" />
							</TD>
							<td align="center">
								<button onclick="updateMessage('${message.id }');">修改</button>
							</td>
							<TD align="center">
								<button onclick="deleteMessage('${message.id }');">删除</button>
							</TD>
						</TR>
						</c:forEach>
					</TBODY>
				</TABLE>
				<c:if test="${size gt 1}">
				<FORM METHOD=POST ACTION="${ctx}/myMessagePage.do?">
					<TABLE id=Table1 cellSpacing=1 cellPadding=1 width=550 border=0>
							<TBODY>
								<TR>
									<TD align=middle>
										<FONT style="FONT-SIZE: 10pt" face=宋体>合计 <SPAN
											id=lblCount>${size }</SPAN>条信息|第 <SPAN id=pageShow
											style="DISPLAY: inline-block; WIDTH: 4px">1/${page+1 }</SPAN>页&nbsp;&nbsp;&nbsp;
											<c:if test="${cur_page > 0 }">
											<A id=pageHead
											style="DISPLAY: inline-block; WIDTH: 26px; HEIGHT: 11px"
											href="myMessagePage.do?cur_page=0&action=page">
											首页</A></c:if>
											${cur_page == 0?"首页":""}&nbsp; 
											<c:if test="${cur_page > 0}">
											<A id=pagePrevious style="DISPLAY: inline-block; WIDTH: 44px; HEIGHT: 8px"
											href="myMessagePage.do?cur_page=${cur_page-1 }&action=page">上一页</A>
											</c:if>${cur_page == 0?"上一页":""} 
											<c:if test="${cur_page < page}">
											<A id=pageNext style="DISPLAY: inline-block; WIDTH: 45px; HEIGHT: 1px"
											href="myMessagePage.do?cur_page=${cur_page+1 }&action=page">下一页</A>
											</c:if>
											${cur_page==page?"下一页":""} 
											<c:if test="${cur_page < page}">
											<A id=pageTail
											style="DISPLAY: inline-block; WIDTH: 32px; HEIGHT: 8px"
											href="myMessagePage.do?cur_page=${page }&action=page">尾页</A>
											</c:if>${cur_page == page?"尾页":""} 
											&nbsp;&nbsp; 到 
											<SELECT NAME="cur_page">
												<c:forEach var="x" begin="0" end="${page}" step="1">
													<OPTION VALUE="${x}" ${x==cur_page?"SELECTED":""}>
														${x+1}
												</c:forEach> 
											</SELECT> 页&nbsp;&nbsp; 
										<INPUT TYPE="submit" value="Go"> 
									</TD> 
								</TR> 
							</TBODY> 
						</TABLE>
					</FORM>
					</c:if>
					<c:if test="${size == 0}">您还没有发布过信息！</c:if>
			</TD>
		</TR>
		<TR>
			<TD>
				<IMG height=10 src="${ctx}/images/page/type/right5_3.jpg" width=566>
			</TD>
		</TR>
	</TBODY>
</TABLE>
