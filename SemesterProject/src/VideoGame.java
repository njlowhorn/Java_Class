
package semesterproject;

/**
 * Class for the video games
 * @author Nolan Lowhorn
 */
public class VideoGame extends Media{

    /**
     * Default constructor
     */
    public VideoGame() {
    }//end constructor

    /**
     * Constructor with all of the information
     * @param title String - The name of the video game
     * @param creator String - The name of the developer
     * @param releaseYear int - The year the video game was released
     * @param coverImage String - The title of the file that has the cover image
     * @param totalRatings int - The number of ratings for the video game
     * @param averageRating double - The average rating of the video game
     */
    public VideoGame(String title, String creator, int releaseYear, String coverImage, int totalRatings, double averageRating) {
        super(title, creator, releaseYear, coverImage, totalRatings, averageRating);
    }//end constructor
    
}//end VideoGame class
