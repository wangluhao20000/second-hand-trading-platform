<%@ page language="java" pageEncoding="GBK" errorPage="error.jsp"%>
<%@ include file="/common/taglibs.jsp"%>
<SCRIPT language=JavaScript src="${ctx}/js/check.js" type=text/JavaScript></SCRIPT>
<form action="post.do" method="post" onsubmit="return(post_check(this))">
<input type=hidden name="messageid" value="${message.id }">
<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
		<TR>
			<TD class=left2 background="${ctx }/images/page/type/right5_1_3.jpg"
				height=30>
				��Ϣ${empty message?"����":"�޸�"}
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
									��Ϣ����
								</DIV>
							</TD>
							<TD class=left bgColor=#ffffff>
								<INPUT id=HeadBox style="WIDTH: 308px" maxLength=30 name="message_title" value="${message.message_title }"/>
								*(30������)
								<SPAN id=RequiredFieldValidator6
									style="VISIBILITY: hidden; COLOR: red">����Ϊ��</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25>
								<DIV align=center>
									�¾ɳ̶�
								</DIV>
							</TD>
							<TD class=left bgColor=#f7f7f7>
								<SELECT id=VerList name="old_value">
									<OPTION value=1 ${message.old_value==1?"selected":""}>
										1����
									</OPTION>
									<OPTION value=2 ${message.old_value==2?"selected":""}>
										2����
									</OPTION>
									<OPTION value=3 ${message.old_value==3?"selected":""}>
										3����
									</OPTION>
									<OPTION value=4 ${message.old_value==4?"selected":""}>
										4����
									</OPTION>
									<OPTION value=5 ${message.old_value==5?"selected":""}>
										5����
									</OPTION>
									<OPTION value=6 ${message.old_value==6?"selected":""}>
										6����
									</OPTION>
									<OPTION value=7 ${message.old_value==7?"selected":""}>
										7����
									</OPTION>
									<OPTION value=8 ${message.old_value==8?"selected":""}>
										8����
									</OPTION>
									<OPTION value=9 ${message.old_value==9?"selected":""}>
										9����
									</OPTION>
									<OPTION value=10 ${message.old_value==10?"selected":""} >
										ȫ��
									</OPTION>
								</SELECT>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25>
								<DIV align=center>
									��������
								</DIV>
							</TD>
							<TD class=left>
								<SELECT id=ProperList style="WIDTH: 80px" name="flag">
									<OPTION value=0 ${message.flag==0?"selected":""}>
										����
									</OPTION>
									<OPTION value=1 ${message.flag==1?"selected":""}>
										��
									</OPTION>
								</SELECT>
								*
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=3>
								<DIV align=center>
									�������
								</DIV>
							</TD>
							<TD class=left height=3>
								<SELECT id=TypeList style="WIDTH: 112px" name="typeid">
									<c:forEach items="${typeMap }" var="type">
										<option value="${type.key }"  ${message.MType.id eq type.key?"selected":""}>
											${type.value }
										</option>
									</c:forEach>
								</SELECT>
								*
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25>
								<DIV align=center>
									���׵���
								</DIV>
							</TD>
							<TD class=left>
								<SELECT id=LocaList style="WIDTH: 112px" name="areaid">
									<c:forEach items="${areaMap }" var="area">
										<option value="${area.key }" ${message.MArea.id eq area.key?"selected":""}>
											${area.value }
										</option>
									</c:forEach>
								</SELECT>
								*
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25>
								<DIV align=center>
									��Ʒ�۸�
								</DIV>
							</TD>
							<TD class=left>
								<INPUT id=PriBox maxLength=20 name="price" value="${message.price }">
								*�����������֣���������"0")
								<SPAN id=RangeValidator1 style="VISIBILITY: hidden; COLOR: red">�����ֻ������ֲ�����</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD height=24>
								<DIV align=center>
									��ϵ��
								</DIV>
							</TD>
							<TD class=left height=24>
								<INPUT id=ConNBox maxLength=50 name="r_user" value="${message.r_user }">
								*
								<SPAN id=RequiredFieldValidator1
									style="VISIBILITY: hidden; COLOR: red">����Ϊ��</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD height=25>
								<DIV align=center>
									E��mail
								</DIV>
							</TD>
							<TD class=left>
								<INPUT id=EmailBox maxLength=50 name="r_email" value="${message.r_email }">
								*
								<SPAN id=RegularExpressionValidator1
									style="VISIBILITY: hidden; COLOR: red">�����������Ϲ淶!</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD height=25>
								<DIV align=center>
									��ϵ��ʽ
								</DIV>
							</TD>
							<TD class=left>
								<TEXTAREA id=ConMBox style="WIDTH: 288px; HEIGHT: 54px"
									name="r_phone" >${message.r_phone }</TEXTAREA>
								*
								<SPAN id=RequiredFieldValidator2
									style="VISIBILITY: hidden; COLOR: red">����Ϊ��</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=110>
								<DIV align=center>
									��Ʒ���
								</DIV>
							</TD>
							<TD class=left>
								<TEXTAREA id=IntroBox style="WIDTH: 406px; HEIGHT: 120px"
									name="message_desc">${message.message_desc }</TEXTAREA>
								*
								<SPAN id=RequiredFieldValidator3
									style="VISIBILITY: hidden; COLOR: red">����Ϊ��</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD colSpan=2 height=25>
								<DIV align=center>
									&nbsp;
									<INPUT id=btnSubmit style="WIDTH: 62px" type=submit value=�ύ
										name=btnSubmit >
									<INPUT id=btnReset style="WIDTH: 63px" type=reset value=����
										name=btnReset>
								</DIV>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD class=left colSpan=2 height=30>
								˵�������*�ŵ�Ϊ������Ŀ
							</TD>
						</TR>
					</TBODY>
				</TABLE>
			</TD>
		</TR>
	</TBODY>
</TABLE>
</form>