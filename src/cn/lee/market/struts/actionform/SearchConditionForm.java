/*    */ package cn.lee.market.struts.actionform;
/*    */ 
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ import org.apache.struts.validator.ValidatorForm;
/*    */ 
/*    */ public class SearchConditionForm extends ValidatorForm
/*    */ {
/*    */   private String keyword;
/*    */   private String typeid;
/*    */   private int flag;
/*    */   private String areaid;
/*    */ 
/*    */   public String getAreaid()
/*    */   {
/* 16 */     return this.areaid;
/*    */   }
/*    */   public void setAreaid(String areaid) {
/* 19 */     this.areaid = areaid;
/*    */   }
/*    */   public int getFlag() {
/* 22 */     return this.flag;
/*    */   }
/*    */   public void setFlag(int flag) {
/* 25 */     this.flag = flag;
/*    */   }
/*    */ 
/*    */   public String getKeyword() {
/* 29 */     return this.keyword;
/*    */   }
/*    */   public void setKeyword(String keyword) {
/* 32 */     this.keyword = keyword;
/*    */   }
/*    */   public String getTypeid() {
/* 35 */     return this.typeid;
/*    */   }
/*    */   public void setTypeid(String typeid) {
/* 38 */     this.typeid = typeid;
/*    */   }
/*    */ 
/*    */   public void reset(ActionMapping arg0, HttpServletRequest arg1)
/*    */   {
/* 43 */     this.areaid = null;
/* 44 */     this.flag = 0;
/* 45 */     this.keyword = null;
/* 46 */     this.typeid = null;
/* 47 */     super.reset(arg0, arg1);
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.actionform.SearchConditionForm
 * JD-Core Version:    0.6.1
 */