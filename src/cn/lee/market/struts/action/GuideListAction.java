/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.ArticleDAO;
/*    */ import java.util.List;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
/*    */ import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class GuideListAction extends Action
/*    */ {
/* 17 */   ArticleDAO aDao = new ArticleDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 23 */     List articleList = this.aDao.getAllArticle();
/* 24 */     request.setAttribute("articleList", articleList);
/*    */ 
/* 26 */     String delSucess = (String)request.getAttribute("delSucess");
/* 27 */     if (delSucess != null) {
/* 28 */       request.setAttribute("delSucess", "delSucess");
/*    */     }
/* 30 */     return mapping.findForward("guideList");
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.GuideListAction
 * JD-Core Version:    0.6.1
 */