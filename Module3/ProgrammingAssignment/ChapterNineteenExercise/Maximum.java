package maximum;

import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i++){
            list.setListOfNumbersInteger(i, keyboard.nextInt());
        }//end for
        
        System.out.println("The largest number is " + list.max(list.getListOfNumbers()));
    }//end main
    
}//end Maximum class
