/*    */ package cn.lee.market.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import org.apache.commons.lang.builder.EqualsBuilder;
/*    */ import org.apache.commons.lang.builder.HashCodeBuilder;
/*    */ import org.apache.commons.lang.builder.ReflectionToStringBuilder;
/*    */ 
/*    */ public class BaseModel
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 7766184319541530720L;
/*    */   private String id;
/*    */ 
/*    */   public String getId()
/*    */   {
/* 22 */     return this.id;
/*    */   }
/*    */ 
/*    */   public void setId(String id) {
/* 26 */     this.id = id;
/*    */   }
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 34 */     if (this == obj) return true;
/*    */ 
/* 36 */     if (!(obj instanceof BaseModel)) {
/* 37 */       return false;
/*    */     }
/* 39 */     BaseModel target = (BaseModel)obj;
/*    */ 
/* 41 */     if ((getId() != null) && (getId().length() > 0))
/*    */     {
/* 43 */       return getId().equals(target.getId());
/*    */     }
/*    */ 
/* 46 */     if ((target.getId() != null) && (target.getId().length() > 0))
/*    */     {
/* 48 */       return false;
/*    */     }
/*    */ 
/* 51 */     return EqualsBuilder.reflectionEquals(this, obj);
/*    */   }
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 59 */     if ((getId() != null) && (getId().length() > 0))
/*    */     {
/* 61 */       return getId().hashCode();
/*    */     }
/*    */ 
/* 64 */     return HashCodeBuilder.reflectionHashCode(this);
/*    */   }
/*    */ 
/*    */   public String toString()
/*    */   {
/* 72 */     return ReflectionToStringBuilder.toString(this);
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.BaseModel
 * JD-Core Version:    0.6.1
 */