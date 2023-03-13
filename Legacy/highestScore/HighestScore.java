/*                                                                           
    The purpose of this program is to take user input for the number of 
    students, their first name, and their score. Then the program prints the 
    student with the highest score.
*/

import java.util.Scanner;

public class HighestScore{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in);){
            
            String bestStudent = "";
            String name = "";
            double score = 0;
            double bestScore = -9999;
            System.out.print("Enter the number of students: ");
            int numberOfStudents = input.nextInt();
            
            //input validation
            if(numberOfStudents < 1){
                System.out.println("There must be at least one student");
            }

            for(int i = 0; i < numberOfStudents; i++){
                System.out.print("Enter the students name: ");
                name = input.next();
                System.out.print("Enter " + name + "'s score: ");
                score = input.nextDouble();

                if(score > bestScore){
                    bestStudent = name;
                    bestScore = score;
                }
            }

            System.out.println("\n" + bestStudent + " is the best student with a " + 
                "score of: " + bestScore + "\n\n");
            }
    }
}

