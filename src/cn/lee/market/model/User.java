/*     */ package cn.lee.market.model;
/*     */ 
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class User extends BaseModel
/*     */ {
/*     */   private Student MStudent;
/*     */   private String username;
/*     */   private String password;
/*     */   private Date birthday;
/*     */   private short photo;
/*     */   private String question;
/*     */   private String answer;
/*     */   private String email;
/*     */   private String qq;
/*     */   private Date create_time;
/*     */   private short status;
/*     */   private short role;
/*  30 */   private Set TMessages = new HashSet(0);
/*  31 */   private Set TComments = new HashSet(0);
/*     */ 
/*     */   public User()
/*     */   {
/*     */   }
/*     */ 
/*     */   public User(Student MStudent, String username, String password, Date birthday, short photo, String question, String answer, Date create_time, short status, short role)
/*     */   {
/*  42 */     this.MStudent = MStudent;
/*  43 */     this.username = username;
/*  44 */     this.password = password;
/*  45 */     this.birthday = birthday;
/*  46 */     this.photo = photo;
/*  47 */     this.question = question;
/*  48 */     this.answer = answer;
/*  49 */     this.create_time = create_time;
/*  50 */     this.status = status;
/*  51 */     this.role = role;
/*     */   }
/*     */ 
/*     */   public User(Student MStudent, String username, String password, Date birthday, short photo, String question, String answer, String email, String qq, Date create_time, short status, short role, Set TMessages, Set TComments)
/*     */   {
/*  56 */     this.MStudent = MStudent;
/*  57 */     this.username = username;
/*  58 */     this.password = password;
/*  59 */     this.birthday = birthday;
/*  60 */     this.photo = photo;
/*  61 */     this.question = question;
/*  62 */     this.answer = answer;
/*  63 */     this.email = email;
/*  64 */     this.qq = qq;
/*  65 */     this.create_time = create_time;
/*  66 */     this.status = status;
/*  67 */     this.role = role;
/*  68 */     this.TMessages = TMessages;
/*  69 */     this.TComments = TComments;
/*     */   }
/*     */   public User(String username2, String password2, String question2, String answer2, int photo2, String email2, Date birthday2) {
/*  72 */     this.username = username2;
/*  73 */     this.password = password2;
/*  74 */     this.birthday = birthday2;
/*  75 */     this.photo = (short)photo2;
/*  76 */     this.question = question2;
/*  77 */     this.answer = answer2;
/*  78 */     this.email = email2;
/*  79 */     this.status = 0;
/*  80 */     this.role = 1;
/*     */   }
/*     */ 
/*     */   public Student getMStudent()
/*     */   {
/*  86 */     return this.MStudent;
/*     */   }
/*     */ 
/*     */   public void setMStudent(Student MStudent) {
/*  90 */     this.MStudent = MStudent;
/*     */   }
/*     */ 
/*     */   public String getUsername() {
/*  94 */     return this.username;
/*     */   }
/*     */ 
/*     */   public void setUsername(String username) {
/*  98 */     this.username = username;
/*     */   }
/*     */ 
/*     */   public String getPassword() {
/* 102 */     return this.password;
/*     */   }
/*     */ 
/*     */   public void setPassword(String password) {
/* 106 */     this.password = password;
/*     */   }
/*     */ 
/*     */   public Date getBirthday() {
/* 110 */     return this.birthday;
/*     */   }
/*     */ 
/*     */   public void setBirthday(Date birthday) {
/* 114 */     this.birthday = birthday;
/*     */   }
/*     */ 
/*     */   public short getPhoto() {
/* 118 */     return this.photo;
/*     */   }
/*     */ 
/*     */   public void setPhoto(short photo) {
/* 122 */     this.photo = photo;
/*     */   }
/*     */ 
/*     */   public String getQuestion() {
/* 126 */     return this.question;
/*     */   }
/*     */ 
/*     */   public void setQuestion(String question) {
/* 130 */     this.question = question;
/*     */   }
/*     */ 
/*     */   public String getAnswer() {
/* 134 */     return this.answer;
/*     */   }
/*     */ 
/*     */   public void setAnswer(String answer) {
/* 138 */     this.answer = answer;
/*     */   }
/*     */ 
/*     */   public String getEmail() {
/* 142 */     return this.email;
/*     */   }
/*     */ 
/*     */   public void setEmail(String email) {
/* 146 */     this.email = email;
/*     */   }
/*     */ 
/*     */   public String getQq() {
/* 150 */     return this.qq;
/*     */   }
/*     */ 
/*     */   public void setQq(String qq) {
/* 154 */     this.qq = qq;
/*     */   }
/*     */ 
/*     */   public Date getCreate_time() {
/* 158 */     return this.create_time;
/*     */   }
/*     */ 
/*     */   public void setCreate_time(Date create_time) {
/* 162 */     this.create_time = create_time;
/*     */   }
/*     */ 
/*     */   public short getStatus() {
/* 166 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(short status) {
/* 170 */     this.status = status;
/*     */   }
/*     */ 
/*     */   public short getRole() {
/* 174 */     return this.role;
/*     */   }
/*     */ 
/*     */   public void setRole(short role) {
/* 178 */     this.role = role;
/*     */   }
/*     */ 
/*     */   public Set getTMessages() {
/* 182 */     return this.TMessages;
/*     */   }
/*     */ 
/*     */   public void setTMessages(Set TMessages) {
/* 186 */     this.TMessages = TMessages;
/*     */   }
/*     */ 
/*     */   public Set getTComments() {
/* 190 */     return this.TComments;
/*     */   }
/*     */ 
/*     */   public void setTComments(Set TComments) {
/* 194 */     this.TComments = TComments;
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.model.User
 * JD-Core Version:    0.6.1
 */