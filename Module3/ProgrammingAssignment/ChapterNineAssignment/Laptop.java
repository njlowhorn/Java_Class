
package gamingcomputerbuild;

/**
 * A child class about laptop computers 
 * @author Nolan Lowhorn
 */
public class Laptop extends GamingComputer{
    private double weight;

    /**
     * Default constructor
     */
    public Laptop() {
    }//ends Laptop empty constructor

    /**
     * Constructor for getting the specifications of the computer
     * @param processor String - CPU of the computer
     * @param graphicsCard String - GPU of the computer
     * @param randomAccessMemory int - RAM in GB
     * @param storage int - Amount of space in GB
     * @param weight double - How much the laptop weighs in lbs
     */
    public Laptop(String processor, String graphicsCard, int randomAccessMemory, int storage, double weight) {
        super(processor, graphicsCard, randomAccessMemory, storage);
        this.weight = weight;
    }//ends Laptop constructor

    /**
     * Method that returns the weight of the laptop
     * @return double - Weight of laptop in lbs
     */
    public double getWeight() {
        return weight;
    }//ends getWeight

    /**
     * Method that changes the weight of the laptop
     * @param weight double - Weight of laptop in lbs
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }//ends setWeight
    
    
}//ends Laptop class
