
package ascii;


public class ASCII {

    
    public static void main(String[] args) {
        String asciiList = " ! \" # $ % & ' ( ) * "
                         + "+ , - . / 0 1 2 3 4 "
                         + "5 6 7 8 9 : ; < = > "
                         + "? @ A B C D E F G H "
                         + "I J K L M N O P Q R "
                         + "S T U V W X Y Z [ \\ "
                         + "] ^ - ' a b c d e f "
                         + "g h i j k l m n o p "
                         + "q r s t u v w x y z "
                         + "{ | } ~ ";
        
        // Prints each character
        for (int i = 1; i < 189; i++){
            System.out.print(asciiList.charAt(i));
            // Prints new line after each 10 characters
            if (i % 20 == 0 && i != 0){
                System.out.println(" ");
            }
        }
    }
    
}
