/*     */ package cn.lee.market.dao;
/*     */ 
/*     */ import cn.lee.market.model.Type;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.Criteria;
/*     */ import org.hibernate.LockMode;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.criterion.Example;
/*     */ 
/*     */ public class TypeDAO extends BaseHibernateDAO
/*     */ {
/*  21 */   private static final Log log = LogFactory.getLog(TypeDAO.class);
/*     */   public static final String TYPE_NAME = "type_name";
/*     */   public static final String TYPE_DESC = "type_desc";
/*     */ 
/*     */   public void save(Type transientInstance)
/*     */   {
/*  29 */     log.debug("saving Type instance");
/*     */     try {
/*  31 */       getSession().save(transientInstance);
/*  32 */       log.debug("save successful");
/*     */     } catch (RuntimeException re) {
/*  34 */       log.error("save failed", re);
/*  35 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void delete(Type persistentInstance) {
/*  40 */     log.debug("deleting Type instance");
/*     */     try {
/*  42 */       getSession().delete(persistentInstance);
/*  43 */       log.debug("delete successful");
/*     */     } catch (RuntimeException re) {
/*  45 */       log.error("delete failed", re);
/*  46 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public Type findById(String id) {
/*  51 */     log.debug("getting Type instance with id: " + id);
/*     */     try {
/*  53 */       return (Type)getSession()
/*  54 */         .get(Type.class, id);
/*     */     }
/*     */     catch (RuntimeException re) {
/*  57 */       log.error("get failed", re);
/*  58 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByExample(Type instance)
/*     */   {
/*  64 */     log.debug("finding Type instance by example");
/*     */     try {
/*  66 */       List results = getSession()
/*  67 */         .createCriteria(Type.class)
/*  68 */         .add(Example.create(instance))
/*  69 */         .list();
/*  70 */       log.debug("find by example successful, result size: " + results.size());
/*  71 */       return results;
/*     */     } catch (RuntimeException re) {
/*  73 */       log.error("find by example failed", re);
/*  74 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByProperty(String propertyName, Object value) {
/*  79 */     log.debug("finding Type instance with property: " + propertyName + 
/*  80 */       ", value: " + value);
/*     */     try {
/*  82 */       String queryString = "from Type as model where model." + 
/*  83 */         propertyName + "= ?";
/*  84 */       Query queryObject = getSession().createQuery(queryString);
/*  85 */       queryObject.setParameter(0, value);
/*  86 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/*  88 */       log.error("find by property name failed", re);
/*  89 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByType_name(Object type_name) {
/*  94 */     return findByProperty("type_name", type_name);
/*     */   }
/*     */ 
/*     */   public List findByType_desc(Object type_desc) {
/*  98 */     return findByProperty("type_desc", type_desc);
/*     */   }
/*     */ 
/*     */   public Type merge(Type detachedInstance) {
/* 102 */     log.debug("merging Type instance");
/*     */     try {
/* 104 */       Type result = (Type)getSession()
/* 105 */         .merge(detachedInstance);
/* 106 */       log.debug("merge successful");
/* 107 */       return result;
/*     */     } catch (RuntimeException re) {
/* 109 */       log.error("merge failed", re);
/* 110 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachDirty(Type instance) {
/* 115 */     log.debug("attaching dirty Type instance");
/*     */     try {
/* 117 */       getSession().saveOrUpdate(instance);
/* 118 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 120 */       log.error("attach failed", re);
/* 121 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachClean(Type instance) {
/* 126 */     log.debug("attaching clean Type instance");
/*     */     try {
/* 128 */       getSession().lock(instance, LockMode.NONE);
/* 129 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 131 */       log.error("attach failed", re);
/* 132 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findAllType() {
/* 137 */     log.debug("finding All Type");
/*     */     try {
/* 139 */       String queryString = "from Type";
/* 140 */       Query queryObject = getSession().createQuery(queryString);
/* 141 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 143 */       log.error("find All type failed", re);
/* 144 */       throw re;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.dao.TypeDAO
 * JD-Core Version:    0.6.1
 */