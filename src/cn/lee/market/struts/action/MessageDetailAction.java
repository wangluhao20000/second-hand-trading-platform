/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.CommentDAO;
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.model.Message;
/*    */ import java.io.PrintStream;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class MessageDetailAction extends Action
/*    */ {
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 22 */     MessageDAO mDao = new MessageDAO();
/* 23 */     Message message = null;
/*    */ 
/* 25 */     String messageid = request.getParameter("messageid");
/*    */ 
/* 27 */     if (messageid == null)
/* 28 */       messageid = (String)request.getAttribute("messageid");
/* 29 */     System.out.println("after post messageid:" + messageid);
/*    */ 
/* 31 */     if (messageid == null) {
/* 32 */       message = (Message)request.getAttribute("message");
/*    */     }
/*    */     else {
/* 35 */       message = mDao.findById(messageid);
/* 36 */       message.setTop_value(Integer.valueOf(message.getTop_value().intValue() + 1));
/*    */     }
/*    */ 
/* 45 */     CommentDAO cDao = new CommentDAO();
/* 46 */     request.setAttribute("message", message);
/* 47 */     request.setAttribute("comments", cDao.findAllCommentOfMessage(message));
/* 48 */     return mapping.findForward("messageDetail");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.MessageDetailAction
 * JD-Core Version:    0.6.1
 */