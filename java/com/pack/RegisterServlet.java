package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name= req.getParameter("uname");
		String pass=req.getParameter("password");
		String email=req.getParameter("email");
		String Gender=req.getParameter("gen");
		String course=req.getParameter("course");
		String  cond=req.getParameter("condition");
	//System.out.println(cond);
		res.setContentType("Text/html");
		PrintWriter out=res.getWriter();
		if(cond!=null)
		{
			if(cond.equals("on"))
			{
		
		out.println("<h2>Name:-"+name);
				out.println("<h2>password:-"+pass);
				out.println("<h2>Email:-"+email);
				out.println("<h2>Gender:-"+Gender);
				out.println("<h2>course:-"+course);
		RequestDispatcher rd=req.getRequestDispatcher("welcome");
			rd.forward(req, res);
		
			}
		}
		
		else
		{
			
			
			out.println("<h1 style='color:red;padding:2px;text-align:center'>You hava not accepted terms and condition</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("form.html");
		rd.include(req,res);
		}
	}

}
