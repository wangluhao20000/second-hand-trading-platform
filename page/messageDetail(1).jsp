<%@ page language="java" pageEncoding="GB18030"%>
<%@ include file="/common/taglibs.jsp"%>
<script language=JavaScript>

function back(){
	window.location="index.do";
}
function showAdd(){
	var obj = eval("commentAdd");	
	var state = obj.style.display;	
	if(state == "none"){
		obj.style.display = "";
	}else{
		obj.style.display = "none";
	}
}
function deleteComment(commentid){
	var url = 'delComment.do?messageid=${message.id}&commentid=' + commentid;
	if(confirm('确认删除吗?'))
		window.location=url;
}
</script>
<SCRIPT language=JavaScript src="${ctx}/js/check.js" type=text/JavaScript></SCRIPT>
<TABLE cellSpacing=0 cellPadding=0 width=566 align=center border=0>
	<TBODY>
		<TR>
			<TD class=left2 background="${ctx}/images/page/type/right5_1_2.jpg"
				height=30>
				<SPAN id=LblType>二手信息</SPAN>
			</TD>
		</TR>
		<TR>
			<TD class="left , main" vAlign=top
				background="${ctx}/images/page/type/right5_2.jpg" height=255>
				<TABLE  style="border-collapse: collapse;"
					cellSpacing=0 border=1 width="566" height="756">
					<TBODY>
						<TR>
							<TD width=20% bgColor=#ffffff height=25>
								<DIV align=center>
									信息标题
								</DIV>
							</TD>
							<TD class=left width=80% bgColor=#ffffff>
								<SPAN id=HeadLabel>${message.message_title }</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25 width=20%>
								<DIV align=center>
									新旧程度
								</DIV>
							</TD>
							<TD class=left width=80% bgColor=#f7f7f7>
								<SPAN id=VerLabel>${message.old_value}成新</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25 width=20%>
								<DIV align=center>
									交易类型
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=ProLabel>${message.flag==0?"出售":"求购"}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25 width=20%> 
								<DIV align=center>
									所属类别
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=TypeLabel>${message.MType.type_desc}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25 width=20%>
								<DIV align=center>
									交易地区
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=LocLabel>${message.MArea.area_desc}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#f7f7f7 height=25 width=20%>
								<DIV align=center>
									物品价格
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=PriLabel>${message.price}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25 width=20%>
								<DIV align=center>
									发布时间
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=TimeLabel><fmt:formatDate value="${message.create_time }" type="date" dateStyle="medium" /></SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=25>
								<DIV align=center>
									联系人
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=ConnLabel>${message.r_user}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=25>
								<DIV align=center>
									E－mail
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=ConELabel>${message.r_email}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=25>
								<DIV align=center>
									联系方式
								</DIV>
							</TD>
							<TD class=left>
								<SPAN id=ConMLabel>${message.r_phone}</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD bgColor=#ffffff height=23>
								<DIV align=center>
									人气
								</DIV>
							</TD>
							<TD class=left height=23>
								<SPAN id=HitLabel>${message.top_value }</SPAN>
							</TD>
						</TR>
						<TR bgColor=#f7f7f7>
							<TD bgColor=#f7f7f7 height=134>
								<DIV align=center>
									物品简介
								</DIV>
							</TD>
							<TD class=left vAlign=top height=134>
								<SPAN id=IntroLabel>${message.message_desc }</SPAN>
							</TD>
						</TR>
						<TR bgColor=#ffffff>
							<TD height=25>
								<DIV align=center>
									用户留言
								</DIV>
							</TD>
							<TD class=left bgColor=#ffffff>
								<SPAN id=BookLabel>共有${fn:length(comments)}人留言。
									朋友，如果你对这条信息感兴趣，你可以留言！</SPAN>
							</TD>
						</TR>

						<c:forEach items="${comments }" var="comment">
							<TR>
								<TD bgColor=#ffffff colSpan=2 height=25>
									&nbsp;&nbsp;&nbsp;&nbsp;同学
									<FONT color=#3366cc>『 ${comment.TUser.username} 』</FONT>
									在<fmt:formatDate value="${comment.create_time }" type="date" dateStyle="medium" />留言:
									<c:if test="${not empty role}">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button onclick="deleteComment('${comment.id }');">管理员删除留言</button>
									</c:if>
								</TD>
							</TR>
							<TR>
								<TD bgColor=#f7f7f7 colSpan=2 height=25>
									${comment.content }
								</TD>
							</TR>
						</c:forEach>
						<tr>
							<TD colSpan=2>
								<IMG height=10 src="${ctx}/images/page/type/right5_3.jpg"
									width=566>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
			</TD>
		</TR>
		<c:if test="${not empty user }">
		<TR>
			<TD class="left , main" vAlign=top align=left
				background="${ctx}/images/page/type/right5_2.jpg" height=255>
				<form action="addComment.do" method="post" onsubmit="return(isNotEmpty(this.content,'内容不能为空！'))">
				<TABLE id=Table1 cellSpacing=0 cellPadding=0 width=565 align=center
					bgColor=#cccccc border=0>
					<TBODY>
						<TR>
							<TD class=left2 background="${ctx}/images/page/type/right5_1_3.jpg"
								height=30>
								
								<a onclick="showAdd()" href="#comment">
								<SPAN id=LblType>发表留言</SPAN>
								</a>	
							</TD>
						</TR>
						<TR>
							<TD class="left , main" vAlign=top align=left
								background="${ctx}/images/page/type/right5_2.jpg" height=255>
								<TABLE id="commentAdd" style="display:none" height=251
									cellSpacing=1 cellPadding=0 width=548 align=left
									bgColor=#cccccc border=0>
									<TBODY>
										<TR>
											<TD width=68 bgColor=#ffffff height=25>
												<DIV align=center>
													用户名
												</DIV>
											</TD>
											<TD class=left bgColor=#ffffff>
												${user.username }
											</TD>
										</TR>
										<TR bgColor=#ffffff>
											<TD width=68 bgColor=#ffffff height=25>
												<DIV align=center>
													E－mail
												</DIV>
											</TD>
											<TD class=left>
												${user.email }
											</TD>
										</TR>
										<TR bgColor=#f7f7f7>
											<TD align=middle width=68 bgColor=#f7f7f7 height=110>
												<FONT color=#ff0000 align="center">*</FONT>
												<a name="comment">内容</a>
											</TD>
											<TD class=left>
												<input type="hidden" name="messageid" value="${message.id}"/>
												<TEXTAREA id=ContentBox style="WIDTH: 369px; HEIGHT: 112px" name=content></TEXTAREA>
											</TD>
										</TR>
										<TR bgColor=#ffffff>
											<TD class=left align=middle colSpan=2 height=30>
												<INPUT type=submit value="提交" />
											</TD>
										</TR>
										<TR>
											<TD class=left colSpan=2 height=30>
												说明：标记*号的为必填项目
											</TD>
										</TR>
									</TBODY>
								</TABLE>
							</TD>
						</TR>
						<TR>
							<TD>
								<IMG height=10 src="${ctx}/images/page/type/right5_3.jpg" width=566>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
				</form>
			</TD>
		</TR>
		</c:if>
	</TBODY>
</TABLE>
