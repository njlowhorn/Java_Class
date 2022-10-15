
package binaryexception;

/**
 * Exception class for checking if a string is a binary number
 * @author Nolan Lowhorn
 */
public class BinaryFormatException extends NumberFormatException{
    private String notBinaryString;
    
    /**
     * Default constructor
     */
    public BinaryFormatException() {
    }//end constructor

    /**
     * Constructor that displays the string is not a binary one
     * @param notBinaryString String - A string that is not binary numbers
     */
    public BinaryFormatException(String notBinaryString) {
        super(notBinaryString + " is not a binary number.");
        this.notBinaryString = notBinaryString;
    }//end constructor
}//end BinaryFormatException class
