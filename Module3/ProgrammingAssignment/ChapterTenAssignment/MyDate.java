package date;

import java.util.GregorianCalendar;

/**
 * A class for getting the date
 * @author Nolan Lowhorn
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    
    GregorianCalendar calendar = new GregorianCalendar();

    /**
     * Constructor that gets the current date
     */
    public MyDate() {
        this.year = GregorianCalendar.YEAR;
        this.month = GregorianCalendar.MONTH;
        this.day = GregorianCalendar.DAY_OF_MONTH;
    }//end MyDate no-arg constructor
    
    /**
     * Constructor that gets the time elapsed since January 1 1970
     * @param timeElapsed long - Time in milliseconds
     */
    public MyDate(long timeElapsed) {
        calendar.clear();
        calendar.setTimeInMillis(timeElapsed);
        
        this.year = GregorianCalendar.YEAR;
        this.month = GregorianCalendar.MONTH;
        this.day = GregorianCalendar.DAY_OF_MONTH;
    }//end MyDate timeElapsed constructor
    
    /**
     * Constructor that sets the date
     * @param year int - The specified year
     * @param month int - The specified month, starts with 0
     * @param day int - The specified day of the month
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }//end MyDate constructor

    /**
     * Method that gets the year
     * @return int - The specified year
     */
    public int getYear() {
        return year;
    }//end getYear

    /**
     * Method that gets the month
     * @return int - The specified month
     */
    public int getMonth() {
        return month;
    }//end getMonth

    /**
     * Method that gets the day of the month
     * @return int - The specified day of the month
     */
    public int getDay() {
        return day;
    }//end getDay
    
    /**
     * Method that sets the date based on elapsed time since January 1 1970
     * @param elapsedTime long - Time in milliseconds
     */
    public void setDate(long elapsedTime){
        this.calendar.setTimeInMillis(elapsedTime);
        
        //this.year = calendar.YEAR;
        //this.month = GregorianCalendar.MONTH;
        //this.day = GregorianCalendar.DAY_OF_MONTH;
    }//end setDate

    /**
     * Override method that displays the date
     * @return String - The year, month, and day of the month
     */
    @Override
    public String toString() {
        String date = calendar.get(this.year) + " ";
        date += calendar.get(this.month) + " "; 
        date += calendar.get(this.day);
        return date;
    }//end toString
    
    
    
}//end MyDate class
