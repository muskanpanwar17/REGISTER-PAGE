package in.sp.backend;

import java.io.IOException;
import java.util.Random;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/sendOtp")
public class SendOtp extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String pemail = req.getParameter("email1");

        int otp = new Random().nextInt(900000) + 100000;   // 6 digit OTP

        HttpSession session = req.getSession();
        session.setAttribute("otp", otp);
        session.setAttribute("email", pemail);

        // -------- Fake email simulation (No SMTP setup) --------
        // For display purpose only
        resp.setContentType("text/html");
        resp.getWriter().println("<h3>OTP SENT TO EMAIL: " + otp + "</h3>");
        RequestDispatcher rd = req.getRequestDispatcher("verifyOtp.jsp");
        rd.include(req, resp);
    }
}