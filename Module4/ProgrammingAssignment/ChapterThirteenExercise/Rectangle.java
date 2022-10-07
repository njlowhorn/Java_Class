package geometricshape;

/**
 * A child class about rectangles
 * @author Nolan Lowhorn
 */
public class Rectangle extends GeometricObject implements Comparable{
    private double width;
    private double height;

    /**
     * Default constructor
     */
    public Rectangle() {
    }// end default constructor

    /**
     * Constructor for width and height of a rectangle
     * @param width double - Length of the bottom and top sides of the rectangle
     * @param height double - Length of the left and right sides of the rectangle
     */
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }//end constructor

    /**
     * Constructor for dimensions and color of a rectangle and if it is filled
     * @param width double - Length of the bottom and top sides of the rectangle
     * @param height double - Length of the left and right sides of the rectangle
     * @param color String - Color of the rectangle
     * @param filled boolean - If the rectangle is filled in
     */
    public Rectangle(
        double width, double height, String color, boolean filled) {
      this.width = width;
      this.height = height;
      setColor(color);
      setFilled(filled);
    }//end constructor

    /**
     * Method that returns width of rectangle
     * @return double - Length of the bottom and top sides of the rectangle
     */
    public double getWidth() {
      return width;
    }//end getWidth

    /**
     * Method that changes width of rectangle
     * @param width double - Length of the bottom and top sides of the rectangle
     */
    public void setWidth(double width) {
      this.width = width;
    }//end setWidth

    /**
     * Method that returns height of rectangle
     * @return double - Length of the left and right sides of the rectangle 
     */
    public double getHeight() {
      return height;
    }//end getHeight

    /**
     * Method that changes height of rectangle
     * @param height double - Length of the left and right sides of the rectangle 
     */
    public void setHeight(double height) {
      this.height = height;
    }//end setHeight

    /**
     * Method that returns area of rectangle
     * @return double - Width multiplied by height
     */
    public double getArea() {
      return width * height;
    }//end getArea

    /**
     * Method that returns perimeter of rectangle
     * @return double - All sides added together
     */
    public double getPerimeter() {
      return 2 * (width + height);
    }//end getPerimeter

    /**
     * Override method that gets the difference in area between two rectangles
     * @param o Object - Rectangle that will be compared to
     * @return int - Difference in areas between the rectangles
     */
    @Override
    public int compareTo(Object o) {
        Rectangle r2 = (Rectangle)o;
        int areaOne = (int)this.getArea();
        int areaTwo = (int)r2.getArea();
        return (areaTwo - areaOne);
    }//end compareTo
    
    /**
     * Override method that checks to see if two rectangle areas are the same
     * @param obj Object - Rectangle that will be compared to 
     * @return boolean - Uses compareTo method; if the returned integer is 0, then they are the same; if the returned integer isn't 0, then they are not the same
     */
    @Override
    public boolean equals(Object obj) {
        Rectangle r2 = (Rectangle)obj;
        if(this.compareTo(r2) == 0){
            return true;
        }//end if
        else{
            return false;
        }//end else
    }//end equals

    

    
}//end Rectangle class
