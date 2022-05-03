/*    */ package cn.lee.market.model;
/*    */ 
/*    */ public class Article extends BaseModel
/*    */ {
/*    */   private String title;
/*    */   private String content;
/*    */ 
/*    */   public Article()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Article(String title)
/*    */   {
/* 27 */     this.title = title;
/*    */   }
/*    */ 
/*    */   public Article(String title, String content)
/*    */   {
/* 32 */     this.title = title;
/* 33 */     this.content = content;
/*    */   }
/*    */ 
/*    */   public String getTitle()
/*    */   {
/* 40 */     return this.title;
/*    */   }
/*    */ 
/*    */   public void setTitle(String title) {
/* 44 */     this.title = title;
/*    */   }
/*    */ 
/*    */   public String getContent() {
/* 48 */     return this.content;
/*    */   }
/*    */ 
/*    */   public void setContent(String content) {
/* 52 */     this.content = content;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.Article
 * JD-Core Version:    0.6.1
 */