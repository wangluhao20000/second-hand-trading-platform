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
/*    */ public class MyMessagePageAction extends Action
/*    */ {
/* 19 */   private int size = 0;
/* 20 */   private int page = 0;
/* 21 */   private int first = 0;
/* 22 */   private int last = 0;
/* 23 */   private int cur_page = 0;
/* 24 */   MessageDAO mDao = new MessageDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 30 */     HttpSession session = request.getSession();
/* 31 */     User user = (User)session.getAttribute("user");
/* 32 */     List messageList = (List)request.getSession().getAttribute("myMessageList");
/* 33 */     if (request.getParameter("cur_page") != null)
/* 34 */       this.cur_page = Integer.parseInt(request.getParameter("cur_page"));
/*    */     else
/* 36 */       this.cur_page = 0;
/* 37 */     initPage(messageList);
/* 38 */     request.setAttribute("size", Integer.valueOf(this.size));
/* 39 */     request.setAttribute("page", Integer.valueOf(this.page));
/* 40 */     request.setAttribute("first", Integer.valueOf(this.first));
/* 41 */     request.setAttribute("last", Integer.valueOf(this.last));
/* 42 */     request.setAttribute("cur_page", Integer.valueOf(this.cur_page));
/* 43 */     return mapping.findForward("myMessage");
/*    */   }
/*    */ 
/*    */   public void initPage(List<Message> messageList) {
/* 47 */     this.size = messageList.size();
/* 48 */     this.page = ((int)Math.ceil(this.size * 1.0D / 20.0D) - 1);
/* 49 */     this.first = (20 * this.cur_page);
/* 50 */     this.last = (20 * this.cur_page + 19);
/* 51 */     if (this.last > this.size - 1)
/* 52 */       this.last = (this.size - 1);
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.MyMessagePageAction
 * JD-Core Version:    0.6.1
 */