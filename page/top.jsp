<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
	<TBODY>
		<TR>
			<TD>
				<TABLE cellSpacing=1 cellPadding=0 width="100%" border=0>
					<TBODY>
						<TR>
							<TD width=190 bgColor=#ff9900 height=25>
								<DIV class=efont align=center>
									<STRONG>二手交易平台</STRONG>
								</DIV>
							</TD>
							<TD class=blank vAlign=bottom align=right>
								<A class=blank href="http://www.sust.edu.cn" target="">科大首页</A> |
								<A class=blank href="http://bbs.sust.edu.cn/" target="">科大论坛</A>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
				<TABLE cellSpacing=0 cellPadding=0 width=760 border=0>
					<TBODY>
						<TR>
							<TD bgColor=#000000 height=1>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
			</TD>
		</TR>
	</TBODY>
</TABLE>
<!-- 开头 end-->

<!-- 图begin-->
<TABLE cellSpacing=0 cellPadding=0 width="760" align=center border=0>
	<TBODY>
		<TR>
			<TD width=200 height=82>
				<IMG height=38 src="${ctx}/images/page/logo.jpg" width=180>
			</TD>
			<TD width=560>
				<DIV align=center>
					<IMG src="${ctx}/images/page/mai.jpg" width=560>
				</DIV>
			</TD>
		</TR>
	</TBODY>
</TABLE>
<!-- 图 end-->

<SCRIPT language=JavaScript src="${ctx}/js/page/menu.js"
	type=text/JavaScript></SCRIPT>
<script type="text/javascript">
	var list="<a href=type.do?typeid=1>电脑及配置</a><br><a href=type.do?typeid=2>通讯器材</a><br><a href=type.do?typeid=3>视听设备</a><br><a href=type.do?typeid=4>书籍报刊</a><br><a href=type.do?typeid=5>生活服务</a><br><a href=type.do?typeid=6>房屋信息</a><br><a href=type.do?typeid=7>交通工具</a><br><a href=type.do?typeid=8>其它物品</a><br>"
</script>
<DIV id=menuDiv 
style="Z-INDEX: 2; VISIBILITY: hidden; WIDTH: 1px; POSITION: absolute; HEIGHT: 1px; BACKGROUND-COLOR: #9cc5f8"></DIV>
<TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
  <TBODY>
  <TR>
    <TD width=161 rowSpan=3><IMG height=54 src="${ctx}/images/page/top1_1.jpg" 
      width=161></TD>
    <TD width=552><IMG height=15 src="${ctx}/images/page/top2_1.jpg" width=552></TD>
    <TD width=47 rowSpan=3><IMG height=54 src="${ctx}/images/page/top3_1.jpg" 
    width=47></TD></TR>
  <TR>
    <TD height=31>
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD width="22%"><A id=Head1_HyperLink1 
            href="index.do"><IMG 
            style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px" 
            alt=市场首页 src="${ctx}/images/page/top2_2_1.jpg"></A></TD>
          <TD width="7%">&nbsp;</TD>
          <TD width="18%"><IMG onmouseover=ShowMenu(list,90)
            height=31 src="${ctx}/images/page/top2_2_2.jpg" width=91 border=0></TD>
          <TD width="9%">&nbsp;</TD>
          <TD width="17%"><A id=Head1_HyperLink2 
            href="topost.do"><IMG 
            style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px" 
            alt=发布信息 src="${ctx}/images/page/top2_2_3.jpg"></A></TD>
          <TD width="9%">&nbsp;</TD>
          <TD width="18%"><A id=Head1_HyperLink3 
            href="guidelist.do"><IMG 
            style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px" 
            alt=二手指南 src="${ctx}/images/page/top2_2_4.jpg"></A></TD>
		</TR>
		</TBODY>
		</TABLE>
	</TD>
  </TR>
  <TR>
    <TD><IMG height=8 src="${ctx}/images/page/top2_3.jpg" width=552></TD>
  </TR>
  </TBODY>
</TABLE>
  <!-- 主菜单 end-->