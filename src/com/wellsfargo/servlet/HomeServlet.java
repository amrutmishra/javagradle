package com.wellsfargo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, 
  HttpServletResponse response) 
  throws ServletException, IOException {
  
  PrintWriter out = response.getWriter();
  out.println("<HTML>");
  out.println("<HEAD>");
  out.println("<TITLE>Servlet Testing</TITLE>");
  out.println("</HEAD>");
  out.println("<BODY>");
  out.println("Welcome to the Servlet Testing Center");
  out.println("</BODY>");
  out.println("</HTML>");
 }

}
