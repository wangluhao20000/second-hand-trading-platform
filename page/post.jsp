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
				信息${empty message?"发布":"修改"}
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
									信息标题
								</DIV>
							</TD>
							<TD class=left bgColor=#ffffff>
								<INPUT id=HeadBox style="WIDTH: 308px" maxLength=30 name="message_title" value="${message.message_title }"/>
								*(30字以内)
								<SPAN id=RequiredFieldValidator6
									style="VISIBILITY: hidden; COLOR: red">不能为空</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25>
								<DIV align=center>
									新旧程度
								</DIV>
							</TD>
							<TD class=left bgColor=#f7f7f7>
								<SELECT id=VerList name="old_value">
									<OPTION value=1 ${message.old_value==1?"selected":""}>
										1成新
									</OPTION>
									<OPTION value=2 ${message.old_value==2?"selected":""}>
										2成新
									</OPTION>
									<OPTION value=3 ${message.old_value==3?"selected":""}>
										3成新
									</OPTION>
									<OPTION value=4 ${message.old_value==4?"selected":""}>
										4成新
									</OPTION>
									<OPTION value=5 ${message.old_value==5?"selected":""}>
										5成新
									</OPTION>
									<OPTION value=6 ${message.old_value==6?"selected":""}>
										6成新
									</OPTION>
									<OPTION value=7 ${message.old_value==7?"selected":""}>
										7成新
									</OPTION>
									<OPTION value=8 ${message.old_value==8?"selected":""}>
										8成新
									</OPTION>
									<OPTION value=9 ${message.old_value==9?"selected":""}>
										9成新
									</OPTION>
									<OPTION value=10 ${message.old_value==10?"selected":""} >
										全新
									</OPTION>
								</SELECT>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25>
								<DIV align=center>
									交易类型
								</DIV>
							</TD>
							<TD class=left>
								<SELECT id=ProperList style="WIDTH: 80px" name="flag">
									<OPTION value=0 ${message.flag==0?"selected":""}>
										出售
									</OPTION>
									<OPTION value=1 ${message.flag==1?"selected":""}>
										求购
									</OPTION>
								</SELECT>
								*
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=3>
								<DIV align=center>
									所属类别
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
									交易地区
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
									物品价格
								</DIV>
							</TD>
							<TD class=left>
								<INPUT id=PriBox maxLength=20 name="price" value="${message.price }">
								*（请填入数字，面议填入"0")
								<SPAN id=RangeValidator1 style="VISIBILITY: hidden; COLOR: red">非数字或者数字不合理</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD height=24>
								<DIV align=center>
									联系人
								</DIV>
							</TD>
							<TD class=left height=24>
								<INPUT id=ConNBox maxLength=50 name="r_user" value="${message.r_user }">
								*
								<SPAN id=RequiredFieldValidator1
									style="VISIBILITY: hidden; COLOR: red">不能为空</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD height=25>
								<DIV align=center>
									E－mail
								</DIV>
							</TD>
							<TD class=left>
								<INPUT id=EmailBox maxLength=50 name="r_email" value="${message.r_email }">
								*
								<SPAN id=RegularExpressionValidator1
									style="VISIBILITY: hidden; COLOR: red">邮箱名不符合规范!</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD height=25>
								<DIV align=center>
									联系方式
								</DIV>
							</TD>
							<TD class=left>
								<TEXTAREA id=ConMBox style="WIDTH: 288px; HEIGHT: 54px"
									name="r_phone" >${message.r_phone }</TEXTAREA>
								*
								<SPAN id=RequiredFieldValidator2
									style="VISIBILITY: hidden; COLOR: red">不能为空</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=110>
								<DIV align=center>
									物品简介
								</DIV>
							</TD>
							<TD class=left>
								<TEXTAREA id=IntroBox style="WIDTH: 406px; HEIGHT: 120px"
									name="message_desc">${message.message_desc }</TEXTAREA>
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
						<TR bgColor=#ffffff>
							<TD class=left colSpan=2 height=30>
								说明：标记*号的为必填项目
							</TD>
						</TR>
					</TBODY>
				</TABLE>
			</TD>
		</TR>
	</TBODY>
</TABLE>
</form>