package in.sp.backend;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/verifyOtp")
public class VerifyOtp extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        int userOtp = Integer.parseInt(req.getParameter("otp"));
        HttpSession session = req.getSession();
        int realOtp = (int) session.getAttribute("otp");

        if(userOtp == realOtp) {
            RequestDispatcher rd = req.getRequestDispatcher("reset.jsp");
            rd.forward(req, resp);
        } else {
            resp.setContentType("text/html");
            resp.getWriter().println("<h3 style='color:red;'>Invalid OTP</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("verifyOtp.jsp");
            rd.include(req, resp);
        }
    }
}