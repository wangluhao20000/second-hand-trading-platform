/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.model.Message;
/*    */ import cn.lee.market.model.User;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class ToPostAction extends Action
/*    */ {
/* 17 */   MessageDAO mDao = new MessageDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 23 */     String messageid = request.getParameter("messageid");
/* 24 */     User user = (User)request.getSession().getAttribute("user");
/* 25 */     if (user == null)
/*    */     {
/* 27 */       request.setAttribute("nologin", "nologin");
/* 28 */       return mapping.findForward("noLogin");
/*    */     }
/* 30 */     if (messageid != null)
/*    */     {
/* 32 */       Message message = this.mDao.findById(messageid);
/* 33 */       request.setAttribute("message", message);
/*    */     }
/* 35 */     return mapping.findForward("messageform");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.ToPostAction
 * JD-Core Version:    0.6.1
 */