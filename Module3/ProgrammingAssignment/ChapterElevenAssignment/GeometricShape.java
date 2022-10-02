package geometricshape;

import java.util.Scanner;

public class GeometricShape {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What are the lengths of the three sides of the trinagle? ");
        double[] sideArray = new double[3];
        for(int i = 0; i < sideArray.length; i++){
            sideArray[i] = keyboard.nextDouble();
        }//end for
        
        System.out.print("What color is it? ");
        String color = keyboard.next();
        
        System.out.print("The triangle is filled: true or false? ");
        boolean filled = keyboard.hasNextBoolean();
        
        Triangle triangle = new Triangle(color, filled, sideArray[0], sideArray[1], sideArray[2]);
        
        System.out.println("Area: " + triangle.getArea() + 
                           "\nPerimeter: " + triangle.getPerimeter() +
                           "\nColor: " + color + 
                           "\nFilled: " + filled);
    }//end main
    
}//end GeometricShape class
