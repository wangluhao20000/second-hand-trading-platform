/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.CommentDAO;
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.model.Comment;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class DelCommentAction extends Action
/*    */ {
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 26 */     String commentid = request.getParameter("commentid");
/* 27 */     String messageid = request.getParameter("messageid");
/* 28 */     CommentDAO cDao = new CommentDAO();
/* 29 */     MessageDAO mDao = new MessageDAO();
/*    */ 
/* 31 */     Comment comment = cDao.findById(commentid);
/* 32 */     cDao.delete(comment);
/* 33 */     request.setAttribute("messageid", messageid);
/* 34 */     return mapping.findForward("messageDetail");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.DelCommentAction
 * JD-Core Version:    0.6.1
 */