package com.oracle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.domin.FenLei;
import com.oracle.factory.FenLeiServiceFactory;



/**
 * Servlet implementation class FenLeiServlet
 */
public class FenLeiServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String action=req.getParameter("action");
		
		HttpSession session=req.getSession();
		
		String bianhao=req.getParameter("id");
		
		String name=req.getParameter("name");
		
		if("addFenlei".equals(action)){			
			
			//int id=Integer.parseInt(bianhao);
						
			FenLei fl=new FenLei(name);
			
			int i = FenLeiServiceFactory.getFenLeiServiceImpl().addFenlei(fl);
			
			if(i>0){
				
				resp.sendRedirect("FenLeiServlet?action=showFenlei");
				
				return;
				
			}else{
				
				resp.sendRedirect("addfl.jsp");
				
				return;
			}
		}
		
		if("showFenlei".equals(action)){
			
			List<FenLei> list = FenLeiServiceFactory.getFenLeiServiceImpl().showFenlei();

			session.setAttribute("list", list);

			resp.sendRedirect("findfl.jsp");

			return;
		}
		
		if("changeFenlei".equals(action)){
			
			int id=Integer.parseInt(bianhao);
		}
	}
}
