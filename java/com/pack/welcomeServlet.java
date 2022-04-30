package com.pack;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class welcomeServlet
 */
//@WebServlet("/welcomeServlet")
public class welcomeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("Text/HTML");
		PrintWriter out=response.getWriter();
		out.println("<h1 style='color:blue;text-align:center'>this is good</h1>");
		out.println("<h1 style='color:blue;text-align:center;'>Successfully  Registered!!!</h1> ");
	}


	}


