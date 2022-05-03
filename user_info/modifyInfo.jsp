<%@ page language="java" pageEncoding="GBK"%>
<%@ page import="java.util.*,cn.lee.market.model.User" %>
<%@ include file="../common/taglibs.jsp"%>
<%
User user = (User)session.getAttribute("user");
Calendar cal = Calendar.getInstance();
if(user!=null&&user.getBirthday()!=null)
	cal.setTime(user.getBirthday());
int year = cal.get(Calendar.YEAR);
int month = cal.get(Calendar.MONTH)+1;
int day= cal.get(Calendar.DAY_OF_MONTH);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<TITLE>科大二手平台——注册</TITLE>
		<LINK href="${ctx}/css/register.css" type=text/css rel=stylesheet>
		<LINK href="${ctx}/css/calendar.css" type=text/css rel=stylesheet>
	</HEAD>
	<BODY>
<script language=JavaScript>

function showMod(){
	var obj = eval("modfiy_pwd");	
	var state = obj.style.display;	
	if(state == "none"){
		obj.style.display = "";
		modifyInfo.doModPWD.value="1";
	}else{
		obj.style.display = "none";
		modifyInfo.doModPWD.value="0";
	}
}
</script>
	<c:if test="${not empty result }">
		<script language=JavaScript>
			alert('${result}');
		</script>
		<c:if test="${empty error }">
		<script language=JavaScript>
			window.location="${ctx}/index.do";
		</script>
		</c:if>
	</c:if>
	<%@ include file="top.jsp"%>
	<form action="doModifyInfo.do" method="post" name="modifyInfo">
<TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
  <TBODY>
  <TR>
    <TD bgColor=#55b4e2>
      <TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
        <TBODY>
        <TR>
          <TD height=5>
		  <IMG height=1 src="${ctx}/images/register/_space.gif" width=1>
		  </TD>
		</TR>
		</TBODY>
	  </TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width="98%" align=center border=0>
        <TBODY>
        <TR>
          <TD width=7><IMG height=8 src="${ctx}/images/register/a1.jpg" width=7></TD>
          <TD background=${ctx}/images/register/a8.jpg><IMG height=1 
            src="${ctx}/images/register/_space.gif" width=1></TD>
          <TD><IMG height=8 src="${ctx}/images/register/a7.jpg" width=7></TD></TR>
        <TR>
          <TD background=${ctx}/images/register/a2.jpg><IMG height=1 
            src="${ctx}/images/register/_space.gif" width=1></TD>
          <TD vAlign=top bgColor=#ffffff height=500>
            <TABLE cellSpacing=0 cellPadding=0 width=704 align=center 
              border=0><TBODY>
              <TR>
                <TD>&nbsp;</TD></TR>
              <TR>
                <TD class=box_border vAlign=top height=400>
                  <TABLE cellSpacing=0 cellPadding=0 width="90%" align=center 
                  border=0>
                    <TBODY>
                    <TR>
                      <TD height=30><SPAN class=blue_link>用 户 名 ：&nbsp;<SPAN 
                        class=hot_link><SPAN id=lblUserName>${user.username }</SPAN>
                        </TD></TR>
                    <TR>
                      <TD class=blue_link height=30>性&nbsp;&nbsp;&nbsp;&nbsp;别&nbsp;&nbsp;&nbsp;&nbsp;：&nbsp;
                        <TABLE class=input_modify id=rblSex 
                        style="WIDTH: 240px; HEIGHT: 2px" border=0>
                          <TBODY>
                          <TR>
                            <TD><INPUT id=rblSex_0 disabled type=radio ${user.MStudent.sex==1?"checked":"" } value=1 
                              name=sex><LABEL for=rblSex_0 >帅哥</LABEL></TD>
                            <TD><INPUT id=rblSex_1 type=radio value=0 ${user.MStudent.sex==0?"checked":"" }
                              name=sex disabled><LABEL 
                          for=rblSex_1>美女</LABEL></TD></TR></TBODY></TABLE></TD></TR>
                    <TR>
                      <TD class=blue_link height=30><FONT face=宋体>真实姓名 ：&nbsp;<INPUT 
                        class=input_modify id=txtRealName readonly
                        name=stu_name value="${user.MStudent.stu_name }"> <SPAN id=RequiredFieldValidator5 
                        style="VISIBILITY: hidden; COLOR: red">不能为空</SPAN></FONT></TD></TR>
                    <TR>
                      <TD class=blue_link height=30>出生日期 ：&nbsp;
                            <FONT face=宋体>
                            <SPAN class=DPFrame id=jobTimeDateTimePicker>
				            <INPUT class=DPYear onkeypress="return KeyFilter('number');" 
				                   id=birthday_year onkeydown="return dp_keyDown('year');" 
				                   onblur=dp_blur(); onfocus="return dp_focus('year');" 
				                   maxLength=4 onchange=dp_change(); size=4 value=<%=year%> 
				                   name=birthday_year> 
				           	<SPAN class=DPSpan>-</SPAN>
				           	<INPUT class=DPMonth onkeypress="return KeyFilter('number');" 
				                   id=birthday_month onkeydown="return dp_keyDown('month');" 
				                   onblur=dp_blur(); onfocus="return dp_focus('month');" 
				                   maxLength=2 onchange=dp_change(); size=2 value=<%=month%>
				                   name=birthday_month> 
							<SPAN class=DPSpan>-</SPAN>
							<INPUT class=DPDay onkeypress="return KeyFilter('number');" 
				                   id=birthday_day onkeydown="return dp_keyDown('day');" 
				                   onblur=dp_blur(); onfocus="return dp_focus('day');" 
				                   maxLength=2 onchange=dp_change(); size=2 value=<%=day%> 
				                   name=birthday_day> 
							<SPAN class=DPSep></SPAN>
							<IMG class=DPimg title=点击选择日期 
				                 onclick="GetCalendar(this,'birthday'); return false;" 
				                 src="../images/calendar/calendar.gif"> 
				             <INPUT id=birthday type=hidden value="<fmt:formatDate value="${user.birthday }" type="date" />"
				                   name="birthday"> 
				 			</SPAN>
				 			</FONT>
				 			</TD>
                            </TR>
                    <TR>
                        <TD class=blue_link height=30>头&nbsp;&nbsp;&nbsp;&nbsp;像&nbsp;&nbsp;&nbsp;&nbsp;：&nbsp;
                              <SELECT 
                              id=ddlFace style="WIDTH: 152px" 
                              name="photo"> <OPTION value=1 
                                selected>1.gif</OPTION> <OPTION 
                                value=2>2.gif</OPTION> <OPTION 
                                value=3>4.gif</OPTION> <OPTION 
                                value=4>5.gif</OPTION> <OPTION 
                                value=5>6.gif</OPTION> <OPTION 
                                value=6>7.gif</OPTION> <OPTION 
                                value=7>8.gif</OPTION>
                               </SELECT>
                                </TD>
                               </TR>
                    <TR>
                      <TD class=blue_link height=30>电子邮件 ：&nbsp;<INPUT 
                        class=input_modify id=txtEmail value="${user.email }"
                        name="email"> <SPAN id=RegularExpressionValidator1 
                        style="VISIBILITY: hidden; COLOR: red">邮箱名不符合规范</SPAN></TD></TR>
                    <TR>
                      <TD background=${ctx}/images/register/dotline1.jpg><IMG height=1 
                        src="${ctx}/images/register/_space.gif" width=1>
                       </TD>
                    </TR>
                    <TR>
                      <TD class=hot_link height=30>
                      	<button onclick="showMod()">
								修改密码
						</button>
						<input type=hidden name="doModPWD" value="0">
						</TD></TR>
                    <TR>
                      <TD height=30>
                        <TABLE id="modfiy_pwd" cellSpacing=0 cellPadding=0 width="80%" style="display:none"
                        align=center border=0>
                          <TBODY>
                          <TR>
                            <TD height=22>原始密码：</TD>
                            <TD><SPAN class=blue_link>&nbsp; <INPUT 
                              class=input_modify id=txtOldPassword type=password 
                              name=oldPassword> </SPAN></TD></TR>
                          <TR>
                            <TD height=22>修改密码：</TD>
                            <TD><SPAN class=blue_link>&nbsp; <INPUT 
                              class=input_modify id=txtNewPassword type=password 
                              name=newPassword> </SPAN></TD></TR>
                          <TR>
                            <TD width=100 height=22>确认密码：</TD>
                            <TD><SPAN class=blue_link>&nbsp; <INPUT 
                              class=input_modify id=txtConfirmPassword 
                              type=password name=confirmPassword> 
                          </SPAN></TD></TR>
                          </TBODY></TABLE>
                       </TD>
                       </TR>
                       <TR>
                            <TD height=30>
                              <DIV align=center>&nbsp; <INPUT style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px" 
                              type=image src="${ctx}/images/register/submit.jpg" > 
                    </DIV></TD></TR>
                       </TBODY></TABLE></TD></TR>
              <TR>
                <TD>&nbsp;</TD></TR></TBODY></TABLE></TD>
          <TD background=${ctx}/images/register/a6.jpg><IMG height=1 
            src="${ctx}/images/register/_space.gif" width=1></TD></TR>
        <TR>
          <TD width=7><IMG height=8 src="${ctx}/images/register/a3.jpg" width=7></TD>
          <TD background=${ctx}/images/register/a4.jpg><IMG height=1 
            src="${ctx}/images/register/_space.gif" width=1></TD>
          <TD width=7><IMG height=8 src="${ctx}/images/register/a5.jpg" 
        width=7></TD></TR></TBODY></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
        <TBODY>
        <TR>
          <TD height=10><IMG height=1 src="${ctx}/images/register/_space.gif" 
        width=1></TD></TR></TBODY></TABLE></TD></TR>
  <TR>
    <TD>&nbsp;</TD></TR></TBODY></TABLE>
    </form>
    <SCRIPT language=javascript>
		var _DatePickerCssPath='../css/calendar.css';
		var _DatePickerImagePath='../images/calendar/';
	</SCRIPT>
    <SCRIPT language=javascript src="${ctx}/js/calendar.js"></SCRIPT>
	<IFRAME id=iFrmCalendar style="DISPLAY: none" name=iFrmCalendar 
	src="about:blank"></IFRAME>
    <%@ include file="foot.jsp"%>
    </BODY></HTML>