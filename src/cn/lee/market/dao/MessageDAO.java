/*     */ package cn.lee.market.dao;
/*     */ 
/*     */ import cn.lee.market.model.Message;
/*     */ import cn.lee.market.model.User;
/*     */ import cn.lee.market.struts.actionform.SearchConditionForm;
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
/*     */ public class MessageDAO extends BaseHibernateDAO
/*     */ {
/*  23 */   private static final Log log = LogFactory.getLog(MessageDAO.class);
/*     */   public static final String MESSAGE_TITLE = "message_title";
/*     */   public static final String _OLD__VALUE = "OLD_VALUE";
/*     */   public static final String PRICE = "price";
/*     */   public static final String R_USER = "r_user";
/*     */   public static final String R_EMAIL = "r_email";
/*     */   public static final String R_PHONE = "r_phone";
/*     */   public static final String MESSAGE_DESC = "message_desc";
/*     */   public static final String MESSAGE_PHOTO = "message_photo";
/*     */   public static final String FLAG = "flag";
/*     */   public static final String TOP_VALUE = "top_value";
/*     */ 
/*     */   public void save(Message transientInstance)
/*     */   {
/*  39 */     log.debug("saving Message instance");
/*     */     try {
/*  41 */       getSession().save(transientInstance);
/*  42 */       log.debug("save successful");
/*     */     } catch (RuntimeException re) {
/*  44 */       log.error("save failed", re);
/*  45 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void delete(Message persistentInstance) {
/*  50 */     log.debug("deleting Message instance");
/*     */     try {
/*  52 */       getSession().delete(persistentInstance);
/*  53 */       log.debug("delete successful");
/*     */     } catch (RuntimeException re) {
/*  55 */       log.error("delete failed", re);
/*  56 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public Message findById(String id) {
/*  61 */     log.debug("getting Message instance with id: " + id);
/*     */     try {
/*  63 */       return (Message)getSession()
/*  64 */         .get(Message.class, id);
/*     */     }
/*     */     catch (RuntimeException re) {
/*  67 */       log.error("get failed", re);
/*  68 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByExample(Message instance)
/*     */   {
/*  74 */     log.debug("finding Message instance by example");
/*     */     try {
/*  76 */       List results = getSession()
/*  77 */         .createCriteria(Message.class)
/*  78 */         .add(Example.create(instance))
/*  79 */         .list();
/*  80 */       log.debug("find by example successful, result size: " + results.size());
/*  81 */       return results;
/*     */     } catch (RuntimeException re) {
/*  83 */       log.error("find by example failed", re);
/*  84 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByProperty(String propertyName, Object value) {
/*  89 */     log.debug("finding Message instance with property: " + propertyName + 
/*  90 */       ", value: " + value);
/*     */     try {
/*  92 */       String queryString = "from Message as model where model." + 
/*  93 */         propertyName + "= ?";
/*  94 */       Query queryObject = getSession().createQuery(queryString);
/*  95 */       queryObject.setParameter(0, value);
/*  96 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/*  98 */       log.error("find by property name failed", re);
/*  99 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByMessage_title(Object message_title) {
/* 104 */     return findByProperty("message_title", message_title);
/*     */   }
/*     */ 
/*     */   public List findByOLD_VALUE(Object OLD_VALUE) {
/* 108 */     return findByProperty("OLD_VALUE", OLD_VALUE);
/*     */   }
/*     */ 
/*     */   public List findByPrice(Object price) {
/* 112 */     return findByProperty("price", price);
/*     */   }
/*     */ 
/*     */   public List findByR_user(Object r_user) {
/* 116 */     return findByProperty("r_user", r_user);
/*     */   }
/*     */ 
/*     */   public List findByR_email(Object r_email) {
/* 120 */     return findByProperty("r_email", r_email);
/*     */   }
/*     */ 
/*     */   public List findByR_phone(Object r_phone) {
/* 124 */     return findByProperty("r_phone", r_phone);
/*     */   }
/*     */ 
/*     */   public List findByMessage_desc(Object message_desc) {
/* 128 */     return findByProperty("message_desc", message_desc);
/*     */   }
/*     */ 
/*     */   public List findByMessage_photo(Object message_photo) {
/* 132 */     return findByProperty("message_photo", message_photo);
/*     */   }
/*     */ 
/*     */   public List findByFlag(Object flag) {
/* 136 */     return findByProperty("flag", flag);
/*     */   }
/*     */ 
/*     */   public List findByTop_value(Object top_value) {
/* 140 */     return findByProperty("top_value", top_value);
/*     */   }
/*     */ 
/*     */   public Message merge(Message detachedInstance) {
/* 144 */     log.debug("merging Message instance");
/*     */     try {
/* 146 */       Message result = (Message)getSession()
/* 147 */         .merge(detachedInstance);
/* 148 */       log.debug("merge successful");
/* 149 */       return result;
/*     */     } catch (RuntimeException re) {
/* 151 */       log.error("merge failed", re);
/* 152 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachDirty(Message instance) {
/* 157 */     log.debug("attaching dirty Message instance");
/*     */     try {
/* 159 */       getSession().saveOrUpdate(instance);
/* 160 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 162 */       log.error("attach failed", re);
/* 163 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachClean(Message instance) {
/* 168 */     log.debug("attaching clean Message instance");
/*     */     try {
/* 170 */       getSession().lock(instance, LockMode.NONE);
/* 171 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 173 */       log.error("attach failed", re);
/* 174 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List getTypeMessages(String typeid) {
/* 179 */     log.debug("getting Message instance with typeid: " + typeid);
/*     */     try {
/* 181 */       String queryString = "from Message where MType = '" + typeid + "' order by id desc";
/* 182 */       Query queryObject = getSession().createQuery(queryString);
/* 183 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 185 */       log.error("get failed", re);
/* 186 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findBySearchCondition(SearchConditionForm searchConditionForm)
/*     */   {
/* 192 */     String keyword = searchConditionForm.getKeyword();
/* 193 */     String typeid = searchConditionForm.getTypeid();
/* 194 */     int flag = searchConditionForm.getFlag();
/* 195 */     String areaid = searchConditionForm.getAreaid();
/* 196 */     String debugMessage = "getting Message instance with [ keyword:" + 
/* 197 */       keyword + "],[typeid:" + typeid + "]";
/* 198 */     log.debug(debugMessage);
/* 199 */     System.out.println(debugMessage);
/*     */     try {
/* 201 */       String queryString = "from Message where (message_title like '%" + keyword + "%'" + 
/* 202 */         "or message_desc like '%" + keyword + "%')";
/* 203 */       if ((typeid != null) && (!"allType".equals(typeid)))
/* 204 */         queryString = queryString + " and MType = '" + typeid + "'";
/* 205 */       if ((flag == 1) || (flag == 0))
/* 206 */         queryString = queryString + " and flag = " + flag;
/* 207 */       if ((areaid != null) && (!"allArea".endsWith(areaid)))
/* 208 */         queryString = queryString + " and MArea = '" + areaid + "'";
/* 209 */       queryString = queryString + " order by id desc";
/* 210 */       System.out.println(queryString);
/* 211 */       Query queryObject = getSession().createQuery(queryString);
/* 212 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 214 */       log.error("get failed", re);
/* 215 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/* 219 */   public List findByTop_value2() { log.debug("finding Top Message instance");
/*     */     try {
/* 221 */       String queryString = "from Message as model order by model.top_value desc,model.id desc";
/* 222 */       Query queryObject = getSession().createQuery(queryString);
/* 223 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 225 */       log.error("find by property name failed", re);
/* 226 */       throw re;
/*     */     } }
/*     */ 
/*     */   public List<Message> getMyMessage(User user)
/*     */   {
/* 231 */     log.debug("getting Message instance with User: " + user.getUsername());
/*     */     try {
/* 233 */       String queryString = "from Message where TUser = '" + user.getId() + "' order by id desc";
/* 234 */       Query queryObject = getSession().createQuery(queryString);
/* 235 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 237 */       log.error("get failed", re);
/* 238 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List<Message> getUserMessage(User user) {
/* 243 */     log.debug("getting Message instance with User: " + user.getUsername());
/*     */     try {
/* 245 */       String queryString = "from Message where TUser <> '" + user.getId() + "' order by id desc";
/* 246 */       Query queryObject = getSession().createQuery(queryString);
/* 247 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 249 */       log.error("get failed", re);
/* 250 */       throw re;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.dao.MessageDAO
 * JD-Core Version:    0.6.1
 */