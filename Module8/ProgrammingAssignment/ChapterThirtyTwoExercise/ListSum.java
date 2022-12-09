
package listsum;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


public class ListSum {


    public static void main(String[] args) {
        double[] list = new double[9000000];
        
        for(int i = 0; i < list.length; i++){
            list[i] = Math.random() * 100;
        }//end for
        
        double totalSum = parallelSum(list);
        
        System.out.println(totalSum);
    }//end main
    
    /**
     * Method that runs the tasks
     * @param list double[] - A list of doubles
     * @return double - The sum of the doubles
     */
    public static double parallelSum(double[] list){
        RecursiveTask<Double> mainTask = new SumTask(10000, list);
        ForkJoinPool fjp = new ForkJoinPool();
        return fjp.invoke(mainTask);
    }//end parallelSum
    
}//end ListSum class
