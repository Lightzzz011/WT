import java.io.*;
import javax.servlet.*;
public class MyGenericServlet extends GenericServlet
{
public void service(ServletRequest req, ServletResponse res) throws IOException,
ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.print("<h2>Welcome-to-Web-Technologies-Lab</h2>");
}
}