<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="../common/taglibs.jsp"%>
<%@ page import="java.util.*" %>
<%Calendar cal = Calendar.getInstance();
int year = cal.get(Calendar.YEAR);
int month = cal.get(Calendar.MONTH)+1;
int day= cal.get(Calendar.DAY_OF_MONTH);
String today = year+"-"+month+"-"+day;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<TITLE>�ƴ����ƽ̨����ע��</TITLE>
		<LINK href="${ctx}/css/register.css" type=text/css rel=stylesheet>
		<LINK href="${ctx}/css/calendar.css" type=text/css rel=stylesheet>
	</HEAD>
	<BODY>
	<SCRIPT language=JavaScript src="${ctx}/js/check.js" type=text/JavaScript></SCRIPT>
	<%@ include file="top.jsp"%>
	<form action="doRegister.do" method="post" name="regFrom">
<TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
  <TBODY>
  <TR>
    <TD><IMG height=24 src="${ctx}/images/register/reg_top.jpg" width=295></TD>
  </TR>
  <TR>
    <TD bgColor=#55b4e2>
      <TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
        <TBODY>
        <TR>
          <TD height=10>
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
<%--              <TR>--%>
<%--                <TD>--%>
<%--                  <DIV align=center><IMG height=93 --%>
<%--                  src="${ctx}/images/register/reg_info.jpg" width=704></DIV></TD></TR>--%>
              <TR>
                <TD>&nbsp;</TD></TR>
              <TR>
                <TD class=box_border vAlign=top height=400>
                  <TABLE cellSpacing=0 cellPadding=0 width=600 align=center 
                  border=0>
                    <TBODY>
                    <TR>
                      <TD>
                        <TABLE cellSpacing=0 cellPadding=0 width=600 border=0>
                          <TBODY>
                          <TR>
                            <TD width=29 height=44>2</TD>
                            <TD class=f14><B>��д���˻�������</B></TD></TR></TBODY></TABLE>
                        <TABLE height=border=0 cellSpacing=0 cellPadding=0 
                        width=600>
                          <TBODY>
                          <TR align=middle>
                            <TD class=f12 colSpan=4><FONT color=#ff0000 
                              size=3></FONT></TD></TR>
                          <TR>
                            <TD class=f14 colSpan=4 height=25><FONT 
                              color=red>ע��������Ϣ����"*"�ŵ�Ϊ������</FONT></TD></TR>
                          <TR>
                            <TD class=f14 width=111 height=32><FONT 
                              face=����>&nbsp;&nbsp;&nbsp;&nbsp;<SPAN 
                              class=black><FONT color=#ff0000>*</FONT></SPAN> 
                              ƽ̨�ʺ�:</FONT></TD>
                            <TD width=319 colSpan=2><SPAN 
                              id=lblUserName><INPUT 
                              style="WIDTH: 80%" maxLength=16 
                            name="username" onblur="checkUsernameFormat(this)"></SPAN></TD>
                            <TD align=left>
                              <SPAN id=usernameValidator
                              style="VISIBILITY: hidden; COLOR: red">�û���������Ҫ��</SPAN></TD></TR>
                          <TR>
                            <TD  class=title1 colspan=4>
                              <P> ƽ̨�ʺŸ�ʽ��4��16λ����ʹ��Ӣ�ġ�����(0-9)&nbsp;&nbsp;���»���(_)����� </P>
                          <TR>
                            <TD class=f14 align=right width=111 
                              height=31><SPAN class=black><FONT 
                              color=#ff0000>*</FONT></SPAN>ѧ��<SPAN 
                              class=f14><FONT face=����>:</FONT></SPAN></TD>
                            <TD width=319 colSpan=2><INPUT id=txtRealName
                              style="WIDTH��80%" maxLength=20 name="stu_id" maxLength=12></TD>
                            <TD align=left>&nbsp; <SPAN 
                              id=RequiredFieldValidator5 
                              style="VISIBILITY: hidden; COLOR: red">����Ϊ��</SPAN></TD></TR>
                          <TR>
                            <TD class=f14 align=right width=111 
                              height=46><FONT face=����><FONT 
                              color=#ff0000>*</FONT>���գ�</FONT></TD>
                            <TD width=319 colSpan=2 height=46>
                            <FONT face=����>
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
							<IMG class=DPimg title=���ѡ������ 
				                 onclick="GetCalendar(this,'birthday'); return false;" 
				                 src="../images/calendar/calendar.gif"> 
				             <INPUT id=birthday type=hidden value=<%=today%> 
				                   name="birthday"> 
				 			</SPAN>
				 			</FONT>
				 			</TD>
                            <TD align=left height=46></TD></TR>
                          <TR>
                            <TD class=f14 align=right width=111 
                              height=65><FONT color=#ff0000>*</FONT>E-mail��</TD>
                            <TD width=319 colSpan=2 height=65><FONT 
                              face=����><INPUT id=txtEmail style="WIDTH: 80%" 
                              name="email"></FONT></TD>
                            <TD align=left height=65>
                              <P class=f14><SPAN class=paihang_money 
                              style="FONT-SIZE: 12px">��ȷ���ʼ�����ʵ�ԣ����㽻��</SPAN> 
                              <SPAN id=RegularExpressionValidator1 
                              style="VISIBILITY: hidden; COLOR: red">�����������Ϲ淶</SPAN> 
                              </P></TD></TR>
                          <TR>
                            <TD class=f14 align=right width=111 
                            height=65><FONT 
                              color=#ff0000>*</FONT>ͷ��</TD>
                            <TD align=left width=50 colSpan=2 
                            height=65><FONT face=����></FONT>
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
                                <TD align=left height=65>
                              <P class=f14><SPAN class=paihang_money 
                              style="FONT-SIZE: 12px"></SPAN> 
                              <SPAN id=RegularExpressionValidator1 
                              style="VISIBILITY: hidden; COLOR: red"></SPAN> 
                              </P></TD>
                          </TR>
                          <TR>
                            <TD class=f14 align=right width=111><FONT 
                              color=#ff0000>*</FONT>��&nbsp;&nbsp;�룺</TD>
                            <TD width=319 colSpan=2><FONT face=����><INPUT 
                              id=txtPassword style="WIDTH: 60%" type=password 
                              maxLength=20 name="password"></FONT></TD>
                            <TD align=left><SPAN style="FONT-SIZE: 12px"><FONT 
                              color=#ff0000><SPAN id=RequiredFieldValidator1 
                              style="VISIBILITY: hidden; COLOR: red">���벻��Ϊ��</SPAN> 
                              </FONT></SPAN></TD></TR>
                          <TR>
                            <TD class=f14 align=right width=111><FONT 
                              color=#ff0000>*</FONT>ȷ�����룺</TD>
                            <TD width=319 colSpan=2><FONT face=����><INPUT 
                              id=txtConfirm style="WIDTH: 60%" type=password 
                              maxLength=20 name="repassword"></FONT></TD>
                            <TD class=f14 align=left>
                              <P class=f14><SPAN class=paihang_money 
                              style="FONT-SIZE: 12px">�ٴ���������</SPAN></P></TD></TR>
                          <TR>
                            <TD colSpan=4 height=12></TD></TR>
                          <TR>
                            <TD colSpan=4 height=4><FONT face=����></FONT></TD></TR>
                          <TR>
                            <TD colSpan=4 height=4></TD></TR>
                          <TR>
                            <TD class=f14 align=right width=111><FONT 
                              color=#ff0000>*</FONT>�����ѯ���⣺</TD>
                            <TD width=319 colSpan=2><FONT face=����><INPUT 
                              id=txtTipQuestion name="question"></FONT></TD>
                            <TD class=f14 align=left>
                              <P class=f14>
                              <SPAN id=RequiredFieldValidator4 
                              style="VISIBILITY: hidden; COLOR: red">����Ϊ��</SPAN> 
                              </P></TD></TR>
                          <TR>
                            <TD class=f14 align=right width=111><FONT 
                              color=#ff0000>*</FONT>�����ѯ�𰸣�</TD>
                            <TD width=319 colSpan=2><FONT face=����><INPUT 
                              id=txtTipAnswer name="answer"></FONT></TD>
                            <TD align=left><SPAN style="FONT-SIZE: 12px"><SPAN 
                              id=RequiredFieldValidator2 
                              style="VISIBILITY: hidden; COLOR: red">����Ϊ��</SPAN> 
                              </SPAN></TD></TR></TBODY></TABLE>
<%--                        <TABLE cellSpacing=0 cellPadding=0 width="90%" --%>
<%--                        align=center>--%>
<%--                          <TBODY>--%>
<%--                          <TR>--%>
<%--                            <TD height=25></TD></TR>--%>
<%--                          <TR>--%>
<%--                            <TD class=f14>ϵͳ��֤ ������ͼƬ�п������ַ�����</TD></TR>--%>
<%--                          <TR>--%>
<%--                            <TD height=10>--%>
<%--                              <TABLE cellSpacing=4 cellPadding=0 width=100 --%>
<%--                              align=center bgColor=#0066ff border=0>--%>
<%--                                <TBODY>--%>
<%--                                <TR>--%>
<%--                                <TD class=black bgColor=#0066ff><FONT --%>
<%--                                face=����><img id=ibValidate --%>
<%--                                style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; WIDTH: 100%; BORDER-RIGHT-WIDTH: 0px" --%>
<%--                                src="${ctx}/common/randomNumber.jsp" ></FONT></TD></TR></TBODY></TABLE>--%>
<%--                             </TD></TR>--%>
<%--                          <TR>--%>
<%--                            <TD><SPAN class=f14><FONT --%>
<%--                              color=#ff0000>*</FONT>����"ϵͳ��֤"ͼƬ�еķ��ţ�</SPAN>&nbsp; --%>
<%--                              <INPUT id=txtValidate --%>
<%--                              name="randCode"> <SPAN id=RequiredFieldValidator3 --%>
<%--                              style="VISIBILITY: hidden; COLOR: red">����Ϊ��</SPAN></TD></TR></TBODY></TABLE>--%>
                              </TD></TR></TBODY></TABLE></TD></TR>
              <TR>
                <TD height=50>
                  <TABLE cellSpacing=0 cellPadding=0 width="50%" align=center 
                  border=0>
                    <TBODY>
                    <TR>
                      <TD>
                        <DIV align=center><INPUT type=submit value="ע��" onclick="return reg_check(this.form);" name="submit">
                        </DIV></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD>
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