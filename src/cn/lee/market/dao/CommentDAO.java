/*     */ package cn.lee.market.dao;
/*     */ 
/*     */ import cn.lee.market.model.Comment;
/*     */ import cn.lee.market.model.Message;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.Criteria;
/*     */ import org.hibernate.LockMode;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.criterion.Example;
/*     */ 
/*     */ public class CommentDAO extends BaseHibernateDAO
/*     */ {
/*  22 */   private static final Log log = LogFactory.getLog(CommentDAO.class);
/*     */   public static final String CONTENT = "content";
/*     */ 
/*     */   public void save(Comment transientInstance)
/*     */   {
/*  29 */     log.debug("saving Comment instance");
/*     */     try {
/*  31 */       getSession().save(transientInstance);
/*  32 */       log.debug("save successful");
/*     */     } catch (RuntimeException re) {
/*  34 */       log.error("save failed", re);
/*  35 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void delete(Comment persistentInstance) {
/*  40 */     log.debug("deleting Comment instance");
/*     */     try {
/*  42 */       getSession().delete(persistentInstance);
/*  43 */       log.debug("delete successful");
/*     */     } catch (RuntimeException re) {
/*  45 */       log.error("delete failed", re);
/*  46 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public Comment findById(String id) {
/*  51 */     log.debug("getting Comment instance with id: " + id);
/*     */     try {
/*  53 */       return (Comment)getSession()
/*  54 */         .get(Comment.class, id);
/*     */     }
/*     */     catch (RuntimeException re) {
/*  57 */       log.error("get failed", re);
/*  58 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByExample(Comment instance)
/*     */   {
/*  64 */     log.debug("finding Comment instance by example");
/*     */     try {
/*  66 */       List results = getSession()
/*  67 */         .createCriteria(Comment.class)
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
/*  79 */     log.debug("finding Comment instance with property: " + propertyName + 
/*  80 */       ", value: " + value);
/*     */     try {
/*  82 */       String queryString = "from Comment as model where model." + 
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
/*     */   public List findByContent(Object content) {
/*  94 */     return findByProperty("content", content);
/*     */   }
/*     */ 
/*     */   public Comment merge(Comment detachedInstance) {
/*  98 */     log.debug("merging Comment instance");
/*     */     try {
/* 100 */       Comment result = (Comment)getSession()
/* 101 */         .merge(detachedInstance);
/* 102 */       log.debug("merge successful");
/* 103 */       return result;
/*     */     } catch (RuntimeException re) {
/* 105 */       log.error("merge failed", re);
/* 106 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachDirty(Comment instance) {
/* 111 */     log.debug("attaching dirty Comment instance");
/*     */     try {
/* 113 */       getSession().saveOrUpdate(instance);
/* 114 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 116 */       log.error("attach failed", re);
/* 117 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachClean(Comment instance) {
/* 122 */     log.debug("attaching clean Comment instance");
/*     */     try {
/* 124 */       getSession().lock(instance, LockMode.NONE);
/* 125 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 127 */       log.error("attach failed", re);
/* 128 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findAllCommentOfMessage(Message message) {
/* 133 */     log.debug("finding Comment instance with messageid: " + message.getId());
/*     */     try {
/* 135 */       String queryString = "from Comment as model where model.TMessage= '" + 
/* 136 */         message.getId() + "'";
/* 137 */       Query queryObject = getSession().createQuery(queryString);
/* 138 */       return queryObject.list();
/*     */     } catch (RuntimeException re) {
/* 140 */       log.error("find by messageid  failed", re);
/* 141 */       throw re;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.dao.CommentDAO
 * JD-Core Version:    0.6.1
 */