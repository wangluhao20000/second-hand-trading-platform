<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>

<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
			<TR>
				<TD class=left2 background=${ctx}/images/page/type/right5_1_2.jpg
					height=30>
					<SPAN id=LblType>�������</SPAN>
				</TD>
			</TR>
			<TR valign=top>
				<TD class="left,main"
					background=${ctx}/images/page/type/right5_2.jpg height=255>
					<TABLE id=TypeGrid style="WIDTH: 550px; BORDER-COLLAPSE: collapse"
						cellSpacing=0 rules=all border=1>
						<TBODY>
							<TR align=middle>
								<TD>
									����
								</TD>
								<TD>
									��Ϣ����
								</TD>
								<TD>
									���׵���
								</TD>
								<TD>
									����ʱ��
								</TD>
								<TD>
									�¾ɳ̶�
								</TD>
								<TD>
									�۸�
								</TD>
								<TD>
									����
								</TD>
							</TR>

							<c:forEach items="${searchMessageList }" var="message"
								begin="${first }" end="${last }">
								<TR align=middle>
									<TD>
										<c:if test="${message.flag == 0 }">[����]</c:if>
										<c:if test="${message.flag == 1 }">[��]</c:if>
									</TD>
									<TD style="WIDTH: 40%">
										<A id=TypeGrid_ctl12_Hyperlink2 style="TEXT-DECORATION: none"
											href="${ctx}/message.do?messageid=${message.id }">
											${fn:substring(message.message_title,0,20) }
											${fn:length(message.message_title) le 20?"":"..."}</a>
									</TD>
									<TD>
										${message.MArea.area_desc} 
									</TD> 
									<TD> 
										<fmt:formatDate value="${message.create_time}" type="date" dateStyle="medium"/> 
									</TD> 
									<TD> 
									${message.old_value }����
									</TD>
									<TD>
										${message.price }RMB
									</TD>
									<TD>
										${message.top_value }
									</TD>
								</TR>
							</c:forEach>
						</TBODY>
					</TABLE>
					<FORM METHOD=POST ACTION="${ctx}/searchMessagePage.do?">
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
											href="searchMessagePage.do?cur_page=0&action=page">
											��ҳ</A></c:if>
											${cur_page == 0?"��ҳ":""}&nbsp; 
											<c:if test="${cur_page > 0}">
											<A id=pagePrevious style="DISPLAY: inline-block; WIDTH: 44px; HEIGHT: 8px"
											href="searchMessagePage.do?cur_page=${cur_page-1 }&action=page">��һҳ</A>
											</c:if>${cur_page == 0?"��һҳ":""} 
											<c:if test="${cur_page < page}">
											<A id=pageNext style="DISPLAY: inline-block; WIDTH: 45px; HEIGHT: 1px"
											href="searchMessagePage.do?cur_page=${cur_page+1 }&action=page">��һҳ</A>
											</c:if>
											${cur_page==page?"��һҳ":""} 
											<c:if test="${cur_page < page}">
											<A id=pageTail
											style="DISPLAY: inline-block; WIDTH: 32px; HEIGHT: 8px"
											href="searchMessagePage.do?cur_page=${page }&action=page">βҳ</A>
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
				</TD>
			</TR>
			<TR>
				<TD>
					<IMG height=10 src="${ctx}/images/page/type/right5_3.jpg" width=566>
				</TD>
			</TR>
	</TBODY>
</TABLE>
