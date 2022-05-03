/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.model.Message;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class DeleteMessageAction extends Action
/*    */ {
/* 16 */   MessageDAO mDao = new MessageDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 22 */     String messageid = request.getParameter("messageid");
/* 23 */     Message message = this.mDao.findById(messageid);
/* 24 */     this.mDao.delete(message);
/* 25 */     return mapping.findForward("myMessage");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.DeleteMessageAction
 * JD-Core Version:    0.6.1
 */