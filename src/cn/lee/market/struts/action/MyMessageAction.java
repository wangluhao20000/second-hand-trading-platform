/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.model.Message;
/*    */ import cn.lee.market.model.User;
/*    */ import java.util.List;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class MyMessageAction extends Action
/*    */ {
/* 24 */   private int size = 0;
/* 25 */   private int page = 0;
/* 26 */   private int first = 0;
/* 27 */   private int last = 0;
/* 28 */   private int cur_page = 0;
/* 29 */   MessageDAO mDao = new MessageDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 35 */     HttpSession session = request.getSession();
/* 36 */     User user = (User)session.getAttribute("user");
/* 37 */     String manager = request.getParameter("manager");
/* 38 */     List messageList = this.mDao.getMyMessage(user);
/*    */ 
/* 40 */     if ((manager != null) && (user.getRole() == 0))
/* 41 */       messageList = this.mDao.getUserMessage(user);
/* 42 */     request.getSession().setAttribute("myMessageList", messageList);
/* 43 */     if (request.getParameter("cur_page") != null)
/* 44 */       this.cur_page = Integer.parseInt(request.getParameter("cur_page"));
/*    */     else
/* 46 */       this.cur_page = 0;
/* 47 */     initPage(messageList);
/* 48 */     request.setAttribute("size", Integer.valueOf(this.size));
/* 49 */     request.setAttribute("page", Integer.valueOf(this.page));
/* 50 */     request.setAttribute("first", Integer.valueOf(this.first));
/* 51 */     request.setAttribute("last", Integer.valueOf(this.last));
/* 52 */     request.setAttribute("cur_page", Integer.valueOf(this.cur_page));
/* 53 */     return mapping.findForward("myMessage");
/*    */   }
/*    */ 
/*    */   public void initPage(List<Message> messageList) {
/* 57 */     this.size = messageList.size();
/* 58 */     this.page = ((int)Math.ceil(this.size * 1.0D / 20.0D) - 1);
/* 59 */     this.first = (20 * this.cur_page);
/* 60 */     this.last = (20 * this.cur_page + 19);
/* 61 */     if (this.last > this.size - 1)
/* 62 */       this.last = (this.size - 1);
/* 63 */     if (this.size == 0)
/* 64 */       this.last = 0;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.MyMessageAction
 * JD-Core Version:    0.6.1
 */