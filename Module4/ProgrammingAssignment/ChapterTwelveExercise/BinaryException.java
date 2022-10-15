
package binaryexception;

import java.util.Scanner;

public class BinaryException {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        
        System.out.print("Enter a binary number: ");
        String binary = keyboard.next();
        
        try{
            System.out.println(binaryToDecimal.bin2Dec(binary));
        }//end try
        catch(BinaryFormatException e){
            System.out.println(e.getMessage());
        }//end catch
    }//end main
}//end BinaryException class
