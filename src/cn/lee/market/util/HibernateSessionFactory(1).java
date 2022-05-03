/*     */ package cn.lee.market.util;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import org.hibernate.HibernateException;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.SessionFactory;
/*     */ import org.hibernate.cfg.Configuration;
/*     */ 
/*     */ public class HibernateSessionFactory
/*     */ {
/*  22 */   private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
/*  23 */   private static final ThreadLocal<Session> threadLocal = new ThreadLocal();
/*  24 */   private static Configuration configuration = new Configuration();
/*     */   private static SessionFactory sessionFactory;
/*  26 */   private static String configFile = CONFIG_FILE_LOCATION;
/*     */ 
/*     */   public static Session getSession()
/*     */     throws HibernateException
/*     */   {
/*  39 */     Session session = (Session)threadLocal.get();
/*     */ 
/*  41 */     if ((session == null) || (!session.isOpen())) {
/*  42 */       if (sessionFactory == null) {
/*  43 */         rebuildSessionFactory();
/*     */       }
/*  45 */       session = sessionFactory != null ? sessionFactory.openSession() : 
/*  46 */         null;
/*  47 */       threadLocal.set(session);
/*     */     }
/*     */ 
/*  50 */     return session;
/*     */   }
/*     */ 
/*     */   public static void rebuildSessionFactory()
/*     */   {
/*     */     try
/*     */     {
/*  59 */       configuration.configure(configFile);
/*  60 */       sessionFactory = configuration.buildSessionFactory();
/*     */     } catch (Exception e) {
/*  62 */       System.err
/*  63 */         .println("%%%% Error Creating SessionFactory %%%%");
/*  64 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void closeSession()
/*     */     throws HibernateException
/*     */   {
/*  74 */     Session session = (Session)threadLocal.get();
/*  75 */     threadLocal.set(null);
/*     */ 
/*  77 */     if (session != null)
/*  78 */       session.close();
/*     */   }
/*     */ 
/*     */   public static SessionFactory getSessionFactory()
/*     */   {
/*  87 */     return sessionFactory;
/*     */   }
/*     */ 
/*     */   public static void setConfigFile(String configFile)
/*     */   {
/*  96 */     configFile = configFile;
/*  97 */     sessionFactory = null;
/*     */   }
/*     */ 
/*     */   public static Configuration getConfiguration()
/*     */   {
/* 105 */     return configuration;
/*     */   }
/*     */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.util.HibernateSessionFactory
 * JD-Core Version:    0.6.1
 */