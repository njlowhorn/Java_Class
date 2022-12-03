package guessingcapitalsmap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 * Class for playing a game to guess all of the state's capitals
 * @author Nolan Lowhorn
 */
public class CapitalsGameMap {
    private Map<String, String> capitals;

    /**
     * Default constructor
     */
    public CapitalsGameMap() {
    }//end constructor

    /**
     * Constructor with the states and capitals
     * @param capitals Map&lt;String, String&gt; - the states and their respective capitals
     */
    public CapitalsGameMap(Map<String, String> capitals) {
        this.capitals = capitals;
    }//end constructor

    /**
     * Method that returns the states and their respective capitals
     * @return Map&lt;String, String&gt; - the states and their respective capitals
     */
    public Map<String, String> getCapitals() {
        return capitals;
    }//end getCapitals

    /**
     * Method that changes the states and their respective capitals
     * @param capitals Map&lt;String, String&gt; - the states and their respective capitals
     */
    public void setCapitals(Map<String, String> capitals) {
        this.capitals = capitals;
    }//end setCapitals
    
    /**
     * Method that plays the game for guessing each state's capital
     */
    public void playGame(){
        Scanner keyboard = new Scanner(System.in);
        int totalCorrect = 0;
        for(Map.Entry<String, String> i: capitals.entrySet()){
            System.out.print("What is the capital of " + i.getKey() + ": ");
            String guess = keyboard.nextLine();
            if(guess.equals(i.getValue())){
                totalCorrect += 1;
            }//end if 
        }//end for
        System.out.println("Total correct: " + totalCorrect);  
    }//end playGame
    
    /**
     * Method that adds all of the states and their capitals to the list
     */
    public void addAllCapitals(){
        String[][] allCapitals = {{"Alabama", "Montgomery"}, {"Alaska",  "Juneau"}, {"Arizona", "Phoenix"},
                                  {"Arkansas", "Little Rock"}, {"California", "Sacramento"}, {"Colorado", "Denver"},
                                  {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                                  {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                                  {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"},
                                  {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"}, {"Louisiana", "Baton Rouge"},
                                  {"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                                  {"Michigan", "Lansing"}, {"Minnesota", "St. Paul"}, {"Mississippi", "Jackson"},
                                  {"Missouri", "Jefferson City"}, {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                                  {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"},
                                  {"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                                  {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"},
                                  {"Oregon", "Salem"}, {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                                  {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"},
                                  {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                                  {"Wisconsin", "Madison"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"},
                                  {"Virginia", "Richmond"}, {"Wyoming", "Cheyenne"}};
        for(String[] stateArray: allCapitals){
            capitals.put(stateArray[0], stateArray[1]);
        }//end for
    }//end addAllCapitals
    
    
}//end CapitalsGame class
