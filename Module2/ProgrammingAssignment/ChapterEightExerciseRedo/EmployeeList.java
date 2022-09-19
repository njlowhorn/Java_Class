package employeelist;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Program that gets the number of hours worked each day in a week for each employee and outputs their total number of hours in the week
 * @author Nolan Lowhorn
 */
public class EmployeeList {

    
    public static void main(String[] args) {
        EmployeeList employeeObject = new EmployeeList();
        Scanner keyboard = new Scanner(System.in);
        
        // Gets input for number of employees
        System.out.print("Enter the number of employees: ");
        int employeeNumber = keyboard.nextInt();
        
        LinkedList<LinkedList<Integer>> employeeHours = new LinkedList<>();
        
        // Gets input for each employee's hours each day
        for(int employee = 0; employee < employeeNumber; employee++){
            System.out.print("Enter the number of hours worked each day (Sunday-Saturday) by employee " + (employee + 1) + ": ");
            LinkedList<Integer> employeeHoursSingle = new LinkedList<>();
            for(int hours = 0; hours < 7; hours++){
                employeeHoursSingle.add(keyboard.nextInt());
            } 
            employeeHours.add(employee, employeeHoursSingle);
        }
        
        LinkedList<LinkedList<Integer>> employeeTotalHours = employeeObject.calculateTotalHours(employeeHours, employeeNumber);
        
        // Prints each employee and their total hours in descending order
        for(int employees = employeeTotalHours.size() - 1; employees > -1; employees--){
            System.out.println("Employee " + (employeeTotalHours.get(employees).get(0) + 1) + " total hours is " + employeeTotalHours.get(employees).get(1));
        }
    }
    
    /**
     * Method that calculates the total hours worked in a week for every employee
     * @param employeeHours LinkedList&lt;LinkedList&lt;Integer&gt;&gt; all employees and each of their hours
     * @param employeeNumber int number of employees
     * @return LinkedList&lt;LinkedList&lt;Integer&gt;&gt; every employee's total number of hours in a week and their original number
     */
    public LinkedList<LinkedList<Integer>> calculateTotalHours(LinkedList<LinkedList<Integer>> employeeHours, int employeeNumber) {
        
        LinkedList<LinkedList<Integer>> employeeTotalHours = new LinkedList<>();
        
        // Adds up all of the hours worked in the week for all employees
        for(int employee = 0; employee < employeeNumber; employee++){
            LinkedList<Integer> employeeTotalHoursSingleEmployee = new LinkedList<>();
            employeeTotalHoursSingleEmployee.add(0, employee);
            employeeTotalHoursSingleEmployee.add(1, (employeeHours.get(employee).get(0) + employeeHours.get(employee).get(1) + employeeHours.get(employee).get(2) +
                                                      employeeHours.get(employee).get(3) + employeeHours.get(employee).get(4) + employeeHours.get(employee).get(5) +
                                                      employeeHours.get(employee).get(6)));
            employeeTotalHours.add(employeeTotalHoursSingleEmployee);
        }
        
        // Sorts based on total hours
        employeeTotalHours.sort(new Comparator<LinkedList<Integer>>(){
            public int compare(LinkedList<Integer> a, LinkedList<Integer> b) {
            return Integer.compare(a.get(1),b.get(1));
            }
        });
        
        return employeeTotalHours;
    }
    
}
