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
if(!isNotEmpty(f.username,'用户名不能为空！'))
	return false;
if(!isNotEmpty(f.password,"密码不能为空！"))
	return false;
if (f.username.value.length<3 || f.password.value.length<6){
	alert("用户名或密码太短（用户名不少于3个字符，密码不少于6个字符）！");
		return false;
} else {
 	return true;
  	}
}
</script>
<c:if test="${not empty loginError }">
	<script>
		alert("用户名或密码有误，请重新输入！");
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
							用户名：
						</DIV>
					</TD>
					<TD width=111>
						<INPUT id=Login1_tbUserName style="WIDTH: 112px" name=username>
					</TD>
				</TR>
				<TR>
					<TD style="HEIGHT: 26px">
						<DIV align=center>
							密 码：
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
						<input type="submit" value="登录" onclick="return(check(this.form));"/>
						&nbsp;
						<input type="button" value="注册" onclick="regist();" />
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
					陕科大大学生二手交易平台
				</TD>
			</TR>
			<TR>
				<TD align=right>
					欢迎您：
				</TD>
				<TD>
					<SPAN id=Login1_lblUserName>${user.username }</SPAN>
				</TD>
			</TR>
			<TR>
				<TD align=middle>
					<A class=a id=Login1_HyperLink1 href="myMessage.do">信息管理</A>
				</TD>
				<TD>
					<A class=a id=Login1_HyperLink4 href="topost.do">添加二手信息</A>
				</TD>
			</TR>
			<TR>
				<TD align=middle>
					<A class=a id=Login1_Unlogin href="logout.do">注销</A>
				</TD>
				<TD>
					<A class=a href="user_info/modifyInfo.do">修改个人资料</A>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</c:if>

