/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.model.Message;
/*    */ import java.util.List;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class SearchMessagePageAction extends Action
/*    */ {
/* 18 */   private int size = 0;
/* 19 */   private int page = 0;
/* 20 */   private int first = 0;
/* 21 */   private int last = 0;
/* 22 */   private int cur_page = 0;
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 28 */     List messageList = (List)request.getSession().getAttribute("searchMessageList");
/* 29 */     if (request.getParameter("cur_page") != null)
/* 30 */       this.cur_page = Integer.parseInt(request.getParameter("cur_page"));
/*    */     else
/* 32 */       this.cur_page = 0;
/* 33 */     initPage(messageList);
/* 34 */     request.setAttribute("size", Integer.valueOf(this.size));
/* 35 */     request.setAttribute("page", Integer.valueOf(this.page));
/* 36 */     request.setAttribute("first", Integer.valueOf(this.first));
/* 37 */     request.setAttribute("last", Integer.valueOf(this.last));
/* 38 */     request.setAttribute("cur_page", Integer.valueOf(this.cur_page));
/* 39 */     return mapping.findForward("searchMessage");
/*    */   }
/*    */ 
/*    */   public void initPage(List<Message> typeMessage) {
/* 43 */     this.size = typeMessage.size();
/* 44 */     this.page = ((int)Math.ceil(this.size * 1.0D / 20.0D) - 1);
/* 45 */     this.first = (20 * this.cur_page);
/* 46 */     this.last = (20 * this.cur_page + 19);
/* 47 */     if (this.last > this.size - 1)
/* 48 */       this.last = (this.size - 1);
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.SearchMessagePageAction
 * JD-Core Version:    0.6.1
 */