package gradeslist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Program that allows input for number of students and scores from each student; then returns grades for each student
 * @author Nolan Lowhorn
 */
public class GradesList {

    public static void main(String[] args) {
        GradesList grades = new GradesList();
        Scanner keyboard = new Scanner(System.in);
        
        // Gets input for number of students
        System.out.print("Enter the number of students: ");
        int studentNumber = keyboard.nextInt();
        
        // Gets input for each score
        System.out.print("Enter the scores of each student: ");
        ArrayList<Integer> studentScores = new ArrayList<>();
        for(int score = 0; score < studentNumber; score++){
            studentScores.add(keyboard.nextInt());
        }
        
        ArrayList<String> gradeStatement = grades.calculateGrades(studentScores);
        
        // Prints each grade statement
        for(String statements: gradeStatement){
            System.out.println(statements);
        }     
    }
    
    /**
     * Method that calculates grades based difference from the highest score
     * @param scoreArray ArrayList&lt;Integer&gt; score for each student
     * @return ArrayList&lt;String&gt statement about score and grade for each student
     */
    public ArrayList<String> calculateGrades (ArrayList<Integer> scoreArray){
        // Creates new list, gets all values from original list, sorts from smallest to largest, then gets biggest integer
        ArrayList<Integer> orderedScoreArray = new ArrayList<>();
        orderedScoreArray.addAll(scoreArray);
        orderedScoreArray.sort(Comparator.naturalOrder());
        int highestScore = orderedScoreArray.get(orderedScoreArray.size()-1);
        
        ArrayList<String> gradeStatement = new ArrayList<>();
        
        // Gets a string based on each grade for each student
        for(int student = 0; student < scoreArray.size(); student++){
            int score = scoreArray.get(student);
            if(score >= highestScore-10){
                gradeStatement.add("Student " + (student + 1) + " score is " + score + " and grade is A.");
            }
            else if(score >= highestScore-20){
                gradeStatement.add("Student " + (student + 1) + " score is " + score + " and grade is B.");
            }
            else if(score >= highestScore-30){
                gradeStatement.add("Student " + (student + 1) + " score is " + score + " and grade is C.");
            }
            else if(score >= highestScore-40){
                gradeStatement.add("Student " + (student + 1) + " score is " + score + " and grade is D.");
            }
            else{
                gradeStatement.add("Student " + (student + 1) + " score is " + score + " and grade is F.");
            }
        }
        return gradeStatement;
    }
}
