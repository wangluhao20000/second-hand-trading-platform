<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<script language=JavaScript>
function updateMessage(messageid){
	var url = 'topost.do?messageid=' + messageid;
	window.location=url;
}
function deleteMessage(messageid){
	var url = 'deleteMessage.do?messageid=' + messageid;
	if(confirm('ȷ��ɾ����?'))
		window.location=url;
}
</script>
<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
		<TR>
			<TD class=left2 background=${ctx}/images/page/type/right5_1_6.jpg
				height=30>
				���˶�����Ϣ����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<c:if test="${not empty role}"><a href="myMessage.do?manager=user">��Ա������Ϣ����</a></c:if>
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
								��Ϣ����
							</TD>
							<TD>
								����
							</TD>
							<TD>
								���׵���
							</TD>
							<TD>
								����ʱ��
							</TD>
							<TD>
								�޸�
							</TD>
							<TD>
								ɾ��
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
								<button onclick="updateMessage('${message.id }');">�޸�</button>
							</td>
							<TD align="center">
								<button onclick="deleteMessage('${message.id }');">ɾ��</button>
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
										<FONT style="FONT-SIZE: 10pt" face=����>�ϼ� <SPAN
											id=lblCount>${size }</SPAN>����Ϣ|�� <SPAN id=pageShow
											style="DISPLAY: inline-block; WIDTH: 4px">1/${page+1 }</SPAN>ҳ&nbsp;&nbsp;&nbsp;
											<c:if test="${cur_page > 0 }">
											<A id=pageHead
											style="DISPLAY: inline-block; WIDTH: 26px; HEIGHT: 11px"
											href="myMessagePage.do?cur_page=0&action=page">
											��ҳ</A></c:if>
											${cur_page == 0?"��ҳ":""}&nbsp; 
											<c:if test="${cur_page > 0}">
											<A id=pagePrevious style="DISPLAY: inline-block; WIDTH: 44px; HEIGHT: 8px"
											href="myMessagePage.do?cur_page=${cur_page-1 }&action=page">��һҳ</A>
											</c:if>${cur_page == 0?"��һҳ":""} 
											<c:if test="${cur_page < page}">
											<A id=pageNext style="DISPLAY: inline-block; WIDTH: 45px; HEIGHT: 1px"
											href="myMessagePage.do?cur_page=${cur_page+1 }&action=page">��һҳ</A>
											</c:if>
											${cur_page==page?"��һҳ":""} 
											<c:if test="${cur_page < page}">
											<A id=pageTail
											style="DISPLAY: inline-block; WIDTH: 32px; HEIGHT: 8px"
											href="myMessagePage.do?cur_page=${page }&action=page">βҳ</A>
											</c:if>${cur_page == page?"βҳ":""} 
											&nbsp;&nbsp; �� 
											<SELECT NAME="cur_page">
												<c:forEach var="x" begin="0" end="${page}" step="1">
													<OPTION VALUE="${x}" ${x==cur_page?"SELECTED":""}>
														${x+1}
												</c:forEach> 
											</SELECT> ҳ&nbsp;&nbsp; 
										<INPUT TYPE="submit" value="Go"> 
									</TD> 
								</TR> 
							</TBODY> 
						</TABLE>
					</FORM>
					</c:if>
					<c:if test="${size == 0}">����û�з�������Ϣ��</c:if>
			</TD>
		</TR>
		<TR>
			<TD>
				<IMG height=10 src="${ctx}/images/page/type/right5_3.jpg" width=566>
			</TD>
		</TR>
	</TBODY>
</TABLE>
