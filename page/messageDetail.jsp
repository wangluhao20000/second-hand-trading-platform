<%@ page language="java" pageEncoding="GB18030"%>
<%@ include file="/common/taglibs.jsp"%>
<script language=JavaScript>

function back(){
	window.location="index.do";
}
function showAdd(){
	var obj = eval("commentAdd");	
	var state = obj.style.display;	
	if(state == "none"){
		obj.style.display = "";
	}else{
		obj.style.display = "none";
	}
}
function deleteComment(commentid){
	var url = 'delComment.do?messageid=${message.id}&commentid=' + commentid;
	if(confirm('ȷ��ɾ����?'))
		window.location=url;
}
</script>
<SCRIPT language=JavaScript src="${ctx}/js/check.js" type=text/JavaScript></SCRIPT>
<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
		<TR>
			<TD class=left2 background="${ctx}/images/page/type/right5_1_2.jpg"
				height=30>
				<SPAN id=LblType>������Ϣ</SPAN>
			</TD>
		</TR>
		<TR>
			<TD class="left , main" vAlign=top
				background="${ctx}/images/page/type/right5_2.jpg" height=255>
				<TABLE  style="border-collapse: collapse;"
					cellSpacing=0 border=1 width="566" height="756">
					<TBODY>
						<TR>
							<TD width=20% bgColor=#ffffff height=25>
								<DIV align=center>
									��Ϣ����
								</DIV>
							</TD>
							<TD class=left width=80% bgColor=#ffffff>
								<SPAN id=HeadLabel>${message.message_title }</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25 width=20%>
								<DIV align=center>
									�¾ɳ̶�
								</DIV>
							</TD>
							<TD class=left width=80% bgColor=#f7f7f7>
								<SPAN id=VerLabel>${message.old_value}����</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25 width=20%>
								<DIV align=center>
									��������
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=ProLabel>${message.flag==0?"����":"��"}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25 width=20%> 
								<DIV align=center>
									�������
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=TypeLabel>${message.MType.type_desc}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25 width=20%>
								<DIV align=center>
									���׵���
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=LocLabel>${message.MArea.area_desc}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25 width=20%>
								<DIV align=center>
									��Ʒ�۸�
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=PriLabel>${message.price}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25 width=20%>
								<DIV align=center>
									����ʱ��
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=TimeLabel><fmt:formatDate value="${message.create_time }" type="date" dateStyle="medium" /></SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=25>
								<DIV align=center>
									��ϵ��
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=ConnLabel>${message.r_user}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25>
								<DIV align=center>
									E��mail
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=ConELabel>${message.r_email}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=25>
								<DIV align=center>
									��ϵ��ʽ
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=ConMLabel>${message.r_phone}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=23>
								<DIV align=center>
									����
								</DIV>
							</TD>
							<TD class=left height=23>
								<SPAN id=HitLabel>${message.top_value }</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=134>
								<DIV align=center>
									��Ʒ���
								</DIV>
							</TD>
							<TD class=left vAlign=top height=134>
								<SPAN id=IntroLabel>${message.message_desc }</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD height=25>
								<DIV align=center>
									�û�����
								</DIV>
							</TD>
							<TD class=left bgColor=#ffffff>
								<SPAN id=BookLabel>����${fn:length(comments)}�����ԡ�
									���ѣ�������������Ϣ����Ȥ����������ԣ�</SPAN>
							</TD>
						</TR>

						<c:forEach items="${comments }" var="comment">
							<TR>
								<TD bgColor=#ffffff colSpan=2 height=25>
									&nbsp;&nbsp;&nbsp;&nbsp;ͬѧ
									<FONT color=#3366cc>�� ${comment.TUser.username} ��</FONT>
									��<fmt:formatDate value="${comment.create_time }" type="date" dateStyle="medium" />����:
									<c:if test="${not empty role}">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button onclick="deleteComment('${comment.id }');">����Աɾ������</button>
									</c:if>
								</TD>
							</TR>
							<TR>
								<TD bgColor=#f7f7f7 colSpan=2 height=25>
									${comment.content }
								</TD>
							</TR>
						</c:forEach>
						<tr>
							<TD colSpan=2>
								<IMG height=10 src="${ctx}/images/page/type/right5_3.jpg"
									width=566>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
			</TD>
		</TR>
		<c:if test="${not empty user }">
		<TR>
			<TD class="left , main" vAlign=top align=left
				background="${ctx}/images/page/type/right5_2.jpg" height=255>
				<form action="addComment.do" method="post" onsubmit="return(isNotEmpty(this.content,'���ݲ���Ϊ�գ�'))">
				<TABLE id=Table1 cellSpacing=0 cellPadding=0 width=565 align=center
					bgColor=#cccccc border=0>
					<TBODY>
						<TR>
							<TD class=left2 background="${ctx}/images/page/type/right5_1_3.jpg"
								height=30>
								
								<a onclick="showAdd()" href="#comment">
								<SPAN id=LblType>��������</SPAN>
								</a>	
							</TD>
						</TR>
						<TR>
							<TD class="left , main" vAlign=top align=left
								background="${ctx}/images/page/type/right5_2.jpg" height=255>
								<TABLE id="commentAdd" style="display:none" height=251
									cellSpacing=1 cellPadding=0 width=548 align=left
									bgColor=#cccccc border=0>
									<TBODY>
										<TR>
											<TD width=68 bgColor=#ffffff height=25>
												<DIV align=center>
													�û���
												</DIV>
											</TD>
											<TD class=left bgColor=#ffffff>
												${user.username }
											</TD>
										</TR>
										<TR bgColor=#ffffff>
											<TD width=68 bgColor=#ffffff height=25>
												<DIV align=center>
													E��mail
												</DIV>
											</TD>
											<TD class=left>
												${user.email }
											</TD>
										</TR>
										<TR bgColor=#f7f7f7>
											<TD align=middle width=68 bgColor=#f7f7f7 height=110>
												<FONT color=#ff0000 align="center">*</FONT>
												<a name="comment">����</a>
											</TD>
											<TD class=left>
												<input type="hidden" name="messageid" value="${message.id}"/>
												<TEXTAREA id=ContentBox style="WIDTH: 369px; HEIGHT: 112px" name=content></TEXTAREA>
											</TD>
										</TR>
										<TR bgColor=#ffffff>
											<TD class=left align=middle colSpan=2 height=30>
												<INPUT type=submit value="�ύ" />
											</TD>
										</TR>
										<TR>
											<TD class=left colSpan=2 height=30>
												˵�������*�ŵ�Ϊ������Ŀ
											</TD>
										</TR>
									</TBODY>
								</TABLE>
							</TD>
						</TR>
						<TR>
							<TD>
								<IMG height=10 src="${ctx}/images/page/type/right5_3.jpg" width=566>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
				</form>
			</TD>
		</TR>
		</c:if>
	</TBODY>
</TABLE>
