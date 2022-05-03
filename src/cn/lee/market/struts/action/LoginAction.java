/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.UserDAO;
/*    */ import cn.lee.market.model.User;
/*    */ import cn.lee.market.struts.actionform.LoginForm;
/*    */ import java.io.PrintStream;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class LoginAction extends Action
/*    */ {
/* 18 */   UserDAO uDao = new UserDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 24 */     LoginForm loginForm = (LoginForm)form;
/*    */ 
/* 26 */     HttpSession session = request.getSession();
/*    */ 
/* 28 */     User user = this.uDao.getUser(loginForm);
/* 29 */     if (user != null)
/*    */     {
/* 31 */       session.removeAttribute("user");
/* 32 */       session.setAttribute("user", user);
/*    */ 
/* 34 */       if (user.getRole() == 0)
/* 35 */         session.setAttribute("role", "admin");
/*    */     }
/*    */     else {
/* 38 */       request.setAttribute("loginError", "login Error!");
/* 39 */     }return mapping.findForward("index");
/*    */   }
/*    */ 
/*    */   private User login(String username, String password)
/*    */   {
/* 44 */     User user = null;
/* 45 */     UserDAO uDao = new UserDAO();
/* 46 */     if ((username == null) || ("".equals(username)) || (password == null) || ("".equals(password)))
/* 47 */       return null;
/* 48 */     user = uDao.findByUsername(username);
/* 49 */     System.out.println(user.getUsername() + ":" + user.getPassword() + ":{" + password.equals(user.getPassword()) + "}");
/* 50 */     return user;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.LoginAction
 * JD-Core Version:    0.6.1
 */