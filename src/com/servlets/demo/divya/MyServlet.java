package com.servlets.demo.divya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.print("Hi, please tell me ur name :<br/>");
		ServletContext context = getServletContext();
		out.println(context.getInitParameter("name"));
	}

}
