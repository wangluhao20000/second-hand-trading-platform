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
/*    */ public class ArticleAction extends Action
/*    */ {
/* 16 */   ArticleDAO aDao = new ArticleDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 22 */     Article article = null;
/* 23 */     String articleid = request.getParameter("articleid");
/* 24 */     article = this.aDao.findById(articleid);
/* 25 */     request.setAttribute("article", article);
/* 26 */     return mapping.findForward("article");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.ArticleAction
 * JD-Core Version:    0.6.1
 */