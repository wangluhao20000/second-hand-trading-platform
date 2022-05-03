/*     */ package cn.lee.market.struts.actionform;
/*     */ 
/*     */ import cn.lee.market.model.User;
/*     */ import cn.lee.market.util.DateConverter;
/*     */ import java.util.Date;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import org.apache.commons.beanutils.ConvertUtils;
/*     */ import org.apache.struts.action.ActionMapping;
/*     */ import org.apache.struts.validator.ValidatorForm;
/*     */ 
/*     */ public class RegisterForm extends ValidatorForm
/*     */ {
/*     */   private static final long serialVersionUID = 5342205774782086129L;
/*     */   private String username;
/*     */   private String stu_id;
/*     */   private String password;
/*     */   private String repassword;
/*     */   private String question;
/*     */   private String answer;
/*     */   private int photo;
/*     */   private String email;
/*     */   private Date birthday;
/*     */   private String randCode;
/*     */ 
/*     */   static
/*     */   {
/*  32 */     ConvertUtils.register(new DateConverter(), Date.class);
/*     */   }
/*     */ 
/*     */   public String getAnswer() {
/*  36 */     return this.answer;
/*     */   }
/*     */   public void setAnswer(String answer) {
/*  39 */     this.answer = answer;
/*     */   }
/*     */   public Date getBirthday() {
/*  42 */     return this.birthday;
/*     */   }
/*     */   public void setBirthday(Date birthday) {
/*  45 */     this.birthday = birthday;
/*     */   }
/*     */   public String getEmail() {
/*  48 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/*  51 */     this.email = email;
/*     */   }
/*     */   public String getPassword() {
/*  54 */     return this.password;
/*     */   }
/*     */   public void setPassword(String password) {
/*  57 */     this.password = password;
/*     */   }
/*     */   public int getPhoto() {
/*  60 */     return this.photo;
/*     */   }
/*     */   public void setPhoto(int photo) {
/*  63 */     this.photo = photo;
/*     */   }
/*     */   public String getQuestion() {
/*  66 */     return this.question;
/*     */   }
/*     */   public void setQuestion(String question) {
/*  69 */     this.question = question;
/*     */   }
/*     */   public String getRandCode() {
/*  72 */     return this.randCode;
/*     */   }
/*     */   public void setRandCode(String randCode) {
/*  75 */     this.randCode = randCode;
/*     */   }
/*     */   public String getRepassword() {
/*  78 */     return this.repassword;
/*     */   }
/*     */   public void setRepassword(String repassword) {
/*  81 */     this.repassword = repassword;
/*     */   }
/*     */   public String getStu_id() {
/*  84 */     return this.stu_id;
/*     */   }
/*     */   public void setStu_id(String stu_id) {
/*  87 */     this.stu_id = stu_id;
/*     */   }
/*     */   public String getUsername() {
/*  90 */     return this.username;
/*     */   }
/*     */   public void setUsername(String username) {
/*  93 */     this.username = username;
/*     */   }
/*     */ 
/*     */   public void reset(ActionMapping mapping, HttpServletRequest rquest)
/*     */   {
/*  98 */     this.username = null;
/*  99 */     this.stu_id = null;
/* 100 */     this.password = null;
/* 101 */     this.repassword = null;
/* 102 */     this.question = null;
/* 103 */     this.answer = null;
/* 104 */     this.photo = 0;
/* 105 */     this.email = null;
/* 106 */     this.randCode = null;
/*     */   }
/*     */ 
/*     */   public User getUser() {
/* 110 */     User user = null;
/* 111 */     user = new User(this.username, this.password, this.question, this.answer, this.photo, this.email, this.birthday);
/* 112 */     return user;
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.actionform.RegisterForm
 * JD-Core Version:    0.6.1
 */