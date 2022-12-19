<%-- 
    Document   : media
    Created on : Oct 17, 2022, 2:50:14 PM
    Author     : nolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="semesterproject.SessionProcess, semesterproject.Film, semesterproject.Album, semesterproject.VideoGame, 
        semesterproject.Book"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Media</title>
        <link rel="stylesheet" href="styles.css">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
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

                    sp.getFieldsFromDatabase(request, session, film, fieldsFilm);
                }//end if

            %>
            <p><%= film.getTitle() %><br>
            Average Rating: <%= film.getAverageRating() %><br>
            Total Ratings: <%= film.getTotalRatings() %><br>
            <%= film.getCreator() %><br>
            <%= film.getReleaseYear() %><br>
            <%= film.getCoverImage() %><br>
            <%= film.getTimeLength() %> minutes<br>
            </p>
        </div>
        
        
        <div id="album">
            <% 
                Album album = new Album();
                
                if(mediaType.equals("album")){
                    String[] fieldsAlbum = {"CoverArt", "Artist", "ReleaseYear", "Songs", "Title"};

                    sp.getFieldsFromDatabase(request, session, album, fieldsAlbum);
                }//end if
               
                
            %>
            <p><%= album.getTitle() %><br>
            Average Rating: <%= album.getAverageRating() %><br>
            Total Ratings: <%= album.getTotalRatings() %><br>
            <%= album.getCreator() %><br>
            <%= album.getReleaseYear() %><br>
            <%= album.getCoverImage() %><br>
            <%= album.getSongs() %><br>
            </p>
        </div>
        
        <div id="videogame">
            <% 
                VideoGame videoGame = new VideoGame();
                
                if(mediaType.equals("videogame")){
                    String[] fieldsVideoGame = {"CoverArt", "Developer", "ReleaseYear", "Title"};

                    sp.getFieldsFromDatabase(request, session, videoGame, fieldsVideoGame);
                }//end if
                
                
            %>
            <p><%= videoGame.getTitle() %><br>
            Average Rating: <%= videoGame.getAverageRating() %><br>
            Total Ratings: <%= videoGame.getTotalRatings() %><br>
            <%= videoGame.getCreator() %><br>
            <%= videoGame.getReleaseYear() %><br>
            <%= videoGame.getCoverImage() %><br>
        </div>
        
        <div id="book">
            <% 
                Book book = new Book();
                
                if(mediaType.equals("book")){
                    String[] fieldsBook = {"CoverArt", "Author", "ReleaseYear", "Title"};

                    sp.getFieldsFromDatabase(request, session, book, fieldsBook);
                }//end if
                
                
            %>
            <p><%= book.getTitle() %><br>
            Average Rating: <%= book.getAverageRating() %><br>
            Total Ratings: <%= book.getTotalRatings() %><br>
            <%= book.getCreator() %><br>
            <%= book.getReleaseYear() %><br>
            <%= book.getCoverImage() %><br>
        </div>
        
        <%
            
            String[] rowsChecked = sp.getRatings(session);
        %>
        <div class="stars">
            <form action="rate.jsp" method="post">
                <input class="star star-5" id="star-5" type="radio" name="star" value="5" <%= rowsChecked[4] %>>
                <label class="star star-5" for="star-5"></label>
                <input class="star star-4" id="star-4" type="radio" name="star" value="4" <%= rowsChecked[3] %>>
                <label class="star star-4" for="star-4"></label>
                <input class="star star-3" id="star-3" type="radio" name="star" value="3" <%= rowsChecked[2] %>>
                <label class="star star-3" for="star-3"></label>
                <input class="star star-2" id="star-2" type="radio" name="star" value="2" <%= rowsChecked[1] %>>
                <label class="star star-2" for="star-2"></label>
                <input class="star star-1" id="star-1" type="radio" name="star" value="1" <%= rowsChecked[0] %>>
                <label class="star star-1" for="star-1"></label>
                <input type="submit" name="confirmRating" value="Confirm Rating">
            </form>
        </div>
    </body>
</html>
