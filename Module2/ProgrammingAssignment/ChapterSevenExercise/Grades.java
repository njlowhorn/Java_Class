
package grades;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Program that allows input for number of students and scores from each student; then returns grades for each student
 * @author Nolan Lowhorn
 */
public class Grades {


    public static void main(String[] args) {
        Grades grades = new Grades();
        Scanner keyboard = new Scanner(System.in);
        
        // Gets input for number of students
        System.out.print("Enter the number of students: ");
        int studentNumber = keyboard.nextInt();
        
        // Gets input for each score
        System.out.print("Enter the scores of each student: ");
        int[] studentScores = new int[studentNumber];
        for(int score = 0; score < studentNumber; score++){
            studentScores[score] = keyboard.nextInt();
        }
        
        String[] gradeStatement = grades.calculateGrades(studentScores);
        
        // Prints each grade statement
        for(String statements: gradeStatement){
            System.out.println(statements);
        }     
    }
    
    /**
     * Method that calculates grades based difference from the highest score
     * @param scoreArray int[] score for each student
     * @return String[] statement about score and grade for each student
     */
    public String[] calculateGrades (int[] scoreArray){
        // Gets copy of array, sorts from smallest to largest, then gets biggest integer
        int[] orderedScoreArray = scoreArray.clone();
        Arrays.sort(orderedScoreArray);
        int highestScore = orderedScoreArray[orderedScoreArray.length-1];
        
        String[] gradeStatement = new String[scoreArray.length];
        
        // Gets a string based on each grade for each student
        for(int student = 0; student < scoreArray.length; student++){
            int score = scoreArray[student];
            if(score >= highestScore-10){
                gradeStatement[student] = ("Student " + (student + 1) + " score is " + score + " and grade is A.");
            }
            else if(score >= highestScore-20){
                gradeStatement[student] = ("Student " + (student + 1) + " score is " + score + " and grade is B.");
            }
            else if(score >= highestScore-30){
                gradeStatement[student] = ("Student " + (student + 1) + " score is " + score + " and grade is C.");
            }
            else if(score >= highestScore-40){
                gradeStatement[student] = ("Student " + (student + 1) + " score is " + score + " and grade is D.");
            }
            else{
                gradeStatement[student] = ("Student " + (student + 1) + " score is " + score + " and grade is F.");
            }
        }
        return gradeStatement;
    }
}
