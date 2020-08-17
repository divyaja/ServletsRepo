package com.servlets.demo.divya;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		System.out.println(req.getRequestURI());
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i +j;
		
		/* Request Dispatcher
		 * req.setAttribute("ki", k); RequestDispatcher rd =
		 * req.getRequestDispatcher("sq"); rd.forward(req, res);
		 */
		
		// url redirecting
//		res.sendRedirect("sq?k="+k);
		
		// Session Management
		/*
		 * HttpSession session = req.getSession(); session.setAttribute("k", k);
		 * res.sendRedirect("sq");
		 */
		//Use cookies to send data from one servlet to another
		
		Cookie cookie = new Cookie("k", k +"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
				
		
	}
}
