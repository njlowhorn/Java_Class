<%-- 
    Document   : rate
    Created on : Dec 7, 2022, 8:32:15 PM
    Author     : nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="semesterproject.SessionProcess"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%! 
            SessionProcess sp = new SessionProcess();
        %>
        
        <%
            
            String status = sp.processRatings(request, response, session);
        %>
        
        <%= status %>
    </body>
</html>
