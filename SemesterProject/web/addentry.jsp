<%-- 
    Document   : addentry
    Created on : Oct 17, 2022, 2:36:01 PM
    Author     : nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Entry</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body onload="mediaSelect()">
        
        <script src='mediaselect.js'>
        </script>
        

        <p>Select which type: 
        <select name="mediatype" id="mediatype" onchange="mediaSelect()">
        <option value="selecttype">Please select a type</option>
        <option value="film">Film</option>
        <option value="album">Album</option>
        <option value="videogame">Video Game</option>
        <option value="book">Book</option>
        </select> </p>


        <div id="film">
            <form action="addedentry.jsp" method="post">
                <p>Film: <br>
                Title: <input type="String" name="Title" required><br>
                Director: <input type="String" name="Director"><br>
                Year Released: <input type="int" name="ReleaseYear"><br>
                Poster: <input type="file" name="CoverArt"><br>
                Running Time: <input type="int" name="Length"><br>
                <input type="submit" name="addfilm" value="Add Film">
                <input type="hidden" name="mediatype" value="film">
                </p>
            </form>
        </div>

        <div id="album">
            <form action="addedentry.jsp" method="post">
                <p>Album: <br>
                Title: <input type="String" name="Title" required><br>
                Artist: <input type="String" name="Artist"><br>
                Year Released: <input type="String" name="ReleaseYear"><br>
                Cover Art: <input type="file" name="CoverArt"><br>
                Songs: <input type="String" name="Songs"><br>
                <input type="submit" name="addalbum" value="Add Album">
                <input type="hidden" name="mediatype" value="album">
                </p>
            </form>
        </div>

        <div id="videogame">
            <form action="addedentry.jsp" method="post">
                <p>Video Game: <br>
                Title: <input type="String" name="Title" required><br>
                Developer: <input type="String" name="Developer"><br>
                Year Released: <input type="String" name="ReleaseYear"><br>
                Cover: <input type="file" name="CoverArt"><br>
                <input type="submit" name="addvideogame" value="Add Video Game">
                <input type="hidden" name="mediatype" value="videogame">
                </p>
            </form>
        </div>

        <div id="book">
            <form action="addedentry.jsp" method="post">
                <p>Book: <br>
                Title: <input type="String" name="Title" required><br>
                Author: <input type="String" name="Author"><br>
                Year Released: <input type="String" name="ReleaseYear"><br>
                Cover: <input type="file" name="CoverArt"><br>
                <input type="submit" name="addbook" value="Add Book">
                <input type="hidden" name="mediatype" value="book">
                </p>
            </form>
        </div>  
    </body>
</html>
