
package guessingcapitalsmap;

import java.util.HashMap;
import java.util.Map;

public class GuessingCapitalsMap {

    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        
        CapitalsGameMap cgm = new CapitalsGameMap(capitals);
        
        cgm.addAllCapitals();
        cgm.playGame();
    }//end main
    
}//end GuessingCapitalsMap class
