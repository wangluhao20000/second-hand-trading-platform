/*    */ package cn.lee.market.model;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class Area extends BaseModel
/*    */ {
/*    */   private String area_name;
/*    */   private String area_desc;
/* 18 */   private Set TMessages = new HashSet(0);
/*    */ 
/*    */   public Area()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Area(String area_name, String area_desc)
/*    */   {
/* 29 */     this.area_name = area_name;
/* 30 */     this.area_desc = area_desc;
/*    */   }
/*    */ 
/*    */   public Area(String area_name, String area_desc, Set TMessages)
/*    */   {
/* 35 */     this.area_name = area_name;
/* 36 */     this.area_desc = area_desc;
/* 37 */     this.TMessages = TMessages;
/*    */   }
/*    */ 
/*    */   public String getArea_name()
/*    */   {
/* 44 */     return this.area_name;
/*    */   }
/*    */ 
/*    */   public void setArea_name(String area_name) {
/* 48 */     this.area_name = area_name;
/*    */   }
/*    */ 
/*    */   public String getArea_desc() {
/* 52 */     return this.area_desc;
/*    */   }
/*    */ 
/*    */   public void setArea_desc(String area_desc) {
/* 56 */     this.area_desc = area_desc;
/*    */   }
/*    */ 
/*    */   public Set getTMessages() {
/* 60 */     return this.TMessages;
/*    */   }
/*    */ 
/*    */   public void setTMessages(Set TMessages) {
/* 64 */     this.TMessages = TMessages;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.Area
 * JD-Core Version:    0.6.1
 */