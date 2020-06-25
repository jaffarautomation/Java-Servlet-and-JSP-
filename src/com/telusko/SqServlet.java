package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SqServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		
		HttpSession m  = req.getSession();
		int i =(int)m.getAttribute("c");
		
		
		//Below code is for send direct request code 
	//	int i =Integer.parseInt(req.getParameter("c"));
		
	//	Below code is for request dispatcher
	//int i=	(int)req.getAttribute("c");
	
	int v =i*i;
		PrintWriter t =res.getWriter();
            t.print("Square is " +v);	
 	
		
		System.out.println("dv");
	}           

}
