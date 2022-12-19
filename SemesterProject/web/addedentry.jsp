<%-- 
    Document   : addedentry
    Created on : Dec 4, 2022, 1:51:24 PM
    Author     : nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="semesterproject.SessionProcess, semesterproject.Film, semesterproject.Album, semesterproject.VideoGame, 
        semesterproject.Book"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Added Entry</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body onload="mediaSelect()">
        
        <script src="mediaselect.js">
        </script>
        
        <%! 
            SessionProcess sp = new SessionProcess();
        %>
        
        <%
            String mediaType = sp.getMediaType(request, session);
        %>
        
        <input type="hidden" id="mediatype" value="<%=mediaType%>">

        <div id="film">
            <%
                Film film = new Film();
                
                
                if(mediaType.equals("film")){
                    String[] fieldsFilm = {"CoverArt", "Director", "ReleaseYear", "Length", "Title"};

                    sp.addEntryIntoDatabase(request, film, fieldsFilm);
                }//end if
                
            %>
            <form action="media.jsp" method="post">
                 <p>Entry was added. <br>
                 <input type="submit" name="continue" value="Continue">    
                 <input type="hidden" name="Title" value="<%= film.getTitle() %>"><br>
                 <input type="hidden" name="Director" value="<%= film.getCreator() %>"><br>
                 <input type="hidden" name="ReleaseYear" value="<%= film.getReleaseYear() %>"><br>
                 <input type="hidden" name="CoverArt" value="<%= film.getCoverImage() %>"><br>
                 <input type="hidden" name="Length" value="<%= film.getTimeLength() %>"><br>
                 <input type="hidden" name="mediatype" value="film">
            </form>
        </div>
                    
        <div id="album">
            <%
                Album album = new Album();
                
                if(mediaType.equals("album")){
                    String[] fieldsAlbum = {"CoverArt", "Artist", "ReleaseYear", "Songs", "Title"};

                    sp.addEntryIntoDatabase(request, album, fieldsAlbum);
                }//end if
                
            %>
            <p>
                <form action="media.jsp" method="post">
                    <p>Entry was added. <br>
                    <input type="submit" name="continue" value="Continue">    
                    <input type="hidden" name="Title" value="<%= album.getTitle() %>"><br>
                    <input type="hidden" name="Artist" value="<%= album.getCreator() %>"><br>
                    <input type="hidden" name="ReleaseYear" value="<%= album.getReleaseYear() %>"><br>
                    <input type="hidden" name="CoverArt" value="<%= album.getCoverImage() %>"><br>
                    <input type="hidden" name="Songs" value="<%= album.getSongs() %>"><br>
                    <input type="hidden" name="mediatype" value="album">
            </form>
            </p>
        </div>
                    
        <div id="videogame">
            <%
                VideoGame videoGame = new VideoGame();
                if(mediaType.equals("videogame")){
                    String[] fieldsVideoGame = {"CoverArt", "Developer", "ReleaseYear", "Title"};

                    sp.addEntryIntoDatabase(request, videoGame, fieldsVideoGame);
                }//end if
                
            %>
            <p>
                <form action="media.jsp" method="post">
                    <p>Entry was added. <br>
                    <input type="submit" name="continue" value="Continue">    
                    <input type="hidden" name="Title" value="<%= videoGame.getTitle() %>"><br>
                    <input type="hidden" name="Developer" value="<%= videoGame.getCreator() %>"><br>
                    <input type="hidden" name="ReleaseYear" value="<%= videoGame.getReleaseYear() %>"><br>
                    <input type="hidden" name="CoverArt" value="<%= videoGame.getCoverImage() %>"><br>
                    <input type="hidden" name="mediatype" value="videogame">
            </form>
            </p>
        </div>
                    
        <div id="book">
            <%
                Book book = new Book();
                if(mediaType.equals("book")){
                    String[] fieldsBook = {"CoverArt", "Author", "ReleaseYear", "Title"};

                    sp.addEntryIntoDatabase(request, book, fieldsBook);
                }//end if
                
            %>
            <p>
                <form action="media.jsp" method="post">
                    <p>Entry was added. <br>
                    <input type="submit" name="continue" value="Continue">    
                    <input type="hidden" name="Title" value="<%= book.getTitle() %>"><br>
                    <input type="hidden" name="Developer" value="<%= book.getCreator() %>"><br>
                    <input type="hidden" name="ReleaseYear" value="<%= book.getReleaseYear() %>"><br>
                    <input type="hidden" name="CoverArt" value="<%= book.getCoverImage() %>"><br>
                    <input type="hidden" name="mediatype" value="book">
            </form>
            </p>
        </div>        
    </body>
</html>

