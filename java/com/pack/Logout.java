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
 * Servlet implementation class Logout
 */
//@WebServlet("/Logout")
public class Logout extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			String name=request.getParameter("name");
			response.setContentType("Text/HTML");
			PrintWriter out=response.getWriter();
			out.println("<h1>Dear User,You have successfully logout</h1>");
			out.println("<a href='login.html'>click here  for Go to home page</a>");
	        //out.println("</hr>");
			 // ServletConfig conf=getServletConfig();
		      ServletContext c=getServletContext();
		        String val=c.getInitParameter("UserName");
		     //  String val=conf.getInitParameter("Developer");
//		         String  val=conf.getInitParameter("Developer");
		        out.println("<h4 style='text-align:right;font-style:italic'>Developed by "+val+"</h4>");
		}

	}
   
