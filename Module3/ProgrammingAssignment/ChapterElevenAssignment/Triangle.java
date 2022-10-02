package geometricshape;

/**
 * Child class about triangles
 * @author Nolan Lowhorn
 */
public class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /**
     * Default constructor
     */
    public Triangle() {
    }//end Triangle empty constructor
    
    /**
     * Constructor for creating a new triangle with all of the information
     * @param color String - Color of triangle
     * @param filled boolean - If the triangle is filled or not
     * @param side1 double - Length of the first side
     * @param side2 double - Length of the second side
     * @param side3 double - Length of the third side
     */
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }//end Triangle constructor

    /**
     * Method that gets the first side
     * @return double - first side of the triangle
     */
    public double getSide1() {
        return side1;
    }//end getSide1
    
    /**
     * Method that gets the second side
     * @return double - second side of the triangle
     */
    public double getSide2() {
        return side2;
    }//end getSide2

    /**
     * Method that gets the third side
     * @return double - third side of the triangle
     */
    public double getSide3() {
        return side3;
    }//end getSide3
    
    /**
     * Method that calculates the area of the triangle
     * @return double - Area of triangle
     */
    public double getArea(){
        double area;
        double s = 0.5 * (this.side1 + this.side2 + this.side3);
        area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
        return area;
    }//end getArea
    
    /**
     * Method that calculates the perimeter of the triangle
     * @return double - Perimeter of triangle
     */
    public double getPerimeter(){
    return side1 + side2 + side3;
    }//end getPerimeter

    /**
     * Override method that displays the length of each side of the triangle
     * @return String - Length of each side of the triangle
     */
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + 
               " side2 = " + side2 +
               " side3 = " + side3;
    }//emd toString
    
    
}//end Triangle class
