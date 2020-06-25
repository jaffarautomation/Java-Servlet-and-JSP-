package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet

{
	
	public void doGet(HttpServletRequest r , HttpServletResponse e) throws IOException, ServletException
	{
		
		   int y = Integer.parseInt(r.getParameter("num1"));
		   int v = Integer.parseInt(r.getParameter("num2"));
		   
		   int c= y+v;
		   
		   //This below is for URL rewriting or send request
		 // x  e.sendRedirect("sq?c="+c);
		   
		   
		   //This code  is for to call the other servlet from the main servlet from
		   // request Dispatcher 
	/*	   
		  r.setAttribute("c", c);
		  
		  RequestDispatcher t =r.getRequestDispatcher("/sq");
		  t.forward(r, e);
		*/
		  
	 	   
		   //Below code is for HttpSessions request
		   
		   HttpSession m  = r.getSession();
		  m.setAttribute("c", c);
		  e.sendRedirect("sq");
		  
		  
	}
	

}
