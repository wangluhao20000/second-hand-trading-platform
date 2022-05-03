/*    */ package cn.lee.market.dao;
/*    */ 
/*    */ import cn.lee.market.util.HibernateSessionFactory;
/*    */ import org.hibernate.Session;
/*    */ 
/*    */ public class BaseHibernateDAO
/*    */   implements IBaseHibernateDAO
/*    */ {
/*    */   public Session getSession()
/*    */   {
/* 16 */     return HibernateSessionFactory.getSession();
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.dao.BaseHibernateDAO
 * JD-Core Version:    0.6.1
 */