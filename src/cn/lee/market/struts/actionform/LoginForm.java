/*    */ package cn.lee.market.struts.actionform;
/*    */ 
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ import org.apache.struts.validator.ValidatorForm;
/*    */ 
/*    */ public class LoginForm extends ValidatorForm
/*    */ {
/*    */   private String password;
/*    */   private String username;
/*    */ 
/*    */   public void reset(ActionMapping mapping, HttpServletRequest request)
/*    */   {
/* 34 */     this.password = null;
/* 35 */     this.username = null;
/*    */   }
/*    */ 
/*    */   public String getPassword()
/*    */   {
/* 43 */     return this.password;
/*    */   }
/*    */ 
/*    */   public void setPassword(String password)
/*    */   {
/* 51 */     this.password = password;
/*    */   }
/*    */ 
/*    */   public String getUsername()
/*    */   {
/* 59 */     return this.username;
/*    */   }
/*    */ 
/*    */   public void setUsername(String username)
/*    */   {
/* 67 */     this.username = username;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.actionform.LoginForm
 * JD-Core Version:    0.6.1
 */