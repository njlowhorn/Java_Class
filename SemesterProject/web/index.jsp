<%-- 
    Document   : index
    Created on : Oct 16, 2022, 4:53:41 PM
    Author     : nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="semesterproject.SessionProcess, semesterproject.Film"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        
        <%!
            SessionProcess sp = new SessionProcess();
        %>
        
        <form action="login.jsp" method="post">
            <p><input type="submit" name="login" value="Login"></p>
        </form>
        
        <form action="signup.jsp" method="post">
            <p><input type="submit" name="signup" value="Signup"></p>
        </form>
        
        <form action="addentry.jsp" method="post">
            <p>Can't find something? Add it here:
            <input type="submit" name="addentry" value="Add Entry"></p>
        </form>
        
        
        <p>Example: </p>
        <% 
            Film film = new Film();
            
            sp.example(film);
            
            
        %>
        <form action="media.jsp" method="post">
            <input type="submit" name="Title" value="The Dark Knight">
            <input type="hidden" name="Director" value="<%= film.getCreator() %>"><br>
            <input type="hidden" name="ReleaseYear" value="<%= film.getReleaseYear() %>"><br>
            <input type="hidden" name="CoverArt" value="<%= film.getCoverImage() %>"><br>
            <input type="hidden" name="Length" value="<%= film.getTimeLength() %>"><br>
            <input type="hidden" name="mediatype" value="film">
        </form>
        
    </body>
</html>
