
package semesterproject;

/**
 * Class for the different media types
 * @author Nolan Lowhorn
 */
public abstract class Media {
    private String title;
    private String creator;
    private int releaseYear;
    private String coverImage;
    private int totalRatings;
    private double averageRating;

    /**
     * Default constructor
     */
    public Media() {
    }//end constructor

    /**
     * Constructor with all of the information
     * @param title String - The name of the media
     * @param creator String - The name of the creator of the media
     * @param releaseYear int - The year the media was released
     * @param coverImage String - The title of the file that has the cover image
     * @param totalRatings int - The number of ratings for the media
     * @param averageRating double - The average rating of the media
     */
    public Media(String title, String creator, int releaseYear, String coverImage, int totalRatings, double averageRating) {
        this.title = title;
        this.creator = creator;
        this.releaseYear = releaseYear;
        this.coverImage = coverImage;
        this.totalRatings = totalRatings;
        this.averageRating = averageRating;
    }//end constructor

    /**
     * Method that returns title of media
     * @return String - Name of media
     */
    public String getTitle() {
        return title;
    }//end getTitle

    /**
     * Method that changes title of media
     * @param title String - Name of media
     */
    public void setTitle(String title) {
        this.title = title;
    }//end setTitle

    /**
     * Method that returns the creator of the media
     * @return String - The creator of the media
     */
    public String getCreator() {
        return creator;
    }//end getCreator

    /**
     * Method that changes the creator of the media
     * @param creator String - The creator of the media
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }//end setCreator

    /**
     * Method that returns the year the media was released
     * @return int - The year the media was released
     */
    public int getReleaseYear() {
        return releaseYear;
    }//end getReleaseYear

    /**
     * Method that changes the year the media was released
     * @param releaseYear int - The year the media was released
     */
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }//end setReleaseYear

    /**
     * Method that returns the name of the cover image file
     * @return String - The name of the cover image file
     */
    public String getCoverImage() {
        return coverImage;
    }//end getCoverImage

    /**
     * Method that changes the name of the cover image file
     * @param coverImage String - The name of the cover image file
     */
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }//end setCoverImage

    /**
     * Method that returns the total number of ratings
     * @return int - Total number of ratings
     */
    public int getTotalRatings() {
        return totalRatings;
    }//end getTotalRatings

    /**
     * Method that changes the total number of ratings
     * @param totalRatings int - Total number of ratings
     */
    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }//end setTotalRatings

    /**
     * Method that returns the average rating
     * @return double - The averaging of all the ratings
     */
    public double getAverageRating() {
        return averageRating;
    }//end getAverageRating

    /**
     * Method that changes the average rating
     * @param averageRating double - The averaging of all the ratings
     */
    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }//end setAverageRating
    
}//end Media class
