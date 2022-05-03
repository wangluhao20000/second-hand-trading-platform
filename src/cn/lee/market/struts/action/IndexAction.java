/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.AreaDAO;
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.dao.TypeDAO;
/*    */ import cn.lee.market.model.Area;
/*    */ import cn.lee.market.model.Message;
/*    */ import cn.lee.market.model.Type;
/*    */ import java.io.PrintStream;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class IndexAction extends Action
/*    */ {
/* 22 */   TypeDAO tDao = new TypeDAO();
/* 23 */   AreaDAO aDao = new AreaDAO();
/* 24 */   MessageDAO mDao = new MessageDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 30 */     HashMap messageMap = new HashMap();
/* 31 */     HashMap typeMap = new HashMap();
/* 32 */     HashMap areaMap = new HashMap();
/* 33 */     List TopMessageList = this.mDao.findByTop_value2();
/* 34 */     List <Type> typeList = this.tDao.findAllType();
/*    */     List typeMessage;
/* 35 */     for (Type type : typeList)
/*    */     {
/* 37 */       typeMessage = this.mDao.getTypeMessages(type.getId());
/* 38 */       messageMap.put(type.getId(), typeMessage);
/* 39 */       typeMap.put(type.getId(), type.getType_desc());
/*    */     }
/* 41 */     request.getSession().setAttribute("typeMap", typeMap);
/* 42 */     List <Area>areaList = this.aDao.findAllArea();
/* 43 */     for (Area area : areaList)
/*    */     {
/* 45 */       areaMap.put(area.getId(), area.getArea_desc());
/*    */     }
/* 47 */     request.getSession().setAttribute("areaMap", areaMap);
/* 48 */     request.setAttribute("messageMap", messageMap);
/* 49 */     request.getSession().setAttribute("TopMessageList", TopMessageList);
/* 50 */     request.setAttribute("homeFlag", "homeFlag");
/* 51 */     if (request.getAttribute("nologin") != null)
/* 52 */       request.setAttribute("nologin", "nologin");
/* 53 */     return mapping.findForward("homepage");
/*    */   }
/*    */ 
/*    */   public void display(List <Type>typeList) {
/* 57 */     System.out.println("----------------------------------------");
/* 58 */     for (Type type : typeList)
/*    */     {
/* 60 */       System.out.println(type.getType_desc());
/* 61 */       List <Message> typeMessage = this.mDao.getTypeMessages(type.getId());
/* 62 */       for (Message message : typeMessage)
/*    */       {
/* 64 */         System.out.printf("----", new Object[0]);
/* 65 */         System.out.println(message.getMessage_desc());
/*    */       }
/* 67 */       System.out.println("----------------------------------------");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.IndexAction
 * JD-Core Version:    0.6.1
 */