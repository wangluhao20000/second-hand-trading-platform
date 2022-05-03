/*    */ package cn.lee.market.model;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class Clazz extends BaseModel
/*    */ {
/*    */   private Department MDep;
/*    */   private String clazz_name;
/*    */   private String clazz_desc;
/* 20 */   private Set MStudents = new HashSet(0);
/*    */ 
/*    */   public Clazz()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Clazz(Department MDep, String clazz_name)
/*    */   {
/* 31 */     this.MDep = MDep;
/* 32 */     this.clazz_name = clazz_name;
/*    */   }
/*    */ 
/*    */   public Clazz(Department MDep, String clazz_name, String clazz_desc, Set MStudents)
/*    */   {
/* 37 */     this.MDep = MDep;
/* 38 */     this.clazz_name = clazz_name;
/* 39 */     this.clazz_desc = clazz_desc;
/* 40 */     this.MStudents = MStudents;
/*    */   }
/*    */ 
/*    */   public Department getMDep()
/*    */   {
/* 47 */     return this.MDep;
/*    */   }
/*    */ 
/*    */   public void setMDep(Department MDep) {
/* 51 */     this.MDep = MDep;
/*    */   }
/*    */ 
/*    */   public String getClazz_name() {
/* 55 */     return this.clazz_name;
/*    */   }
/*    */ 
/*    */   public void setClazz_name(String clazz_name) {
/* 59 */     this.clazz_name = clazz_name;
/*    */   }
/*    */ 
/*    */   public String getClazz_desc() {
/* 63 */     return this.clazz_desc;
/*    */   }
/*    */ 
/*    */   public void setClazz_desc(String clazz_desc) {
/* 67 */     this.clazz_desc = clazz_desc;
/*    */   }
/*    */ 
/*    */   public Set getMStudents() {
/* 71 */     return this.MStudents;
/*    */   }
/*    */ 
/*    */   public void setMStudents(Set MStudents) {
/* 75 */     this.MStudents = MStudents;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.Clazz
 * JD-Core Version:    0.6.1
 */