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
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		response.setContentType("Text/HTML");
		PrintWriter out=response.getWriter();
		out.print("<h1>hello dear "+name +" You have successfully Login</h1>");
		out.print("<a href='Welcome1'>click here to be continue</a>");
        out.println("</hr>");
     //  ServletConfig conf=getServletConfig();
      ServletContext c=getServletContext();
        String val=c.getInitParameter("UserName");
      // String val=conf.getInitParameter("Developer");
//         String  val=conf.getInitParameter("Developer");
        out.println("<h4 style='text-align:right;font-style:italic'>Developed by "+val+"</h4>");
	}

}
