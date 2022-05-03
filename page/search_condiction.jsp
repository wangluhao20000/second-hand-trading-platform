<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<form action="searchMessage.do" method="post">
<TABLE id=Table1 style="WIDTH: 177px; HEIGHT: 148px" cellSpacing=2
	cellPadding=0 width=177 align=center border=0>
	<TBODY>
		<TR>
			<TD width=45 height=25>
				<DIV align=center>
					关键字
				</DIV>
			</TD>
			<TD width=97>
				<INPUT id=Search1_KeySBox style="WIDTH: 115px" name="keyword">
			</TD>
		</TR>
		<TR>
			<TD height=25>
				<DIV align=center>
					分类
				</DIV>
			</TD>
			<TD>
				<SELECT id=Search1_TypeSList style="WIDTH: 112px"
					name="typeid">
					<c:forEach items="${typeMap }" var="type">
						<option value="${type.key }">
							${type.value }
						</option>
					</c:forEach>
					<OPTION value="allType" selected>
						所有物品类别
					</OPTION>
				</SELECT>
			</TD>
		</TR>
		<TR>
			<TD height=25>
				<DIV align=center>
					属性
				</DIV>
			</TD>
			<TD>
				<SELECT id=Search1_ProSList style="WIDTH: 88px"
					name="flag">
					<OPTION value="0">
						出售
					</OPTION>
					<OPTION value="1">
						求购
					</OPTION>
					<OPTION value="2" selected>
						所有买卖
					</OPTION>
				</SELECT>
			</TD>
		</TR>
		<TR>
			<TD height=25>
				<DIV align=center>
					地区
				</DIV>
			</TD>
			<TD>
				<SELECT id=Search1_LocSList style="WIDTH: 88px"
					name="areaid">
					<c:forEach items="${areaMap }" var="area">
						<option value="${area.key }">
							${area.value }
						</option>
					</c:forEach>
					<OPTION value="allArea" selected>
						所有地区
					</OPTION>
				</SELECT>
			</TD>
		</TR>
		<TR>
			<TD colSpan=2 height=25>
				<DIV align=center>
					<INPUT id=Search1_btnSearch
						style="WIDTH: 40px; HEIGHT: 21px" type=submit value=搜索
						name=btnSearch>
					&nbsp;
					<INPUT id=Search1_btnReset
						style="WIDTH: 40px; HEIGHT: 21px" type=reset value=重置
						name=btnReset/>
				</DIV>
			</TD>
		</TR>
	</TBODY>
</TABLE>
 </form>