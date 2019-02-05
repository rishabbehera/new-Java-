package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int num1=Integer.parseInt(req.getParameter("name1"));
		int num2=Integer.parseInt(req.getParameter("name2"));
		pw.println("The value of the num1"+num1);
		pw.println("The value of the num2"+num2);
		
	}

}
