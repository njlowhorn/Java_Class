
package semesterproject;

/**
 * Class for the albums
 * @author Nolan Lowhorn
 */
public class Album extends Media{
    private String songs;

    /**
     * Default constructor
     */
    public Album() {
    }//end constructor

    /**
     * Constructor with all of the information
     * @param title String - The name of the album
     * @param creator String - The name of the artist
     * @param releaseYear int - The year the album was released
     * @param coverImage String - The title of the file that has the cover image
     * @param totalRatings int - The number of ratings for the album
     * @param averageRating double - The average rating of the album
     * @param songs String - The songs on the album
     */
    public Album(String title, String creator, int releaseYear, String coverImage, int totalRatings, double averageRating, String songs) {
        super(title, creator, releaseYear, coverImage, totalRatings, averageRating);
        this.songs = songs;
    }//end constructor

    /**
     * Method that returns the songs
     * @return String - The songs on the album
     */
    public String getSongs() {
        return songs;
    }//end getSongs

    /**
     * Method that changes the songs
     * @param songs String - The songs on the album
     */
    public void setSongs(String songs) {
        this.songs = songs;
    }//end setSongs 
}//end Album class
