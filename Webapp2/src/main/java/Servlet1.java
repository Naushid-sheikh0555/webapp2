import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            PrintWriter out = res.getWriter();
            res.setContentType("text/html");
            RequestDispatcher rd = req.getRequestDispatcher("/header");
            rd.include(req, res);
            out.println("<hr>");
            out.println("<h2>");
            out.println("Main Cotent goes here....");
            out.println("</h2>");
            out.println("<hr>");
            rd = req.getRequestDispatcher("/footer");
            rd.include(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
