
package salarydatabase;

/**
 * Class with the data fields of the Salary class
 * @author Nolan Lowhorn
 */
public class Record {
    private String firstName;
    private String lastName;
    private String rank;
    private double salary;

    /**
     * Default constructor
     */
    public Record() {
    }//end constructor

    /**
     * Constructor with all of the information
     * @param firstName String - First name of employee
     * @param lastName String - Last name of employee
     * @param rank String - Official occupation of employee
     * @param salary double - Annual salary for employee
     */
    public Record(String firstName, String lastName, String rank, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.salary = salary;
    }//end constructor

    /**
     * Method that gets the first name of the employee
     * @return String - First name of the employee
     */
    public String getFirstName() {
        return firstName;
    }//end getFirstName

    /**
     * Method that changes the first name of the employee
     * @param firstName String - First name of the employee
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//end setFirstName

    /**
     * Method that gets the last name of the employee
     * @return String - Last name of the employee
     */
    public String getLastName() {
        return lastName;
    }//end getLastName

    /**
     * Method that changes the last name of the employee
     * @param lastName String - Last name of the employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//end setLastName

    /**
     * Method that gets the official occupation of the employee
     * @return String - Official occupation of the employee
     */
    public String getRank() {
        return rank;
    }//end getRank

    /**
     * Method that changes the official occupation of the employee
     * @param rank String - Official occupation of the employee
     */
    public void setRank(String rank) {
        this.rank = rank;
    }//end setRank 

    /**
     * Method that gets the annual salary of the employee
     * @return String - Annual salary of the employee
     */
    public double getSalary() {
        return salary;
    }//end getSalary

    /**
     * Method that changes the annual salary of the employee
     * @param salary String - Annual salary of the employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }//end setSalary
    
    
    
    
}//end Record class
