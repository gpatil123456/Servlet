package com.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class calculator
 */
//@WebServlet("/calculator")
public class calculator extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("Text/HTML");
		PrintWriter out=response.getWriter();
		int n1=Integer.parseInt(request.getParameter("g"));
		int n2=Integer.parseInt(request.getParameter("g1"));
		//String opr=request.getParameter("opr");
//int result=Integer.parseInt(n1)+Integer.parseInt(n2);
		String opr=request.getParameter("opr");
		if(opr.equalsIgnoreCase("add"))
		{
		   int	add=n1+n2;
			out.println("<h1 style='color:red;font-size:30px;text-align:center'>"+add+"</h1>");
		}
		else if(opr.equalsIgnoreCase("sub"))
		{
		int	sub=n1-n2;
		out.println("<h1 style='color:red;font-size:30px;text-align:center'>"+sub+"</h1>");
		}
		else if(opr.equalsIgnoreCase("mul"))
		{
			int	mul=n1*n2;
			out.println("<h1 style='color:red;font-size:30px;text-align:center'>"+mul+"</h1>");
		}
		else if(opr.equalsIgnoreCase("div"))
		{
			int	div=n1/n2;
			out.println("<h1 style='color:red;font-size:30px;text-align:center'>"+div+"</h1>");
		}
		else
		{
			out.println("<h1 style='color:red;padding:2px;text-align:center'>calculator not work</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("cal.html");
			rd.include(request,response);
		}
		

	}

}
