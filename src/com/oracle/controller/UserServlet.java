package com.oracle.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.oracle.domin.User;

import com.oracle.factory.UserServiceFactory;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setCharacterEncoding("utf-8");

		resp.setContentType("text/html;charset=utf-8");

		PrintWriter out = resp.getWriter();

		HttpSession session = req.getSession();

		String action = req.getParameter("action");

		String bianhao = req.getParameter("id");
		
		String name=req.getParameter("name");
		
		String username=req.getParameter("username");
		
		String password=req.getParameter("password");
		
		String phone=req.getParameter("phone");
		
		String zctime=req.getParameter("zctime");
		
		String[] ids = req.getParameterValues("ids");
		
		if ("ShowAllUser".equals(action)) {

			List<User> list = UserServiceFactory.getUserServiceImpl().ShowAll();

			session.setAttribute("list", list);

			resp.sendRedirect("finduser.jsp");

			return;
		}
		if ("add".equals(action)) {


			User s=new User(name, username, password, phone, zctime);

			// User
			// User=UserServiceFactory.getUserServiceImpl().add(stuNo);

			// if(User!=null){
			//
			// session.setAttribute("msg", "学号"+stuNo+"已经存在，请重新进行添加！");
			//
			// resp.sendRedirect("register.jsp");
			//
			// return;
			// }

			int i = UserServiceFactory.getUserServiceImpl().add(s);

			if (i > 0) {

				resp.sendRedirect("UserServlet?action=ShowAll");

				return;

				// System.out.println("添加成功！");

			} else {

				resp.sendRedirect("add.html");

				return;
			}
		}

		if ("delete".equals(action)) {

			if (ids == null || ids.length == 0) {

				session.setAttribute("deleteMsg", "请您至少选择一个进行删除");

				resp.sendRedirect("UserServlet?action=ShowAll");

				return;

			}

			int[] arr = UserServiceFactory.getUserServiceImpl().delete(ids);

			if (arr==null||arr[0]<1) {

				System.out.println("删除失败");
				
				resp.sendRedirect("UserServlet?action=ShowAll");

				return;

			} else {

				System.out.println("删除成功");
				
				resp.sendRedirect("UserServlet?action=ShowAll");

				return;

			}
		}

		if ("showOne".equals(action)) {

			int id = Integer.parseInt(bianhao);

			User stu = UserServiceFactory.getUserServiceImpl().showOne(id);

			session.setAttribute("stu", stu);

			resp.sendRedirect("showOne.jsp");

			return;

		}

		if ("update".equals(action)) {

			int id = Integer.parseInt(bianhao);

			User s = new User(name, username, password, phone, zctime);

			int i = UserServiceFactory.getUserServiceImpl().update(s);

			if (i > 0) {

				resp.sendRedirect("UserServlet?action=ShowAll");

				return;
			} else {

				resp.sendRedirect("UserServlet?action=showAll");

				return;

			}
		}
	}

}
