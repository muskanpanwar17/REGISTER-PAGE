package in.sp.backend;

import java.io.IOException;
import java.sql.*;

import in.sp.dbcon.Dbconnection;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/reset")
public class reset extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        HttpSession session = req.getSession();
        String pemail = (String) session.getAttribute("email1");
        String ppass =paawordencryptor.encrypt(req.getParameter("pass1"));

        try {
        	 Connection con = Dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE register SET password=? WHERE email=?");

            ps.setString(1, ppass);
            ps.setString(2, pemail);

            int count = ps.executeUpdate();

            resp.setContentType("text/html");
            if(count > 0){
                resp.getWriter().println("<h3>Password Updated Successfully! Login Now.</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
                rd.include(req, resp);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}