<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<TITLE>科大二手平台——注册</TITLE>
		<META content=C# name=CODE_LANGUAGE>
		<LINK href="../css/register.css" type=text/css rel=stylesheet>
		<SCRIPT language=javascript>
		function changebg(obj,bg){
		obj.background = bg;
		}
		</SCRIPT>
	</HEAD>
	<BODY>
	<%@ include file="top.jsp"%>
	<TABLE id=Table4 cellSpacing=0 cellPadding=0 width=760 align=center border=0>
  <TBODY>
  <TR>
    <TD><IMG height=24 src="${ctx}/images/register/reg_top.jpg" width=295></TD></TR>
  <TR>
    <TD bgColor=#55b4e2>
      <TABLE id=Table5 cellSpacing=0 cellPadding=0 width=760 align=center 
      border=0>
        <TBODY>
        <TR>
          <TD height=10><IMG height=1 src="${ctx}/images/register/_space.gif" 
        width=1></TD></TR></TBODY></TABLE>
      <TABLE id=Table6 cellSpacing=0 cellPadding=0 width="98%" align=center 
      border=0>
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
            <TABLE id=Table7 cellSpacing=0 cellPadding=0 width=704 align=center 
            border=0>
              <TBODY>
<%--              <TR>--%>
<%--                <TD>--%>
<%--                  <DIV align=center><IMG height=93 src="${ctx}/images/register/reg_info.jpg" --%>
<%--                  width=704></DIV></TD></TR>--%>
              <TR>
                <TD>&nbsp;</TD></TR>
              <TR>
                <TD class=box_border height=400><IFRAME 
                  src="${ctx}/user_info/reg_info.htm" frameBorder=0 width="98%" 
                  height=400>请确保您的浏览器支持框架</IFRAME></TD></TR>
              <TR>
                <TD height=50>
                  <TABLE id=Table8 cellSpacing=0 cellPadding=0 width="50%" 
                  align=center border=0>
                    <TBODY>
                    <TR>
                      <TD><A 
                        href="${ctx}/user_info/toRegister.do">
                        <DIV align=center><IMG id=IMG1 height=26 
                        src="${ctx}/images/register/reg_agree.jpg" width=127 border=0><FONT 
                        face=宋体></FONT></DIV></A></TD>
                      <TD>
                        <DIV align=center><A 
                        href="javascript:window.close()"><IMG height=26 
                        src="${ctx}/images/register/reg_disagree.jpg" width=127 
                        border=0></A></DIV></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD>
          <TD background=${ctx}/images/register/a6.jpg><IMG height=1 
            src="${ctx}/images/register/_space.gif" width=1></TD></TR>
        <TR>
          <TD width=7><IMG height=8 src="${ctx}/images/register/a3.jpg" width=7></TD>
          <TD background=${ctx}/images/register/a4.jpg><IMG height=1 
            src="${ctx}/images/register/_space.gif" width=1></TD>
          <TD width=7><IMG height=8 src="${ctx}/images/register/a5.jpg" 
        width=7></TD></TR></TBODY></TABLE>
      <TABLE id=Table9 cellSpacing=0 cellPadding=0 width=760 align=center 
      border=0>
        <TBODY>
        <TR>
          <TD height=10><IMG height=1 src="${ctx}/images/register/_space.gif" 
        width=1></TD></TR></TBODY></TABLE></TD></TR>
  <TR>
    <TD>&nbsp;</TD></TR></TBODY></TABLE>
    <%@ include file="foot.jsp"%>
    </BODY></HTML>