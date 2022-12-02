package guessingcapitals;

import java.util.LinkedList;

public class GuessingCapitals {

    public static void main(String[] args) {
        LinkedList<LinkedList<String>> capitals = new LinkedList<>();
        
        CapitalsGame cg = new CapitalsGame(capitals);
        
        cg.addAllCapitals();
        cg.playGame();
        
    }//end main
    
}//end GuessingCapitals class
