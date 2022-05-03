/*     */ package cn.lee.market.model;
/*     */ 
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class Message extends BaseModel
/*     */ {
/*     */   private Area MArea;
/*     */   private User TUser;
/*     */   private Type MType;
/*     */   private String message_title;
/*     */   private short old_value;
/*     */   private long price;
/*     */   private String r_user;
/*     */   private String r_email;
/*     */   private String r_phone;
/*     */   private String message_desc;
/*     */   private String message_photo;
/*     */   private short flag;
/*     */   private Integer top_value;
/*     */   private Date create_time;
/*  32 */   private Set TComments = new HashSet(0);
/*     */ 
/*     */   public Message()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Message(Area MArea, User TUser, Type MType, String message_title, short old_value, long price, String r_user, String r_phone, String message_desc, short flag, Date create_time)
/*     */   {
/*  43 */     this.MArea = MArea;
/*  44 */     this.TUser = TUser;
/*  45 */     this.MType = MType;
/*  46 */     this.message_title = message_title;
/*  47 */     this.old_value = old_value;
/*  48 */     this.price = price;
/*  49 */     this.r_user = r_user;
/*  50 */     this.r_phone = r_phone;
/*  51 */     this.message_desc = message_desc;
/*  52 */     this.flag = flag;
/*  53 */     this.create_time = create_time;
/*     */   }
/*     */ 
/*     */   public Message(Area MArea, User TUser, Type MType, String message_title, short old_value, long price, String r_user, String r_email, String r_phone, String message_desc, String message_photo, short flag, Integer top_value, Date create_time, Set TComments)
/*     */   {
/*  58 */     this.MArea = MArea;
/*  59 */     this.TUser = TUser;
/*  60 */     this.MType = MType;
/*  61 */     this.message_title = message_title;
/*  62 */     this.old_value = old_value;
/*  63 */     this.price = price;
/*  64 */     this.r_user = r_user;
/*  65 */     this.r_email = r_email;
/*  66 */     this.r_phone = r_phone;
/*  67 */     this.message_desc = message_desc;
/*  68 */     this.message_photo = message_photo;
/*  69 */     this.flag = flag;
/*  70 */     this.top_value = top_value;
/*  71 */     this.create_time = create_time;
/*  72 */     this.TComments = TComments;
/*     */   }
/*     */ 
/*     */   public Message(String message_title, int old_value, int price, String message_desc, String r_user, String r_email, String r_phone, int flag) {
/*  76 */     this.message_title = message_title;
/*  77 */     this.old_value = (short)old_value;
/*  78 */     this.price = price;
/*  79 */     this.r_user = r_user;
/*  80 */     this.r_email = r_email;
/*  81 */     this.r_phone = r_phone;
/*  82 */     this.message_desc = message_desc;
/*  83 */     this.flag = (short)flag;
/*  84 */     this.top_value = Integer.valueOf(1);
/*     */   }
/*     */ 
/*     */   public Area getMArea()
/*     */   {
/*  90 */     return this.MArea;
/*     */   }
/*     */ 
/*     */   public void setMArea(Area MArea) {
/*  94 */     this.MArea = MArea;
/*     */   }
/*     */ 
/*     */   public User getTUser() {
/*  98 */     return this.TUser;
/*     */   }
/*     */ 
/*     */   public void setTUser(User TUser) {
/* 102 */     this.TUser = TUser;
/*     */   }
/*     */ 
/*     */   public Type getMType() {
/* 106 */     return this.MType;
/*     */   }
/*     */ 
/*     */   public void setMType(Type MType) {
/* 110 */     this.MType = MType;
/*     */   }
/*     */ 
/*     */   public String getMessage_title() {
/* 114 */     return this.message_title;
/*     */   }
/*     */ 
/*     */   public void setMessage_title(String message_title) {
/* 118 */     this.message_title = message_title;
/*     */   }
/*     */ 
/*     */   public short getold_value() {
/* 122 */     return this.old_value;
/*     */   }
/*     */ 
/*     */   public void setold_value(short old_value) {
/* 126 */     this.old_value = old_value;
/*     */   }
/*     */ 
/*     */   public long getPrice() {
/* 130 */     return this.price;
/*     */   }
/*     */ 
/*     */   public void setPrice(long price) {
/* 134 */     this.price = price;
/*     */   }
/*     */ 
/*     */   public String getR_user() {
/* 138 */     return this.r_user;
/*     */   }
/*     */ 
/*     */   public void setR_user(String r_user) {
/* 142 */     this.r_user = r_user;
/*     */   }
/*     */ 
/*     */   public String getR_email() {
/* 146 */     return this.r_email;
/*     */   }
/*     */ 
/*     */   public void setR_email(String r_email) {
/* 150 */     this.r_email = r_email;
/*     */   }
/*     */ 
/*     */   public String getR_phone() {
/* 154 */     return this.r_phone;
/*     */   }
/*     */ 
/*     */   public void setR_phone(String r_phone) {
/* 158 */     this.r_phone = r_phone;
/*     */   }
/*     */ 
/*     */   public String getMessage_desc() {
/* 162 */     return this.message_desc;
/*     */   }
/*     */ 
/*     */   public void setMessage_desc(String message_desc) {
/* 166 */     this.message_desc = message_desc;
/*     */   }
/*     */ 
/*     */   public String getMessage_photo() {
/* 170 */     return this.message_photo;
/*     */   }
/*     */ 
/*     */   public void setMessage_photo(String message_photo) {
/* 174 */     this.message_photo = message_photo;
/*     */   }
/*     */ 
/*     */   public short getFlag() {
/* 178 */     return this.flag;
/*     */   }
/*     */ 
/*     */   public void setFlag(short flag) {
/* 182 */     this.flag = flag;
/*     */   }
/*     */ 
/*     */   public Integer getTop_value() {
/* 186 */     return this.top_value;
/*     */   }
/*     */ 
/*     */   public void setTop_value(Integer top_value) {
/* 190 */     this.top_value = top_value;
/*     */   }
/*     */ 
/*     */   public Date getCreate_time() {
/* 194 */     return this.create_time;
/*     */   }
/*     */ 
/*     */   public void setCreate_time(Date create_time) {
/* 198 */     this.create_time = create_time;
/*     */   }
/*     */ 
/*     */   public Set getTComments() {
/* 202 */     return this.TComments;
/*     */   }
/*     */ 
/*     */   public void setTComments(Set TComments) {
/* 206 */     this.TComments = TComments;
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.Message
 * JD-Core Version:    0.6.1
 */