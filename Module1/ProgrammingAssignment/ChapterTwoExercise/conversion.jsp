
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        
        <!-- Gets feet value, turns it into double, and converts it to meters -->
        <% String feet = request.getParameter("feet");
        double meters = Double.parseDouble(feet) * 0.305 ;%>
        
        <p> <%= feet %> feet is equivalent to <%= meters %> meters.</p>
        
    </body>
</html>
