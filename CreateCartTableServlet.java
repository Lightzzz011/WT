import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;

//@WebServlet("/create-cart-table")
public class CreateCartTableServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Connect to Oracle DB
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");

            // Create SQL statement
            Statement stmt = con.createStatement();

            // Drop table if exists (optional)
            try {
                stmt.executeUpdate("DROP TABLE cart_page");
                out.println("Existing table 'cart_page' dropped.<br>");
            } catch (SQLException e) {
                out.println("Drop failed (maybe table doesn't exist): " + e.getMessage() + "<br>");
            }

            // Create table
            String sql = "CREATE TABLE cart_page (" +
                         "name VARCHAR2(20), " +
                         "price NUMBER(10,2), " +
                         "quantity NUMBER(5), " +
                         "amount NUMBER(12,2))";

            stmt.executeUpdate(sql);
            out.println("Table 'cart_page' created successfully.");
            out.println("<a href='index.html'>Home</a>");

            stmt.close();
            con.close();

        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}
