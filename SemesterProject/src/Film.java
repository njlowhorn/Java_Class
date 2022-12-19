
package semesterproject;

/**
 * Class for the films
 * @author Nolan Lowhorn
 */
public class Film extends Media{
    private int timeLength;

    /**
     * Default constructor
     */
    public Film() {
    }//end constrcutor 

    /**
     * Constructor with all of the information
     * @param title String - The name of the film
     * @param creator String - The name of the director of the film
     * @param releaseYear int - The year the film was released
     * @param coverImage String - The title of the file that has the cover image
     * @param totalRatings int - The number of ratings for the film
     * @param averageRating double - The average rating of the film
     * @param timeLength int - Length of the movie in minutes
     */
    public Film(String title, String creator, int releaseYear, String coverImage, int totalRatings, double averageRating, int timeLength) {
        super(title, creator, releaseYear, coverImage, totalRatings, averageRating);
        this.timeLength = timeLength;
    }//end constrcutor 

    /**
     * Method that returns the time of the movie in minutes
     * @return int - The time of the movie in minutes
     */
    public int getTimeLength() {
        return timeLength;
    }//end getTimeLength

    /**
     * Method that changes the time of the movie in minutes
     * @param timeLength int - The time of the movie in minutes
     */
    public void setTimeLength(int timeLength) {
        this.timeLength = timeLength;
    }//end setTimeLength
}//end Film class
