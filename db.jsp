<%@page import="java.sql.*" %>
<html>

<body>
<% 
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
Statement stmt=con.createStatement();
String str="select * from wtravi where firstname='pallam')";

ResultSet rs=stmt.executeQuery("select *from csee");
while(rs.next())
{
out.print(rs.getInt(1)+" "+rs.getString(2));
}
con.close();
%>
</body>
</html>