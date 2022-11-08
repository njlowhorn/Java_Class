<%-- 
    Document   : index
    Created on : Nov 6, 2022, 10:46:22 AM
    Author     : Nolan Lowhorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <form action="populate.jsp">
            <p>Employee: <br>
            First Name: <input type="String" name="firstName"> <br>
            Last Name: <input type="String" name="lastName"><br> 
            Rank: <input type="String" name="rank"> <br>
            Salary: <input type="double" name="salary"> <br> 
            <input type="submit" name="populate" value="Populate"></p>
        </form>
    </body>
</html>
