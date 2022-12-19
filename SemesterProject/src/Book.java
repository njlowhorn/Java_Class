
package semesterproject;

/**
 * Class for the books
 * @author Nolan Lowhorn
 */
public class Book extends Media{

    /**
     * Default constructor 
     */
    public Book() {
    }//end constructor

    /**
     * Constructor with all of the information
     * @param title String - The name of the book
     * @param creator String - The name of the author
     * @param releaseYear int - The year the book was released
     * @param coverImage String - The title of the file that has the cover image
     * @param totalRatings int - The number of ratings for the book
     * @param averageRating double - The average rating of the book
     */
    public Book(String title, String creator, int releaseYear, String coverImage, int totalRatings, double averageRating) {
        super(title, creator, releaseYear, coverImage, totalRatings, averageRating);
    }//end constructor
   
    
    
}//end Book class
