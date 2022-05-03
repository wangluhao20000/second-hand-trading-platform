/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.CommentDAO;
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.model.Comment;
/*    */ import cn.lee.market.model.Message;
/*    */ import cn.lee.market.model.User;
/*    */ import java.util.Date;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class AddCommentAction extends Action
/*    */ {
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 27 */     String content = request.getParameter("content");
/* 28 */     String messageid = request.getParameter("messageid");
/* 29 */     CommentDAO cDao = new CommentDAO();
/* 30 */     MessageDAO mDao = new MessageDAO();
/* 31 */     Message message = mDao.findById(messageid);
/* 32 */     Comment comment = new Comment();
/* 33 */     comment.setTMessage(message);
/* 34 */     comment.setContent(content);
/* 35 */     comment.setCreate_time(new Date());
/* 36 */     User user = (User)request.getSession().getAttribute("user");
/* 37 */     comment.setTUser(user);
/* 38 */     cDao.save(comment);
/*    */ 
/* 41 */     request.setAttribute("messageid", messageid);
/* 42 */     return mapping.findForward("messageDetail");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.AddCommentAction
 * JD-Core Version:    0.6.1
 */