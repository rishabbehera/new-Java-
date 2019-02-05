package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilter implements Filter
{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException 
	{
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int num1=Integer.parseInt(req.getParameter("name1"));
		int num2=Integer.parseInt(req.getParameter("name2"));
		if(num1<0 || num2<0)
		{
			pw.println("please enter +ve number");
		}
		else
		{
			System.out.println("Hello it is activated");
			chain.doFilter(req, res);
		}
		
		
	}

}
