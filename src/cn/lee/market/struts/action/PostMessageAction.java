/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.AreaDAO;
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.dao.TypeDAO;
/*    */ import cn.lee.market.model.Message;
/*    */ import cn.lee.market.model.User;
/*    */ import cn.lee.market.struts.actionform.PostMessageForm;
/*    */ import java.util.Date;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class PostMessageAction extends Action
/*    */ {
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 28 */     MessageDAO mDao = new MessageDAO();
/* 29 */     TypeDAO tDao = new TypeDAO();
/* 30 */     AreaDAO aDao = new AreaDAO();
/* 31 */     PostMessageForm postForm = (PostMessageForm)form;
/*    */ 
/* 33 */     User user = (User)request.getSession().getAttribute("user");
/* 34 */     Message message = null;
/* 35 */     if (postForm != null)
/*    */     {
/* 38 */       message = postForm.getMessage();
/* 39 */       message.setCreate_time(new Date());
/* 40 */       message.setMArea(aDao.findById(postForm.getAreaid()));
/* 41 */       message.setMType(tDao.findById(postForm.getTypeid()));
/* 42 */       message.setTUser(user);
/*    */     }
/* 44 */     String messageid = request.getParameter("messageid");
/*    */ 
/* 47 */     if ((messageid != null) && (!"".equals(messageid)))
/*    */     {
/* 49 */       message = mDao.findById(messageid);
/* 50 */       message.setMessage_title(postForm.getMessage_title());
/* 51 */       message.setold_value(postForm.getOld_value().shortValue());
/* 52 */       message.setFlag((short)postForm.getFlag());
/* 53 */       message.setMessage_desc(postForm.getMessage_desc());
/* 54 */       message.setPrice(postForm.getPrice());
/* 55 */       message.setR_user(postForm.getR_user());
/* 56 */       message.setR_email(postForm.getR_email());
/* 57 */       message.setR_phone(postForm.getR_phone());
/* 58 */       message.setMArea(aDao.findById(postForm.getAreaid()));
/* 59 */       message.setMType(tDao.findById(postForm.getTypeid()));
/*    */     }
/*    */     else {
/* 62 */       mDao.save(message);
/*    */     }
/* 64 */     return mapping.findForward("mymessage");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.PostMessageAction
 * JD-Core Version:    0.6.1
 */