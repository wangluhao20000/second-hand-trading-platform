/*     */ package cn.lee.market.dao;
/*     */ 
/*     */ import cn.lee.market.model.User;
/*     */ import cn.lee.market.struts.actionform.LoginForm;
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.Criteria;
/*     */ import org.hibernate.LockMode;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.criterion.Example;
/*     */ 
/*     */ public class UserDAO extends BaseHibernateDAO
/*     */ {
/*  22 */   private static final Log log = LogFactory.getLog(UserDAO.class);
/*     */   public static final String USERNAME = "username";
/*     */   public static final String PASSWORD = "password";
/*     */   public static final String PHOTO = "photo";
/*     */   public static final String QUESTION = "question";
/*     */   public static final String ANSWER = "answer";
/*     */   public static final String EMAIL = "email";
/*     */   public static final String QQ = "qq";
/*     */   public static final String STATUS = "status";
/*     */   public static final String ROLE = "role";
/*     */ 
/*     */   public void save(User transientInstance)
/*     */   {
/*  37 */     log.debug("saving User instance");
/*     */     try {
/*  39 */       getSession().save(transientInstance);
/*  40 */       log.debug("save successful");
/*     */     } catch (RuntimeException re) {
/*  42 */       log.error("save failed", re);
/*  43 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void delete(User persistentInstance) {
/*  48 */     log.debug("deleting User instance");
/*     */     try {
/*  50 */       getSession().delete(persistentInstance);
/*  51 */       log.debug("delete successful");
/*     */     } catch (RuntimeException re) {
/*  53 */       log.error("delete failed", re);
/*  54 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public User findById(String id) {
/*  59 */     log.debug("getting User instance with id: " + id);
/*     */     try {
/*  61 */       return (User)getSession()
/*  62 */         .get(User.class, id);
/*     */     }
/*     */     catch (RuntimeException re) {
/*  65 */       log.error("get failed", re);
/*  66 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByExample(User instance)
/*     */   {
/*  72 */     log.debug("finding User instance by example");
/*     */     try {
/*  74 */       List results = getSession()
/*  75 */         .createCriteria(User.class)
/*  76 */         .add(Example.create(instance))
/*  77 */         .list();
/*  78 */       log.debug("find by example successful, result size: " + results.size());
/*  79 */       return results;
/*     */     } catch (RuntimeException re) {
/*  81 */       log.error("find by example failed", re);
/*  82 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByProperty(String propertyName, Object value) {
/*  87 */     log.debug("finding User instance with property: " + propertyName + 
/*  88 */       ", value: " + value);
/*     */     try {
/*  90 */       String queryString = "from User as model where model." + 
/*  91 */         propertyName + "= ?";
/*  92 */       Query queryObject = getSession().createQuery(queryString);
/*  93 */       queryObject.setParameter(0, value);
/*  94 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/*  96 */       log.error("find by property name failed", re);
/*  97 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByUsername(Object username) {
/* 102 */     return findByProperty("username", username);
/*     */   }
/*     */ 
/*     */   public List findByPassword(Object password) {
/* 106 */     return findByProperty("password", password);
/*     */   }
/*     */ 
/*     */   public List findByPhoto(Object photo) {
/* 110 */     return findByProperty("photo", photo);
/*     */   }
/*     */ 
/*     */   public List findByQuestion(Object question) {
/* 114 */     return findByProperty("question", question);
/*     */   }
/*     */ 
/*     */   public List findByAnswer(Object answer) {
/* 118 */     return findByProperty("answer", answer);
/*     */   }
/*     */ 
/*     */   public List findByEmail(Object email) {
/* 122 */     return findByProperty("email", email);
/*     */   }
/*     */ 
/*     */   public List findByQq(Object qq) {
/* 126 */     return findByProperty("qq", qq);
/*     */   }
/*     */ 
/*     */   public List findByStatus(Object status) {
/* 130 */     return findByProperty("status", status);
/*     */   }
/*     */ 
/*     */   public List findByRole(Object role) {
/* 134 */     return findByProperty("role", role);
/*     */   }
/*     */ 
/*     */   public User merge(User detachedInstance) {
/* 138 */     log.debug("merging User instance");
/*     */     try {
/* 140 */       User result = (User)getSession()
/* 141 */         .merge(detachedInstance);
/* 142 */       log.debug("merge successful");
/* 143 */       return result;
/*     */     } catch (RuntimeException re) {
/* 145 */       log.error("merge failed", re);
/* 146 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachDirty(User instance) {
/* 151 */     log.debug("attaching dirty User instance");
/*     */     try {
/* 153 */       getSession().saveOrUpdate(instance);
/* 154 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 156 */       log.error("attach failed", re);
/* 157 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachClean(User instance) {
/* 162 */     log.debug("attaching clean User instance");
/*     */     try {
/* 164 */       getSession().lock(instance, LockMode.NONE);
/* 165 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 167 */       log.error("attach failed", re);
/* 168 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public User findByUsername(String username) {
/* 173 */     log.debug("getting User instance with username: " + username);
/*     */     try {
/* 175 */       String queryString = "from User where username = '" + username.trim() + "'";
/* 176 */       Query queryObject = getSession().createQuery(queryString);
/* 177 */       List userList = queryObject.list();
/* 178 */       System.out.println(userList);
/* 179 */       if (userList == null || userList.size()==0)
/*     */       {
/* 181 */         System.out.println("没有些用户名!");
/* 182 */         return null;
/*     */       }
/*     */ 
/* 186 */       System.out.println("找到用户：" + ((User)userList.get(0)).getUsername());
/* 187 */       return (User)userList.get(0);
/*     */     }
/*     */     catch (RuntimeException re) {
/* 190 */       log.error("get failed", re);
/* 191 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByStu_id(String stu_id) {
/* 196 */     log.debug("getting User instance with stu_id: " + stu_id);
/*     */     try {
/* 198 */       String queryString = "from User as model where model.MStudent = '" + stu_id + "'";
/* 199 */       Query queryObject = getSession().createQuery(queryString);
/* 200 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 202 */       log.error("get failed", re);
/* 203 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public User getUser(LoginForm loginForm) {
/* 208 */     log.debug("getting User instance with LoginForm: " + loginForm.getUsername() + ":" + loginForm.getPassword());
/*     */     try {
/* 210 */       String queryString = "from User where username = '" + loginForm.getUsername().trim() + "'" + 
/* 211 */         " and password = '" + loginForm.getPassword() + "'";
/* 212 */       Query queryObject = getSession().createQuery(queryString);
/* 213 */       return (User)queryObject.uniqueResult();
/*     */     }
/*     */     catch (RuntimeException re) {
/* 216 */       log.error("get failed", re);
/* 217 */       throw re;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.dao.UserDAO
 * JD-Core Version:    0.6.1
 */