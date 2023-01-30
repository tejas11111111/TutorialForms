package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondProgram extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse rep) throws ServletException, IOException {
		
		System.out.println("Generic Servlet");
		rep.setContentType("text/html");
		PrintWriter out = rep.getWriter();
		out.println("Date= "+new Date().toString());
		// TODO Auto-generated method stub
		
	}

}
