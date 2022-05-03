/*    */ package cn.lee.market.test;
/*    */ 
/*    */ import cn.lee.market.dao.TypeDAO;
/*    */ import cn.lee.market.model.Type;
/*    */ import cn.lee.market.util.HibernateSessionFactory;
/*    */ import java.io.PrintStream;
/*    */ import org.hibernate.SessionFactory;
/*    */ import org.hibernate.Transaction;
/*    */ import org.hibernate.classic.Session;
/*    */ 
/*    */ public class Test
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 17 */     HibernateSessionFactory.rebuildSessionFactory();
/* 18 */     SessionFactory sf = HibernateSessionFactory.getSessionFactory();
/* 19 */     Session session = sf.openSession();
/* 20 */     session.beginTransaction();
/* 21 */     TypeDAO tDao = new TypeDAO();
/* 22 */     Type type = tDao.findById("1");
/* 23 */     System.out.println(type.getType_desc());
/* 24 */     session.getTransaction().commit();
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.test.Test
 * JD-Core Version:    0.6.1
 */