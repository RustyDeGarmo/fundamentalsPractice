package chapter5;

/*
 * This program takes integers as input and then displays the number of 
 * positives, the number of negatives, the total, and the average. 
 * The input ends when the user enters 0 and 0 is not counted toward 
 * the average. The average is displayed as a floating point number.
 */
import java.util.*;

public class AverageInts{
    public static void main(String[] args){
        double total = 0;
        int positives = 0;
        int negatives = 0; 
        double count = 0;
        int num = 1;

        //try with resource to auto close the scanner because VS Code doesn't 
        //like it when I leave them open
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter integers, ends with zero (0): ");
            num = input.nextInt();
            while(num != 0){
                num = input.nextInt();
                total += num;
                if(num > 0){
                    positives++;
                }else if(num < 0){
                    negatives++;
                }
                count++;
            }

            if(total == 0){
                System.out.println("No numbers entered except 0");
            }else{
                System.out.println("Positive entries: " + positives);
                System.out.println("Negative entries: " + negatives);
                System.out.println("The total is: " + total);
                System.out.println("The average is: " + total/count);
            }
        }
    }
}