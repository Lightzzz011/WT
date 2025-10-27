import java.io.*; 
import javax.servlet.*; 
public class OurSrv extends GenericServlet 
{ 
  public void service(ServletRequest req, ServletResponse resp) throws IOException,       
       ServletException 
 { 
   System.out.println("service of OurSrv.."); 
   resp.setContentType("text/plain");//setting the content type   
   PrintWriter out=resp.getWriter();//get the stream to write the data   
   out.print("Hello Servlet World! Thank u.."); 
  } 
} 