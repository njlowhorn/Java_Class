<%-- 
    Document   : verifylogin
    Created on : Nov 28, 2022, 7:27:35 PM
    Author     : nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
  import="semesterproject.User, semesterproject.SessionProcess"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verify</title>
    </head>
    <body>
        <%!
            SessionProcess sp = new SessionProcess();
        %>
        
        <% 
            
            User user = new User();
            String[] status = sp.verifyLogIn(request, session, user);

        %>
        
        <form  method="post" action=<%=status[2]%>>
            <p><%=status[0]%><br>
            <input type="submit" name="verify" value=<%=status[1]%>></p>
        </form>
    </body>
</html>
