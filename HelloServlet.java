import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,
ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.print("<h2>Hello-Nithish</h2>");
}
}
