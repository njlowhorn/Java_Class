
package semesterproject;

import java.util.ArrayList;

/**
 * Class for the users
 * @author Nolan Lowhorn
 */
public class User {
    private String username;
    private String password;
    private ArrayList<ArrayList<Integer>> listOfRatings;

    /**
     * Default constructor
     */
    public User() {
    }//end constructor

    /**
     * Constructor with all of the information
     * @param username String - The username of the account
     * @param password String - The password of the account
     * @param listOfRatings ArrayList&lt;ArrayList&lt;Integer&gt;&gt; - The rating and the ID for each media rated
     */
    public User(String username, String password, ArrayList<ArrayList<Integer>> listOfRatings) {
        this.username = username;
        this.password = password;
        this.listOfRatings = listOfRatings;
    }//end constructor

    /**
     * Method that returns the username of the account
     * @return String - The username of the account
     */
    public String getUsername() {
        return username;
    }//end getUsername

    /**
     * Method that changes the username of the account
     * @param username String - The username of the account
     */
    public void setUsername(String username) {
        this.username = username;
    }//end setUsername

    /**
     * Method that returns the password of the account
     * @return String - The password of the account
     */
    public String getPassword() {
        return password;
    }//end getPassword

    /**
     * Method that changes the password of the account
     * @param password String - The password of the account
     */
    public void setPassword(String password) {
        this.password = password;
    }//end setPassword

    /**
     * Method that returns the rating and the ID for each media rated
     * @return ArrayList&lt;ArrayList&lt;Integer&gt;&gt; - The rating and the ID for each media rated
     */
    public ArrayList<ArrayList<Integer>> getListOfRatings() {
        return listOfRatings;
    }//end getListOfRatings

    /**
     * Method that changes the rating and the ID for each media rated
     * @param listOfRatings ArrayList&lt;ArrayList&lt;Integer&gt;&gt; - The rating and the ID for each media rated
     */
    public void setListOfRatings(ArrayList<ArrayList<Integer>> listOfRatings) {
        this.listOfRatings = listOfRatings;
    }//end setListOfRatings
    
}//end User class
