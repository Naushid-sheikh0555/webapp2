import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

public class FooterServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            PrintWriter out = res.getWriter();
            res.setContentType("text/html");
            out.println("    <footer>");
            out.println("        <h3>Created By Steve</h3>");
            out.println("    </footer>");
            out.println("</body>");
            out.println("</html>");

        } catch (Exception e) {

        }
    }
}
