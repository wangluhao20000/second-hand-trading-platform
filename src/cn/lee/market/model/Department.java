/*    */ package cn.lee.market.model;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class Department extends BaseModel
/*    */ {
/*    */   private String dep_name;
/*    */   private String dep_desc;
/* 19 */   private Set MClasses = new HashSet(0);
/*    */ 
/*    */   public Department()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Department(String dep_name)
/*    */   {
/* 30 */     this.dep_name = dep_name;
/*    */   }
/*    */ 
/*    */   public Department(String dep_name, String dep_desc, Set MClasses)
/*    */   {
/* 35 */     this.dep_name = dep_name;
/* 36 */     this.dep_desc = dep_desc;
/* 37 */     this.MClasses = MClasses;
/*    */   }
/*    */ 
/*    */   public String getDep_name()
/*    */   {
/* 44 */     return this.dep_name;
/*    */   }
/*    */ 
/*    */   public void setDep_name(String dep_name) {
/* 48 */     this.dep_name = dep_name;
/*    */   }
/*    */ 
/*    */   public String getDep_desc() {
/* 52 */     return this.dep_desc;
/*    */   }
/*    */ 
/*    */   public void setDep_desc(String dep_desc) {
/* 56 */     this.dep_desc = dep_desc;
/*    */   }
/*    */ 
/*    */   public Set getMClasses() {
/* 60 */     return this.MClasses;
/*    */   }
/*    */ 
/*    */   public void setMClasses(Set MClasses) {
/* 64 */     this.MClasses = MClasses;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.Department
 * JD-Core Version:    0.6.1
 */