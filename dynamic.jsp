<html>
<body>
<%! int i=10; %>
<%! int j=20; %>
<h1> dynamic table</h1>
<table border="1">
<% 
for(int k=0;k<i;k++) {     %>
    <tr>        <%
        for(int m=0;m<j;m++) { %>
    <td>*</td>
<% } %>
</tr>
<%    }    %>
</body>
</html>