package com.telusko;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Java_DataBaseDemo extends HttpServlet {
	
	
	public void doGet(HttpServletRequest r , HttpServletResponse e) throws IOException, ServletException
	{
	
		
		 int Student_ID = Integer.parseInt(r.getParameter("StudentID"));
		   String Student_Name = r.getParameter("StudentName");
		   int Student_RollNo = Integer.parseInt(r.getParameter("StudentRollNo"));
		   
		   System.out.println(Student_ID + Student_Name+Student_RollNo);
		   
		   
		   
		   String URL = "jdbc:mysql://localhost:3306/student";
			String Username = "root";
			String Password = "jaffar786";
			String query2 = "select * from student_information";
			String query3 = "insert into student_information (Student_ID, Student_Name, Student_RollNo) values ('"+Student_ID+"', '"+Student_Name+"', '"+Student_RollNo+"');";
			Statement st = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Connection con = null;
			try {
				con = DriverManager.getConnection(URL, Username, Password);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				 st = con.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				int rs = st.executeUpdate(query3);
				if (rs==1)
				{
					e.sendRedirect("Success.html");
				}
					
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				//e.sendRedirect("Error.html");
				e1.printStackTrace();
			}

	
			
	}

}
