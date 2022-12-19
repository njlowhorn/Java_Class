<%-- 
    Document   : login
    Created on : Oct 17, 2022, 2:09:35 PM
    Author     : nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="semesterproject.SessionProcess"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <%! 
            SessionProcess sp = new SessionProcess();
        %>
        
        <%  
            
            sp.signUp(request);

        %>
        
        <form action="verifylogin.jsp" method="post">
            <p>Username: <input type="String" name="username"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" name="login" value="Login"></p>
        </form>
    </body>
</html>
