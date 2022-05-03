/*     */ package cn.lee.market.struts.actionform;
/*     */ 
/*     */ import cn.lee.market.model.Message;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import org.apache.struts.action.ActionMapping;
/*     */ import org.apache.struts.validator.ValidatorForm;
/*     */ 
/*     */ public class PostMessageForm extends ValidatorForm
/*     */ {
/*     */   private static final long serialVersionUID = 1156452272080581588L;
/*     */   private String areaid;
/*     */   private String typeid;
/*     */   private String message_title;
/*     */   private int old_value;
/*     */   private int price;
/*     */   private String r_user;
/*     */   private String r_email;
/*     */   private String r_phone;
/*     */   private String message_desc;
/*     */   private int flag;
/*     */ 
/*     */   public String getAreaid()
/*     */   {
/*  34 */     return this.areaid;
/*     */   }
/*     */   public void setAreaid(String areaid) {
/*  37 */     this.areaid = areaid;
/*     */   }
/*     */   public int getFlag() {
/*  40 */     return this.flag;
/*     */   }
/*     */   public void setFlag(int flag) {
/*  43 */     this.flag = flag;
/*     */   }
/*     */   public String getMessage_desc() {
/*  46 */     return this.message_desc;
/*     */   }
/*     */   public void setMessage_desc(String message_desc) {
/*  49 */     this.message_desc = message_desc;
/*     */   }
/*     */   public String getMessage_title() {
/*  52 */     return this.message_title;
/*     */   }
/*     */   public void setMessage_title(String message_title) {
/*  55 */     this.message_title = message_title;
/*     */   }
/*     */   public Integer getOld_value() {
/*  58 */     return Integer.valueOf(this.old_value);
/*     */   }
/*     */   public void setOld_value(Integer old_value) {
/*  61 */     this.old_value = old_value.intValue();
/*     */   }
/*     */   public int getPrice() {
/*  64 */     return this.price;
/*     */   }
/*     */   public void setPrice(int price) {
/*  67 */     this.price = price;
/*     */   }
/*     */   public String getR_email() {
/*  70 */     return this.r_email;
/*     */   }
/*     */   public void setR_email(String r_email) {
/*  73 */     this.r_email = r_email;
/*     */   }
/*     */   public String getR_phone() {
/*  76 */     return this.r_phone;
/*     */   }
/*     */   public void setR_phone(String r_phone) {
/*  79 */     this.r_phone = r_phone;
/*     */   }
/*     */   public String getR_user() {
/*  82 */     return this.r_user;
/*     */   }
/*     */   public void setR_user(String r_user) {
/*  85 */     this.r_user = r_user;
/*     */   }
/*     */   public String getTypeid() {
/*  88 */     return this.typeid;
/*     */   }
/*     */   public void setTypeid(String typeid) {
/*  91 */     this.typeid = typeid;
/*     */   }
/*     */ 
/*     */   public void reset(ActionMapping arg0, HttpServletRequest arg1)
/*     */   {
/*  96 */     this.areaid = null;
/*  97 */     this.typeid = null;
/*  98 */     this.message_title = null;
/*  99 */     this.message_desc = null;
/* 100 */     this.old_value = 10;
/* 101 */     this.price = 0;
/* 102 */     this.r_email = null;
/* 103 */     this.r_phone = null;
/* 104 */     this.r_user = null;
/* 105 */     this.flag = 0;
/* 106 */     super.reset(arg0, arg1);
/*     */   }
/*     */ 
/*     */   public Message getMessage()
/*     */   {
/* 111 */     return new Message(this.message_title, this.old_value, this.price, this.message_desc, this.r_user, this.r_email, this.r_phone, this.flag);
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.actionform.PostMessageForm
 * JD-Core Version:    0.6.1
 */