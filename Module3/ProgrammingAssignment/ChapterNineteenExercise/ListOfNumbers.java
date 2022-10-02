
package maximum;

import java.util.Arrays;

/**
 * Class that creates an array of 10 integers
 * @author Nolan Lowhorn
 */
public class ListOfNumbers {
    private Integer[] listOfNumbers = new Integer[10];
    
    /**
     * Default constructor
     */
    public ListOfNumbers() {
    }//end default constructor

    /**
     * Method that gets the array
     * @return Integer[] - Array of integers
     */
    public Integer[] getListOfNumbers() {
        return listOfNumbers;
    }//end getListOfNumbers

    /**
     * Method that sets the integer within an array
     * @param indexOfInteger int - Index of the integer
     * @param integer int - The integer within the array that is changed
     */
    public void setListOfNumbersInteger(int indexOfInteger, int integer) {
        listOfNumbers[indexOfInteger] = integer;
    }//end setListOfNumbersInteger
    
    /**
     * Method that gets the maximum number
     * @param <E> E - Any element
     * @param list - Any array of elements
     * @return E - Maximum value of array
     */
    public static <E extends Comparable<E>> E max(E[] list){
        Arrays.sort(list);
        E maximumNumber = list[9];
        return maximumNumber;
    }//end max
}//end ListOfNumber class
