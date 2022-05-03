/*    */ package cn.lee.market.model;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class Student extends BaseModel
/*    */ {
/*    */   private Clazz MClass;
/*    */   private String stu_name;
/*    */   private short sex;
/* 20 */   private Set TUsers = new HashSet(0);
/*    */ 
/*    */   public Student()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Student(Clazz MClass, String stu_name, short sex)
/*    */   {
/* 31 */     this.MClass = MClass;
/* 32 */     this.stu_name = stu_name;
/* 33 */     this.sex = sex;
/*    */   }
/*    */ 
/*    */   public Student(Clazz MClass, String stu_name, short sex, Set TUsers)
/*    */   {
/* 38 */     this.MClass = MClass;
/* 39 */     this.stu_name = stu_name;
/* 40 */     this.sex = sex;
/* 41 */     this.TUsers = TUsers;
/*    */   }
/*    */ 
/*    */   public Clazz getMClass()
/*    */   {
/* 48 */     return this.MClass;
/*    */   }
/*    */ 
/*    */   public void setMClass(Clazz MClass) {
/* 52 */     this.MClass = MClass;
/*    */   }
/*    */ 
/*    */   public String getStu_name() {
/* 56 */     return this.stu_name;
/*    */   }
/*    */ 
/*    */   public void setStu_name(String stu_name) {
/* 60 */     this.stu_name = stu_name;
/*    */   }
/*    */ 
/*    */   public short getSex() {
/* 64 */     return this.sex;
/*    */   }
/*    */ 
/*    */   public void setSex(short sex) {
/* 68 */     this.sex = sex;
/*    */   }
/*    */ 
/*    */   public Set getTUsers() {
/* 72 */     return this.TUsers;
/*    */   }
/*    */ 
/*    */   public void setTUsers(Set TUsers) {
/* 76 */     this.TUsers = TUsers;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.Student
 * JD-Core Version:    0.6.1
 */