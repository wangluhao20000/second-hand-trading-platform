/*     */ package cn.lee.market.dao;
/*     */ 
/*     */ import cn.lee.market.model.Student;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.Criteria;
/*     */ import org.hibernate.LockMode;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.criterion.Example;
/*     */ 
/*     */ public class StudentDAO extends BaseHibernateDAO
/*     */ {
/*  21 */   private static final Log log = LogFactory.getLog(StudentDAO.class);
/*     */   public static final String STU_NAME = "stu_name";
/*     */   public static final String SEX = "sex";
/*     */ 
/*     */   public void save(Student transientInstance)
/*     */   {
/*  29 */     log.debug("saving Student instance");
/*     */     try {
/*  31 */       getSession().save(transientInstance);
/*  32 */       log.debug("save successful");
/*     */     } catch (RuntimeException re) {
/*  34 */       log.error("save failed", re);
/*  35 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void delete(Student persistentInstance) {
/*  40 */     log.debug("deleting Student instance");
/*     */     try {
/*  42 */       getSession().delete(persistentInstance);
/*  43 */       log.debug("delete successful");
/*     */     } catch (RuntimeException re) {
/*  45 */       log.error("delete failed", re);
/*  46 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public Student findById(String id) {
/*  51 */     log.debug("getting Student instance with id: " + id);
/*     */     try {
/*  53 */       return (Student)getSession()
/*  54 */         .get(Student.class, id);
/*     */     }
/*     */     catch (RuntimeException re) {
/*  57 */       log.error("get failed", re);
/*  58 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public List findByExample(Student instance)
/*     */   {
/*  64 */     log.debug("finding Student instance by example");
/*     */     try {
/*  66 */       List results = getSession()
/*  67 */         .createCriteria(Student.class)
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
/*  79 */     log.debug("finding Student instance with property: " + propertyName + 
/*  80 */       ", value: " + value);
/*     */     try {
/*  82 */       String queryString = "from Student as model where model." + 
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
/*     */   public List findByStu_name(Object stu_name) {
/*  94 */     return findByProperty("stu_name", stu_name);
/*     */   }
/*     */ 
/*     */   public List findBySex(Object sex) {
/*  98 */     return findByProperty("sex", sex);
/*     */   }
/*     */ 
/*     */   public Student merge(Student detachedInstance) {
/* 102 */     log.debug("merging Student instance");
/*     */     try {
/* 104 */       Student result = (Student)getSession()
/* 105 */         .merge(detachedInstance);
/* 106 */       log.debug("merge successful");
/* 107 */       return result;
/*     */     } catch (RuntimeException re) {
/* 109 */       log.error("merge failed", re);
/* 110 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachDirty(Student instance) {
/* 115 */     log.debug("attaching dirty Student instance");
/*     */     try {
/* 117 */       getSession().saveOrUpdate(instance);
/* 118 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 120 */       log.error("attach failed", re);
/* 121 */       throw re;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void attachClean(Student instance) {
/* 126 */     log.debug("attaching clean Student instance");
/*     */     try {
/* 128 */       getSession().lock(instance, LockMode.NONE);
/* 129 */       log.debug("attach successful");
/*     */     } catch (RuntimeException re) {
/* 131 */       log.error("attach failed", re);
/* 132 */       throw re;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\???????????????????????????????????????\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.dao.StudentDAO
 * JD-Core Version:    0.6.1
 */