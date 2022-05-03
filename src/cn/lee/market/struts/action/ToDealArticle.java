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
/*    */ public class ToDealArticle extends Action
/*    */ {
/* 16 */   ArticleDAO aDao = new ArticleDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 22 */     Article article = null;
/* 23 */     String articleid = request.getParameter("articleid");
/* 24 */     article = this.aDao.findById(articleid);
/* 25 */     String action = request.getParameter("action");
/* 26 */     if ("mod".equals(action))
/*    */     {
/* 28 */       request.setAttribute("article", article);
/* 29 */       return mapping.findForward("articleForm");
/*    */     }
/* 31 */     if ("del".equals(action))
/*    */     {
/* 33 */       this.aDao.delete(article);
/* 34 */       request.setAttribute("delSucess", "delSucess");
/*    */     }
/* 36 */     return mapping.findForward("guidelist");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.ToDealArticle
 * JD-Core Version:    0.6.1
 */