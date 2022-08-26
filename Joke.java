
import java.util.*;

public class Joke{
    public static void main(String[] args){
        if(args.length > 0 && args[0].equals("knock knock")){
            System.out.print("Who's there? ");
            Scanner keyboard = new Scanner(System.in);
            String userInput = new String();
            userInput = keyboard.nextLine();
            System.out.println(userInput + " who?");
        }
        else{
            System.out.println("Go away...");
        }
    }
}