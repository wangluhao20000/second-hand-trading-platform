<%@ page language="java" pageEncoding="GBK" errorPage="error.jsp"%>
<%@ include file="/common/taglibs.jsp"%>
<script>
function regist()
{
	window.location = "user_info/readProtocol.do";
}
function isNotEmpty(elem,msg) {
var str = elem.value;
if(str == null || str.length == 0) {
	alert(msg);
	elem.focus();
		return false;
	} else {
		return true;
	}
}
function check(f) {
if(!isNotEmpty(f.username,'�û�������Ϊ�գ�'))
	return false;
if(!isNotEmpty(f.password,"���벻��Ϊ�գ�"))
	return false;
if (f.username.value.length<3 || f.password.value.length<6){
	alert("�û���������̫�̣��û���������3���ַ������벻����6���ַ�����");
		return false;
} else {
 	return true;
  	}
}
</script>
<c:if test="${not empty loginError }">
	<script>
		alert("�û����������������������룡");
	</script>
</c:if>
<c:if test="${empty user }">
	<form action="login.do" method="post" >
		<TABLE id=Table1 style="FONT-SIZE: 11pt; COLOR: gray" cellSpacing=3
			cellPadding=0 width=169 align=center border=0>
			<TBODY>
				<TR>
					<TD width=58>
						<DIV align=center>
							�û�����
						</DIV>
					</TD>
					<TD width=111>
						<INPUT id=Login1_tbUserName style="WIDTH: 112px" name=username>
					</TD>
				</TR>
				<TR>
					<TD style="HEIGHT: 26px">
						<DIV align=center>
							�� �룺
						</DIV>
					</TD>
					<TD style="HEIGHT: 26px">
						<INPUT id=Login1_tbPassword style="WIDTH: 112px" type=password
							name=password>
					</TD>
				</TR>
				<TR>
					<TD style="HEIGHT: 26px" colspan=2>
						&nbsp;
						<input type="submit" value="��¼" onclick="return(check(this.form));"/>
						&nbsp;
						<input type="button" value="ע��" onclick="regist();" />
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>
</c:if>
<c:if test="${not empty user }">
	<TABLE id=Table2 style="FONT-SIZE: 11pt; COLOR: gray" cellSpacing=1
		cellPadding=1 width=169 border=0>
		<TBODY>
			<TR>
				<TD align=middle colSpan=2>
					�¿ƴ��ѧ�����ֽ���ƽ̨
				</TD>
			</TR>
			<TR>
				<TD align=right>
					��ӭ����
				</TD>
				<TD>
					<SPAN id=Login1_lblUserName>${user.username }</SPAN>
				</TD>
			</TR>
			<TR>
				<TD align=middle>
					<A class=a id=Login1_HyperLink1 href="myMessage.do">��Ϣ����</A>
				</TD>
				<TD>
					<A class=a id=Login1_HyperLink4 href="topost.do">��Ӷ�����Ϣ</A>
				</TD>
			</TR>
			<TR>
				<TD align=middle>
					<A class=a id=Login1_Unlogin href="logout.do">ע��</A>
				</TD>
				<TD>
					<A class=a href="user_info/modifyInfo.do">�޸ĸ�������</A>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</c:if>

