/*    */ package cn.lee.market.model;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ public class Comment extends BaseModel
/*    */ {
/*    */   private User TUser;
/*    */   private Message TMessage;
/*    */   private String content;
/*    */   private Date create_time;
/*    */ 
/*    */   public Comment()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Comment(User TUser, Message TMessage, String content, Date create_time)
/*    */   {
/* 31 */     this.TUser = TUser;
/* 32 */     this.TMessage = TMessage;
/* 33 */     this.content = content;
/* 34 */     this.create_time = create_time;
/*    */   }
/*    */ 
/*    */   public User getTUser()
/*    */   {
/* 41 */     return this.TUser;
/*    */   }
/*    */ 
/*    */   public void setTUser(User TUser) {
/* 45 */     this.TUser = TUser;
/*    */   }
/*    */ 
/*    */   public Message getTMessage() {
/* 49 */     return this.TMessage;
/*    */   }
/*    */ 
/*    */   public void setTMessage(Message TMessage) {
/* 53 */     this.TMessage = TMessage;
/*    */   }
/*    */ 
/*    */   public String getContent() {
/* 57 */     return this.content;
/*    */   }
/*    */ 
/*    */   public void setContent(String content) {
/* 61 */     this.content = content;
/*    */   }
/*    */ 
/*    */   public Date getCreate_time() {
/* 65 */     return this.create_time;
/*    */   }
/*    */ 
/*    */   public void setCreate_time(Date create_time) {
/* 69 */     this.create_time = create_time;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.Comment
 * JD-Core Version:    0.6.1
 */