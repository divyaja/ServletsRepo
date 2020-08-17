package com.servlets.demo.divya;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		 int k =0;
		/*
		 * PrintWriter out = res.getWriter(); out.print("Hello Sq" +
		 * req.getAttribute("ki"));
		 */
//		System.out.println("SQ called" + req.getParameter("k"));
		/*
		 * HttpSession session = req.getSession(); System.out.println("session value: "+
		 * session.getAttribute("k"));
		 */
		
		//use cookies to fetch data from other servlets
		
		Cookie cookie[] = req.getCookies();
		for (Cookie c : cookie) {
			if(c.getName().equalsIgnoreCase("k")){
				k = Integer.parseInt(c.getValue());
			}
		}
		res.getWriter().println("Output : "+ k*2);
		
	}

}
