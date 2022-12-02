package guessingcapitals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Class for playing a game to guess all of the state's capitals
 * @author Nolan Lowhorn
 */
public class CapitalsGame {
    private LinkedList<LinkedList<String>> capitals;

    /**
     * Default constructor
     */
    public CapitalsGame() {
    }//end constructor

    /**
     * Constructor with the states and capitals
     * @param capitals LinkedList&lt;LinkedList&lt;String&gt;&gt; - the states and their respective capitals
     */
    public CapitalsGame(LinkedList<LinkedList<String>> capitals) {
        this.capitals = capitals;
    }//end constructor

    /**
     * Method that returns the states and their respective capitals
     * @return LinkedList&lt;LinkedList&lt;String&gt;&gt; - the states and their respective capitals
     */
    public LinkedList<LinkedList<String>> getCapitals() {
        return capitals;
    }//end getCapitals

    /**
     * Method that changes the states and their respective capitals
     * @param capitals LinkedList&lt;LinkedList&lt;String&gt;&gt; - the states and their respective capitals
     */
    public void setCapitals(LinkedList<LinkedList<String>> capitals) {
        this.capitals = capitals;
    }//end setCapitals
    
    /**
     * Method that plays the game for guessing each state's capital
     */
    public void playGame(){
        Scanner keyboard = new Scanner(System.in);
        int totalCorrect = 0;
        Collections.shuffle(capitals);
        for(int i = 0; i < capitals.size(); i++){
            System.out.print("What is the capital of " + capitals.get(i).get(0) + ": ");
            String guess = keyboard.nextLine();
            if(guess.equals(capitals.get(i).get(1))){
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
            LinkedList<String> stateList = new LinkedList<>();
            for(String stateAndCapital: stateArray){
                stateList.add(stateAndCapital);
            }//end for
            capitals.add(stateList);
        }//end for
    }//end addAllCapitals
    
    
}//end CapitalsGame class
