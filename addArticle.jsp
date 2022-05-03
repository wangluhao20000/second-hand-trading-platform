<%@ page language="java" pageEncoding="GBK" errorPage="error.jsp"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<TITLE>陕科大学生二手交易平台-二手指南</TITLE>
		<META NAME="Generator" CONTENT="EditPlus">
		<META NAME="Author" CONTENT="">
		<META NAME="Keywords" CONTENT="">
		<META NAME="Description" CONTENT="">
		<LINK href="css/home.css" type=text/css rel=stylesheet>
	</HEAD>
	<body onmousemove=HideMenu()>
		<SCRIPT language=JavaScript src="js/home.js" type=text/JavaScript></SCRIPT>
		<%@ include file="page/top.jsp"%>
		<TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
			<TBODY>
				<TR>
					<TD vAlign=top width=118 bgColor=#f2f2f2>
						<TABLE cellSpacing=0 cellPadding=0 width=180 border=0>
							<TBODY>
								<TR>
									<TD width=142>
										<IMG height=50 src="${ctx}/images/page/left1_1.jpg" width=180>
									</TD>
								</TR>
								<TR>
									<TD align=middle width=142 height=100>
										<div style="TEXT-ALIGN: CENTER">
											<FONT face=宋体> <%@include file="page/user.jsp"%>
											</FONT>
										</div>
									</TD>
								</TR>
								<TR>
									<TD width=142>
										<IMG height=50 src="${ctx}/images/page/left1_4.jpg" width=180>
									</TD>
								</TR>
								<TR>
									<TD align=middle width=142 height=100>
										<FONT face=宋体> <%@include
												file="page/search_condiction.jsp"%>
										</FONT>
									</TD>
								</TR>
								<TR>
									<TD width=142>
										<IMG height=50 src="${ctx}/images/page/left1_2.jpg" width=180>
									</TD>
								</TR>
								<TR>
									<TD vAlign=top align=middle height=220>
										<TABLE width="98%">
											<TBODY>
												<TR>
													<TD height=2></TD>
												</TR>
											</TBODY>
										</TABLE>
										<%@include file="message/topMessage.jsp"%>
										<TABLE width="98%">
											<TBODY>
												<TR>
													<TD height=2></TD>
												</TR>
											</TBODY>
										</TABLE>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
					<TD vAlign=top width=640>
						<%@include file="admin/articleForm.jsp"%>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		<IFRAME src="page/status.html" height=70 frameBorder=0 width="760"
			SCROLLING=NO align=center>
			请确保您的浏览器支持框架
		</IFRAME>
	</body>
</html>