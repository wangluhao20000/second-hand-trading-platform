/*    */ package cn.lee.market.struts.action;
/*    */ 
/*    */ import cn.lee.market.dao.StudentDAO;
/*    */ import cn.lee.market.dao.UserDAO;
/*    */ import cn.lee.market.model.Student;
/*    */ import cn.lee.market.model.User;
/*    */ import cn.lee.market.struts.actionform.RegisterForm;
/*    */ import java.io.PrintStream;
import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.apache.struts.action.Action;
/*    */ import org.apache.struts.action.ActionForm;
/*    */ import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
/*    */ 
/*    */ public class RegitserAction extends Action
/*    */ {
/* 23 */   UserDAO uDao = new UserDAO();
/* 24 */   StudentDAO sDao = new StudentDAO();
/*    */ 
/*    */   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
/*    */     throws Exception
/*    */   {
/* 30 */     HttpSession session = request.getSession();
/* 31 */     RegisterForm registerForm = (RegisterForm)form;
/* 32 */     int result = 0;
/* 33 */     User user = null;
/* 34 */     if (registerForm != null)
/*    */     {
/* 36 */       result = checkUserAndStu(registerForm);
/* 37 */       if (result == 0)
/*    */       {
/* 39 */         user = registerForm.getUser();
/* 40 */         user.setMStudent(this.sDao.findById(registerForm.getStu_id()));
/* 41 */         user.setCreate_time(new Date());
/* 42 */         this.uDao.save(user);
/* 43 */         session.setAttribute("user", user);
/* 44 */         return mapping.findForward("regitserSucess");
/*    */       }
/* 46 */       System.out.println(result);
/*    */     }
/* 48 */     return mapping.findForward("regitserFalse");
/*    */   }
/*    */ 
/*    */   public int checkUserAndStu(RegisterForm form) {
/* 52 */     String username = form.getUsername();
/* 53 */     String stu_id = form.getStu_id();
/* 54 */     User user =this.uDao.findByUsername(username);
              List userList =new ArrayList();
              userList.add(user);
/* 55 */     System.out.println(username + ":" + userList.size());
/* 56 */     if (userList.size() != 0)
/*    */     {
/* 58 */       System.out.println("用户名已经存在!");
/* 59 */       return 1;
/*    */     }
/* 61 */     Student stu = this.sDao.findById(form.getStu_id());
/* 62 */     if (stu == null)
/*    */     {
/* 64 */       System.out.println("没有此学号的学生！");
/* 65 */       return 2;
/*    */     }
/* 67 */     userList = this.uDao.findByStu_id(stu_id);
/* 68 */     if (userList.size() != 0)
/*    */     {
/* 70 */       System.out.println("该学号已经注册！");
/* 71 */       return 3;
/*    */     }
/*    */ 
/* 74 */     return 0;
/*    */   }
/*    */ }

/* Location:           C:\Users\muye\Desktop\51\校园二手交易平台设计与论文\market\code\market\WEB-INF\classes\
 * Qualified Name:     cn.lee.market.struts.action.RegitserAction
 * JD-Core Version:    0.6.1
 */