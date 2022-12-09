
package smallestelementstream;

import java.util.*;

/**
 * Class that can find smallest element in a list
 * @author Nolan Lowhorn
 */
public class FindSmallestElement {

    /**
     * Default Constructor
     */
    public FindSmallestElement() {
    }//end constructor
    
    /**
     * Method that finds the minimum double in a list
     * @param list LinkedList&lt;Double&gt; - A list of doubles
     * @return double - The smallest element in the list
     */
    public double min(LinkedList<Double> list){
        return list.stream().min((a, b) -> a.compareTo(b)).get();
    }//end min
    
}//end FindSmallestElement class
