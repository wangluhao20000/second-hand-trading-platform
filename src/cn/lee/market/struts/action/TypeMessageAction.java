/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.MessageDAO;
/*    */ import cn.lee.market.dao.TypeDAO;
/*    */ import cn.lee.market.model.Message;
/*    */ import cn.lee.market.model.Type;
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
/*    */ public class TypeMessageAction extends Action
/*    */ {
/* 21 */   private int size = 0;
/* 22 */   private int page = 0;
/* 23 */   private int first = 0;
/* 24 */   private int last = 0;
/* 25 */   private int cur_page = 0;
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 31 */     TypeDAO tDao = new TypeDAO();
/* 32 */     MessageDAO mDao = new MessageDAO();
/* 33 */     HashMap messageMap = null;
/* 34 */     messageMap = new HashMap();
/* 35 */     String typeid = request.getParameter("typeid");
/* 36 */     Type type = tDao.findById(typeid);
/* 37 */     List typeMessage = mDao.getTypeMessages(type.getId());
/* 38 */     messageMap.put(type, typeMessage);
/* 39 */     request.getSession().setAttribute("TypeMessageMap", messageMap);
/* 40 */     if (request.getParameter("cur_page") != null)
/* 41 */       this.cur_page = Integer.parseInt(request.getParameter("cur_page"));
/*    */     else
/* 43 */       this.cur_page = 0;
/* 44 */     initPage(typeMessage);
/* 45 */     request.setAttribute("size", Integer.valueOf(this.size));
/* 46 */     request.setAttribute("page", Integer.valueOf(this.page));
/* 47 */     request.setAttribute("first", Integer.valueOf(this.first));
/* 48 */     request.setAttribute("last", Integer.valueOf(this.last));
/* 49 */     request.setAttribute("cur_page", Integer.valueOf(this.cur_page));
/* 50 */     return mapping.findForward("typeMessage");
/*    */   }
/*    */ 
/*    */   public void initPage(List<Message> typeMessage) {
/* 54 */     this.size = typeMessage.size();
/* 55 */     this.page = ((int)Math.ceil(this.size * 1.0D / 20.0D) - 1);
/* 56 */     this.first = (20 * this.cur_page);
/* 57 */     this.last = (20 * this.cur_page + 19);
/* 58 */     if (this.last > this.size - 1)
/* 59 */       this.last = (this.size - 1);
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.TypeMessageAction
 * JD-Core Version:    0.6.1
 */