/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.model.User;
/*    */ import cn.lee.market.util.DateConverter;
/*    */ import java.io.PrintStream;
/*    */ import java.util.Date;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class ModifyInfoAction extends Action
/*    */ {
/* 18 */   DateConverter dc = new DateConverter();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 24 */     HttpSession session = request.getSession();
/* 25 */     User user = (User)session.getAttribute("user");
/* 26 */     String result = null;
/* 27 */     result = "修改成功！点确定进入市场主页！";
/*    */ 
/* 29 */     String photo_ = request.getParameter("photo");
/* 30 */     int photo = Integer.parseInt(photo_);
/* 31 */     String str = request.getParameter("birthday");
/* 32 */     Date birthday = (Date)this.dc.convert(Date.class, str);
/* 33 */     System.out.println(str + "->" + birthday);
/* 34 */     String email = request.getParameter("email");
/* 35 */     String doModPWD = request.getParameter("doModPWD");
/* 36 */     if ("1".equals(doModPWD))
/*    */     {
/* 38 */       String oldPassword = request.getParameter("oldPassword");
/* 39 */       String newPassword = request.getParameter("newPassword");
/* 40 */       String confirmPassword = request.getParameter("confirmPassword");
/* 41 */       if (oldPassword.equals(user.getPassword()))
/*    */       {
/* 43 */         if (newPassword.equals(confirmPassword)) {
/* 44 */           user.setPassword(newPassword);
/*    */         }
/*    */         else {
/* 47 */           request.setAttribute("error", "error");
/* 48 */           result = "修改密码与确认密码不同！请重新输入！";
/*    */         }
/*    */       }
/*    */       else
/*    */       {
/* 53 */         request.setAttribute("error", "error");
/* 54 */         result = "原始密码输入错误！请重新输入！";
/*    */       }
/*    */     }
/* 57 */     user.setBirthday(birthday);
/* 58 */     user.setEmail(email);
/* 59 */     user.setPhoto((short)photo);
/*    */ 
/* 61 */     request.setAttribute("result", result);
/* 62 */     return mapping.findForward("modifyInfo");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.ModifyInfoAction
 * JD-Core Version:    0.6.1
 */