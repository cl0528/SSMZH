package com.oracle.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.domin.Admin;
import com.oracle.factory.AdminServiceFactory;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
         req.setCharacterEncoding("utf-8");
		
		//2.拿到提交的参数
		String action=req.getParameter("action");
		
		String name=req.getParameter("name");
		
		String phone=req.getParameter("phone");
		
        String username=req.getParameter("username");
		
		String password=req.getParameter("password");
		
		//创建一个session对象
		HttpSession session=req.getSession();
		
		if("login".equals(action)){//1.登录的代码	
			
		Admin a=new Admin();
		
		a.setUsername(username);
		
		a.setPassword(password);
		
		Admin admin=AdminServiceFactory.getAdminServiceImpl().login(a);
		
		if(admin==null){//用户不存在
			
			session.setAttribute("msg2", "用户名不存在");
			
			resp.sendRedirect("login.jsp");
			
			return;
		}
		
		if(!admin.getPassword().equals(a.getPassword())){//密码错误
			
			session.setAttribute("msg2", "密码错误");
			
	        resp.sendRedirect("login.jsp");
			
			return;
			
			
		}
		
		//System.out.println("登录成功");
		
		//增删改查action(add,delete,showOne,showAll,update)
		
		//登陆成功
		
		session.setAttribute("username",username);
		
		//System.out.println(userName);
		
		resp.sendRedirect("Guanli.jsp");
		
		return;
		
		}
		
		if("register".equals(action)){//注册界面
			
           Admin a=new Admin(name, username, password, phone);
			
			Admin admin=AdminServiceFactory.getAdminServiceImpl().login(a);
			
			if(admin!=null){//用户名已存在
				
				session.setAttribute("msg", "用户名"+username+"已经存在，请重新注册");
				
				//跳回页面
                resp.sendRedirect("register.jsp");
				
				return;
							
			}
			
			int i=AdminServiceFactory.getAdminServiceImpl().register(a);
			
			if(i>0){//注册成功
				
				resp.sendRedirect("login.jsp");
				
				return;
				
			}else{
				
				resp.sendRedirect("register.jsp");
				
				return;
			}
		}
          
		
		if("showAdmin".equals(action)){
			
			String uname=(String) session.getAttribute("username");
			
			Admin a=AdminServiceFactory.getAdminServiceImpl().showAdmin(uname);
			
			session.setAttribute("admin1", a);
			
			resp.sendRedirect("findadmin.jsp");
		}
        
		if("exit".equals(action)){
			
			session.invalidate();
			
			resp.sendRedirect("login.jsp");
//			
//			return;
		
		}
	}
}

