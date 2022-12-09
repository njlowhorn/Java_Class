
package listsum;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

/**
 * Class that finds the sum of a list
 * @author Nolan Lowhorn
 */
public class SumTask extends RecursiveTask<Double>{
    private int threshold;
    private double[] list;

    /**
     * Default constructor
     */
    public SumTask() {
    }//end constructor

    /**
     * Constructor with all information
     * @param threshold int - Size of what the list will be split into
     * @param list double[] - List of doubles
     */
    public SumTask(int threshold, double[] list) {
        this.threshold = threshold;
        this.list = list;
    }//end constructor

    /**
     * Method that returns the size of what the list will be split into
     * @return int - Size of what the list will be split into
     */
    public int getThreshold() {
        return threshold;
    }//end getThreshold

    /**
     * Method that changes the size of what the list will be split into
     * @param threshold int - Size of what the list will be split into
     */
    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }//end setThreshold

    /**
     * Method that returns the list of doubles
     * @return double[] - List of doubles
     */
    public double[] getList() {
        return list;
    }//end getList

    /**
     * Method that changes the list of doubles
     * @param list double[] - List of doubles
     */
    public void setList(double[] list) {
        this.list = list;
    }//end setList
    
    /**
     * Method that finds the sum of a list
     * @param list double[] - A list of doubles
     * @return double - The sum of the doubles
     */
    public double findSum(double[] list){
        double sum = 0;
        for (double value : list) {
            sum += value;
        }//end for
        return sum;
    }//end findSum

    /**
     * Method that splits up the list into a specified number of parts, finds the sum of each, and calculates the total sum
     * @return Double - The total sum
     */
    @Override
    protected Double compute() {
        SumTask st = new SumTask();
        double totalSum = 0;
        if(list.length < threshold){
            totalSum = st.findSum(list);
        }//end if
        else{
            int splitNumber = list.length / threshold;
            for(int i = 0; i < splitNumber; i++){
                double[] splitList = Arrays.copyOfRange(list, i, (splitNumber * (i + 1)));
                totalSum += st.findSum(splitList);
            }//end for
        }//end else
        return totalSum;
    }//end compute
    
}//end SumTask class
