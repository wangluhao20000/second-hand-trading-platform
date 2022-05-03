/*    */ package cn.lee.market.filter;
/*    */ 
/*    */ import cn.lee.market.util.HibernateSessionFactory;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.Filter;
/*    */ import javax.servlet.FilterChain;
/*    */ import javax.servlet.FilterConfig;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.apache.commons.logging.Log;
/*    */ import org.apache.commons.logging.LogFactory;
/*    */ import org.hibernate.Session;
/*    */ import org.hibernate.Transaction;
/*    */ 
/*    */ public class HibernateFilter
/*    */   implements Filter
/*    */ {
/* 21 */   public static Log log = LogFactory.getLog(HibernateFilter.class);
/*    */ 
/*    */   public void destroy()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
/*    */   {
/* 29 */     Session session = HibernateSessionFactory.getSession();
/*    */     try {
/* 31 */       log.debug("set character Encoding to GBK");
/* 32 */       request.setCharacterEncoding("GBK");
/* 33 */       log.debug("starting a database transation");
/* 34 */       session.beginTransaction();
/*    */ 
/* 36 */       log.debug("Request path:\t" + 
/* 37 */         ((HttpServletRequest)request).getServletPath());
/* 38 */       chain.doFilter(request, response);
/* 39 */       log.debug("Committing the database transaction after exception.");
/* 40 */       session.getTransaction().commit();
/*    */     } catch (Throwable ex) {
/* 42 */       ex.printStackTrace();
/*    */       try {
/* 44 */         log.debug("Trying to roolback database transaction after exception.");
/* 45 */         session.getTransaction().rollback();
/*    */       }
/*    */       catch (Throwable rbEx)
/*    */       {
/* 49 */         log.error("Could not roolback transaction after exception!", rbEx);
/*    */       }
/* 51 */       throw new ServletException(ex);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void init(FilterConfig arg0)
/*    */     throws ServletException
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.filter.HibernateFilter
 * JD-Core Version:    0.6.1
 */