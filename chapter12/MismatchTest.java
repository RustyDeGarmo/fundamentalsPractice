package chapter12;
/*
 * This program prompts the user to enter two integers and then prints the sum.
 * If the input is invalid we throw an InputMismatchException and prompt the 
 * user to enter valid input.
 */
import java.util.*;

public class MismatchTest {
    public static void main(String[] args){
        int sum = sumInts();
        System.out.println("The sum is: " + sum);
    }

    public static int sumInts(){
        try(Scanner input = new Scanner(System.in)){
            int x = Integer.MIN_VALUE; //hopefully people won't choose this value
            int y = Integer.MIN_VALUE;
            int sum = 0;

            System.out.print("Enter two integers: ");
            try{
                x = input.nextInt();
                y = input.nextInt();
                sum = x + y;
            }catch(InputMismatchException ex){
                System.out.println("Invalid input. Valid integers are 1, 2, 3 etc. ");
                sum = sumInts();
            }
            
            return sum;
        }
    }
}
