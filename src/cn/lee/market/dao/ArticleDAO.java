/*     */ package cn.lee.market.dao;
/*     */ 
/*     */ import cn.lee.market.model.Article;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.Criteria;
/*     */ import org.hibernate.LockMode;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.criterion.Example;
/*     */ 
/*     */ public class ArticleDAO extends BaseHibernateDAO
/*     */ {
/*  21 */   private static final Log log = LogFactory.getLog(ArticleDAO.class);
/*     */   public static final String TITLE = "title";
/*     */   public static final String CONTENT = "content";
/*     */ 
/*     */   public void save(Article transientInstance)
/*     */   {
/*  29 */     log.debug("saving Article instance");
/*     */     try {
/*  31 */       getSession().save(transientInstance);
/*  32 */       log.debug("save successful");
/*     */     } catch (RuntimeException re) {
/*  34 */       log.error("save failed", re);
/*  35 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void delete(Article persistentInstance) {
/*  40 */     log.debug("deleting Article instance");
/*     */     try {
/*  42 */       getSession().delete(persistentInstance);
/*  43 */       log.debug("delete successful");
/*     */     } catch (RuntimeException re) {
/*  45 */       log.error("delete failed", re);
/*  46 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public Article findById(String id) {
/*  51 */     log.debug("getting Article instance with id: " + id);
/*     */     try {
/*  53 */       return (Article)getSession()
/*  54 */         .get(Article.class, id);
/*     */     }
/*     */     catch (RuntimeException re) {
/*  57 */       log.error("get failed", re);
/*  58 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByExample(Article instance)
/*     */   {
/*  64 */     log.debug("finding Article instance by example");
/*     */     try {
/*  66 */       List results = getSession()
/*  67 */         .createCriteria(Article.class)
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
/*  79 */     log.debug("finding Article instance with property: " + propertyName + 
/*  80 */       ", value: " + value);
/*     */     try {
/*  82 */       String queryString = "from Article as model where model." + 
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
/*     */   public List findByTitle(Object title) {
/*  94 */     return findByProperty("title", title);
/*     */   }
/*     */ 
/*     */   public List findByContent(Object content) {
/*  98 */     return findByProperty("content", content);
/*     */   }
/*     */ 
/*     */   public Article merge(Article detachedInstance) {
/* 102 */     log.debug("merging Article instance");
/*     */     try {
/* 104 */       Article result = (Article)getSession()
/* 105 */         .merge(detachedInstance);
/* 106 */       log.debug("merge successful");
/* 107 */       return result;
/*     */     } catch (RuntimeException re) {
/* 109 */       log.error("merge failed", re);
/* 110 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachDirty(Article instance) {
/* 115 */     log.debug("attaching dirty Article instance");
/*     */     try {
/* 117 */       getSession().saveOrUpdate(instance);
/* 118 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 120 */       log.error("attach failed", re);
/* 121 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachClean(Article instance) {
/* 126 */     log.debug("attaching clean Article instance");
/*     */     try {
/* 128 */       getSession().lock(instance, LockMode.NONE);
/* 129 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 131 */       log.error("attach failed", re);
/* 132 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List getAllArticle() {
/* 137 */     log.debug("finding all Article instance");
/*     */     try {
/* 139 */       String queryString = "from Article";
/* 140 */       Query queryObject = getSession().createQuery(queryString);
/* 141 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 143 */       log.error("finding all Article instance failed", re);
/* 144 */       throw re;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.dao.ArticleDAO
 * JD-Core Version:    0.6.1
 */