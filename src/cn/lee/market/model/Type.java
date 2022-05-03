/*    */ package cn.lee.market.model;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class Type extends BaseModel
/*    */ {
/*    */   private String type_name;
/*    */   private String type_desc;
/* 19 */   private Set TMessages = new HashSet(0);
/*    */ 
/*    */   public Type()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Type(String type_name, String type_desc)
/*    */   {
/* 30 */     this.type_name = type_name;
/* 31 */     this.type_desc = type_desc;
/*    */   }
/*    */ 
/*    */   public Type(String type_name, String type_desc, Set TMessages)
/*    */   {
/* 36 */     this.type_name = type_name;
/* 37 */     this.type_desc = type_desc;
/* 38 */     this.TMessages = TMessages;
/*    */   }
/*    */ 
/*    */   public String getType_name()
/*    */   {
/* 45 */     return this.type_name;
/*    */   }
/*    */ 
/*    */   public void setType_name(String type_name) {
/* 49 */     this.type_name = type_name;
/*    */   }
/*    */ 
/*    */   public String getType_desc() {
/* 53 */     return this.type_desc;
/*    */   }
/*    */ 
/*    */   public void setType_desc(String type_desc) {
/* 57 */     this.type_desc = type_desc;
/*    */   }
/*    */ 
/*    */   public Set getTMessages() {
/* 61 */     return this.TMessages;
/*    */   }
/*    */ 
/*    */   public void setTMessages(Set TMessages) {
/* 65 */     this.TMessages = TMessages;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.Type
 * JD-Core Version:    0.6.1
 */