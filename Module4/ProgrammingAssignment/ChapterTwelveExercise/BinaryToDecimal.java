
package binaryexception;

/**
 * A class that has a method for converting a string of binary to a decimal number
 * @author Nolan Lowhorn
 */
public class BinaryToDecimal {

    /**
     * Default constructor
     */
    public BinaryToDecimal() {
    }//end constructor
    
    
    /**
     * Method that checks if a each character in a string represents a binary; if it does, the method converts the string into a decimal number 
     * @param binaryString String - A string of binary
     * @return double - A decimal number
     */
    public double bin2Dec (String binaryString){
        char[] binaryArray = binaryString.toCharArray();
        for(int i = 0; i < binaryArray.length; i++){
            if(binaryArray[i] != '0' && binaryArray[i] != '1'){
                throw new BinaryFormatException(binaryString);
            }//end if
        }//end for
        return (double)(Integer.parseInt(binaryString, 2));
    }//end bin2Dec method
}//end BinaryToDecimal class
