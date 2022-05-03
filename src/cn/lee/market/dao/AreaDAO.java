/*     */ package cn.lee.market.dao;
/*     */ 
/*     */ import cn.lee.market.model.Area;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.Criteria;
/*     */ import org.hibernate.LockMode;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.criterion.Example;
/*     */ 
/*     */ public class AreaDAO extends BaseHibernateDAO
/*     */ {
/*  21 */   private static final Log log = LogFactory.getLog(AreaDAO.class);
/*     */   public static final String AREA_NAME = "area_name";
/*     */   public static final String AREA_DESC = "area_desc";
/*     */ 
/*     */   public void save(Area transientInstance)
/*     */   {
/*  29 */     log.debug("saving Area instance");
/*     */     try {
/*  31 */       getSession().save(transientInstance);
/*  32 */       log.debug("save successful");
/*     */     } catch (RuntimeException re) {
/*  34 */       log.error("save failed", re);
/*  35 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void delete(Area persistentInstance) {
/*  40 */     log.debug("deleting Area instance");
/*     */     try {
/*  42 */       getSession().delete(persistentInstance);
/*  43 */       log.debug("delete successful");
/*     */     } catch (RuntimeException re) {
/*  45 */       log.error("delete failed", re);
/*  46 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public Area findById(String id) {
/*  51 */     log.debug("getting Area instance with id: " + id);
/*     */     try {
/*  53 */       return (Area)getSession()
/*  54 */         .get(Area.class, id);
/*     */     }
/*     */     catch (RuntimeException re) {
/*  57 */       log.error("get failed", re);
/*  58 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByExample(Area instance)
/*     */   {
/*  64 */     log.debug("finding Area instance by example");
/*     */     try {
/*  66 */       List results = getSession()
/*  67 */         .createCriteria(Area.class)
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
/*  79 */     log.debug("finding Area instance with property: " + propertyName + 
/*  80 */       ", value: " + value);
/*     */     try {
/*  82 */       String queryString = "from Area as model where model." + 
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
/*     */   public List findByArea_name(Object area_name) {
/*  94 */     return findByProperty("area_name", area_name);
/*     */   }
/*     */ 
/*     */   public List findByArea_desc(Object area_desc) {
/*  98 */     return findByProperty("area_desc", area_desc);
/*     */   }
/*     */ 
/*     */   public Area merge(Area detachedInstance) {
/* 102 */     log.debug("merging Area instance");
/*     */     try {
/* 104 */       Area result = (Area)getSession()
/* 105 */         .merge(detachedInstance);
/* 106 */       log.debug("merge successful");
/* 107 */       return result;
/*     */     } catch (RuntimeException re) {
/* 109 */       log.error("merge failed", re);
/* 110 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachDirty(Area instance) {
/* 115 */     log.debug("attaching dirty Area instance");
/*     */     try {
/* 117 */       getSession().saveOrUpdate(instance);
/* 118 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 120 */       log.error("attach failed", re);
/* 121 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachClean(Area instance) {
/* 126 */     log.debug("attaching clean Area instance");
/*     */     try {
/* 128 */       getSession().lock(instance, LockMode.NONE);
/* 129 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 131 */       log.error("attach failed", re);
/* 132 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findAllArea() {
/* 137 */     log.debug("finding All Area");
/*     */     try {
/* 139 */       String queryString = "from Area";
/* 140 */       Query queryObject = getSession().createQuery(queryString);
/* 141 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 143 */       log.error("find All Area failed", re);
/* 144 */       throw re;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.dao.AreaDAO
 * JD-Core Version:    0.6.1
 */