/*    */ package cn.lee.market.util;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.text.ParseException;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.HashSet;
/*    */ import java.util.Iterator;
/*    */ import java.util.Set;
/*    */ import org.apache.commons.beanutils.Converter;
/*    */ 
/*    */ public class DateConverter
/*    */   implements Converter
/*    */ {
/* 16 */   private static SimpleDateFormat df = new SimpleDateFormat();
/*    */ 
/* 21 */   private static Set<String> patterns = new HashSet();
/*    */ 
/*    */   static {
/* 24 */     patterns.add("yyyy-MM-dd");
/* 25 */     patterns.add("yyyy-MM-dd HH:mm");
/* 26 */     patterns.add("yyyy-MM-dd HH:mm:ss");
/* 27 */     patterns.add("yyyy/MM/dd HH:mm:ss");
/*    */   }
/*    */ 
/*    */   public Object convert(Class type, Object value)
/*    */   {
/* 34 */     if (value == null)
/* 35 */       return null;
/* 36 */     if ((value instanceof String))
/*    */     {
/* 38 */       Object dateObj = null;
/* 39 */       Iterator it = patterns.iterator();
/*    */ 
/* 41 */       while (it.hasNext())
/*    */       {
/* 43 */         String pattern = (String)it.next();
/* 44 */         df.applyPattern(pattern);
/*    */         try {
/* 46 */           dateObj = df.parse((String)value);
/*    */         }
/*    */         catch (ParseException e)
/*    */         {
/* 50 */           continue;
/*    */         }
/* 52 */         break;
/*    */       }
/* 54 */       return dateObj;
/*    */     }
/*    */ 
/* 57 */     return null;
/*    */   }
/*    */   public static void main(String[] args) {
/* 60 */     DateConverter dc = new DateConverter();
/* 61 */     String str = "2028-12-12";
/* 62 */     System.out.println(dc.convert(Date.class, str));
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.util.DateConverter
 * JD-Core Version:    0.6.1
 */