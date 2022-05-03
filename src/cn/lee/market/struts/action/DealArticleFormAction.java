/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.ArticleDAO;
/*    */ import cn.lee.market.model.Article;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class DealArticleFormAction extends Action
/*    */ {
/* 16 */   ArticleDAO aDao = new ArticleDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 22 */     Article article = null;
/* 23 */     String title = request.getParameter("title");
/* 24 */     String content = request.getParameter("content");
/* 25 */     String action = request.getParameter("action");
/* 26 */     if ("add".equals(action))
/*    */     {
/* 28 */       article = new Article(title, content);
/* 29 */       this.aDao.save(article);
/*    */     }
/* 31 */     else if ("mod".equals(action))
/*    */     {
/* 33 */       String articleid = request.getParameter("articleid");
/* 34 */       article = this.aDao.findById(articleid);
/* 35 */       article.setTitle(title);
/* 36 */       article.setContent(content);
/* 37 */       this.aDao.attachDirty(article);
/*    */     }
/* 39 */     request.setAttribute("article", article);
/* 40 */     return mapping.findForward("guidelist");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.DealArticleFormAction
 * JD-Core Version:    0.6.1
 */