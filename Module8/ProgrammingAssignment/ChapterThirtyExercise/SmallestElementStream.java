
package smallestelementstream;

import java.util.LinkedList;
import java.util.Scanner;

public class SmallestElementStream {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LinkedList<Double> list = new LinkedList<>();
        FindSmallestElement fse = new FindSmallestElement();
        
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            list.add(keyboard.nextDouble());
        }//end for
        
        double minValue = fse.min(list);
        
        System.out.println("The smallest number is " + minValue);
    }//end main
    
}//end SmallestElementStream class
