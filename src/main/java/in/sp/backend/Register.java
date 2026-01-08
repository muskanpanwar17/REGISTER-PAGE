package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.sp.dbcon.Dbconnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regform")
public class Register extends HttpServlet
{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			PrintWriter out = resp.getWriter();
			 String pname =req.getParameter("name1");
			 String pemail =req.getParameter("email1");
			 String ppass =paawordencryptor.encrypt(req.getParameter("pass1"));
			 String pgen =req.getParameter("gen1");
			 String pcity =req.getParameter("city1");
			 
			 try 
			 {
				 Connection con = Dbconnection.getConnection();
				 PreparedStatement ps =con.prepareStatement("insert into register values(?,?,?,?,?)");
				 ps.setString(1, pname);
				 ps.setString(2, pemail);
				 ps.setString(3, ppass);
				 ps.setString(4, pgen);
				 ps.setString(5, pcity);
				 int count =ps.executeUpdate();
				 if(count>0)
				 {
					 resp.setContentType("text/html");
					 out.print("<h3  style='color:green'>USER REGISTERED SUCCESSFULLY</h3>");
					 RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
					 rd.include(req, resp);
					 
				 }
				 else {
					 resp.setContentType("text/html");
					 out.print("<h3 style='color:red'>USER NOT REGISTERED DUE TO SOME ERROR.</h3>");
					 RequestDispatcher rd=req.getRequestDispatcher("/reg.jsp");
					 rd.include(req, resp);
					 
				 }
				 
				
			}
			 catch (Exception e) 
			 {
				e.printStackTrace();
				
				resp.setContentType("text/html");
				 out.print("<h3 style='color:red'> EXCEPTION OCCURED: "+e.getMessage()+"</h3>");
				 RequestDispatcher rd=req.getRequestDispatcher("/reg.jsp");
				 rd.include(req, resp);
			}



		}
}
