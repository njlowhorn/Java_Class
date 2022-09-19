package employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Program that gets the number of hours worked each day in a week for each employee and outputs their total number of hours in the week
 * @author Nolan Lowhorn
 */
public class Employee {

    
    public static void main(String[] args) {
        Employee employeeObject = new Employee();
        Scanner keyboard = new Scanner(System.in);
        
        // Gets input for number of employees
        System.out.print("Enter the number of employees: ");
        int employeeNumber = keyboard.nextInt();
        
        int[][] employeeHours = new int[employeeNumber][7];
        
        // Gets input for each employee's hours each day
        for(int employee = 0; employee < employeeNumber; employee++){
            System.out.print("Enter the number of hours worked each day (Sunday-Saturday) by employee " + (employee + 1) + ": ");
            
            for(int hours = 0; hours < 7; hours++){
                employeeHours[employee][hours] = keyboard.nextInt();
            } 
        }
        
        int[][] employeeTotalHours = employeeObject.calculateTotalHours(employeeHours, employeeNumber);
        
        // Prints each employee and their total hours in descending order
        for(int employees = employeeTotalHours.length - 1; employees > -1; employees--){
            System.out.println("Employee " + (employeeTotalHours[employees][0] + 1) + " total hours is " + employeeTotalHours[employees][1]);
        }
    }
    
    /**
     * Method that calculates the total hours worked in a week for every employee
     * @param employeeHours int[][] all employees and each of their hours
     * @param employeeNumber int number of employees
     * @return int[][] every employee's total number of hours in a week and their original number
     */
    public int[][] calculateTotalHours(int[][] employeeHours, int employeeNumber) {
        
        int[][] employeeTotalHours = new int[employeeNumber][2];
        
        // Adds up all of the hours worked in the week for all employees
        for(int employee = 0; employee < employeeNumber; employee++){
            employeeTotalHours[employee][0] = employee;
            employeeTotalHours[employee][1] = employeeHours[employee][0] + employeeHours[employee][1] + employeeHours[employee][2] + 
                                              employeeHours[employee][3] + employeeHours[employee][4] + employeeHours[employee][5] +
                                              employeeHours[employee][6];    
        }
        
        // Sorts based on total hours
        Arrays.sort(employeeTotalHours, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
            return Integer.compare(a[1], b[1]);
            }
        });
        
        return employeeTotalHours;
    }
    
}
