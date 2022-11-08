<%-- 
    Document   : populate
    Created on : Nov 6, 2022, 11:11:14 AM
    Author     : Nolan Lowhorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="salarydatabaseweb.DatabaseConnector"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Populate</title>
    </head>
    <body>
        
        <%! 
            private String url = "jdbc:mysql://localhost:3306/SDEV200";
            private String username = "root";
            private String password = "";
        %>
            
        <%
            DatabaseConnector db = new DatabaseConnector(url, username, password);
            
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String rank = request.getParameter("rank");
            double salary = Double.parseDouble(request.getParameter("salary"));
            
            String table = "Salary";
            String[] fields = {"firstName", "lastName", "rank", "salary"};
            Object[] values = {firstName, lastName, rank, salary};
            
            String status = db.addData(table, fields, values);
            
        %> 
        
        <p><%= status %></p>
    </body>
</html>
