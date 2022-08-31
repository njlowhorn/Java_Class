
package chapteroneexercise;

public class ChapterOneExercise {

    
    public static void main(String[] args) {
        /* All the numbers for the formulas */
        double four = 4.0;
        
        double firstNumber = 1.0;
        double secondNumber = 1f/3;
        double thirdNumber = 1f/5;
        double fourthNumber = 1f/7;
        double fifthNumber = 1f/9;
        double sixthNumber = 1f/11;
        double seventhNumber = 1f/13;
        
        /* Computes the formulas */
        double firstPi = four * (firstNumber-secondNumber+thirdNumber-fourthNumber+fifthNumber-sixthNumber);
        double secondPi = four * (firstNumber-secondNumber+thirdNumber-fourthNumber+fifthNumber-sixthNumber+seventhNumber);
        
        /* Prints the results */
        System.out.println(firstPi);
        System.out.println(secondPi);
    }
    
}
