<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/common/taglibs.jsp"%>
<form action="searchMessage.do" method="post">
<TABLE id=Table1 style="WIDTH: 177px; HEIGHT: 148px" cellSpacing=2
	cellPadding=0 width=177 align=center border=0>
	<TBODY>
		<TR>
			<TD width=45 height=25>
				<DIV align=center>
					�ؼ���
				</DIV>
			</TD>
			<TD width=97>
				<INPUT id=Search1_KeySBox style="WIDTH: 115px" name="keyword">
			</TD>
		</TR>
		<TR>
			<TD height=25>
				<DIV align=center>
					����
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
						������Ʒ���
					</OPTION>
				</SELECT>
			</TD>
		</TR>
		<TR>
			<TD height=25>
				<DIV align=center>
					����
				</DIV>
			</TD>
			<TD>
				<SELECT id=Search1_ProSList style="WIDTH: 88px"
					name="flag">
					<OPTION value="0">
						����
					</OPTION>
					<OPTION value="1">
						��
					</OPTION>
					<OPTION value="2" selected>
						��������
					</OPTION>
				</SELECT>
			</TD>
		</TR>
		<TR>
			<TD height=25>
				<DIV align=center>
					����
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
						���е���
					</OPTION>
				</SELECT>
			</TD>
		</TR>
		<TR>
			<TD colSpan=2 height=25>
				<DIV align=center>
					<INPUT id=Search1_btnSearch
						style="WIDTH: 40px; HEIGHT: 21px" type=submit value=����
						name=btnSearch>
					&nbsp;
					<INPUT id=Search1_btnReset
						style="WIDTH: 40px; HEIGHT: 21px" type=reset value=����
						name=btnReset/>
				</DIV>
			</TD>
		</TR>
	</TBODY>
</TABLE>
 </form>