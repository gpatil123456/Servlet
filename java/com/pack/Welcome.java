package com.pack;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Welcome
 */
//@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		response.setContentType("Text/HTML");
		PrintWriter out=response.getWriter();
		out.println("<h1>hii dear"+name+"Welcome to my Page</h1>");
		out.println("<a href='Logout'>click here for logout</a>");
		//out.println("<a href='login.html'>click here for logout</a>");
        //out.println("</hr>");
		  ServletConfig conf=getServletConfig();
	      ServletContext c=getServletContext();
	        String val=c.getInitParameter("UserName");
	     //  String val=conf.getInitParameter("Developer");
//	         String  val=conf.getInitParameter("Developer");
	        out.println("<h4 style='text-align:right;font-style:italic'>Developed by "+val+"</h4>");
	}

}
	