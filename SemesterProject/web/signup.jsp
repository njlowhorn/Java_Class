<%-- 
    Document   : signup
    Created on : Oct 17, 2022, 2:13:41 PM
    Author     : nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup</title>
    </head>
    <body>
        <form action="login.jsp" method="post">
            <p>Username:<input type="String" name="newUsername" required minlength="5" maxlength="25"><br>
            Password:<input type="password" name="newPassword" required minlength="5" maxlength="25"><br>
            <input type="submit" name="createaccount" value="Create Account"></p>
        </form>
    </body>
</html>
