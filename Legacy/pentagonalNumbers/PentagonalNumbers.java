/*                                                                           
    The purpose of this program is to call a test method that prints the first 
    100 pentagonal numbers with 10 numbers per line. Then print the pentagonal 
    number for the given input such that input = n and the pentagonal number is 
    n(3n-1)/2. Comment out the call to the test if you don't want to print the 
    first 100 values.

*/

import java.util.Scanner;

public class PentagonalNumbers{
    public static void main(String[] args){
        //test values
        int one = getPentagonalNumber(1);
        int two = getPentagonalNumber(2);
        int three = getPentagonalNumber(3);

        //tests for the first three pentagonal numbers
        if(one != 1){
            System.out.println("getPentagonalNumber isn't working correctly");
        }
        if(two != 5){
            System.out.println("getPentagonalNumber isn't working correctly");
        }
        if(three != 12){
            System.out.println("getPentagonalNumber isn't working correctly");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value to print it's pentagonal number: ");
        int userNumber = input.nextInt();

        System.out.println("The pentagonal number for " + userNumber + 
            " is " + getPentagonalNumber(userNumber));

        testPentagonalNumber();

    }

    public static int getPentagonalNumber(int n){
        return (n * (3 * n - 1))/2;
    }

    public static void testPentagonalNumber(){
        
        System.out.println("\nThe first 100 pentagonal numbers are: ");
        for(int i = 1; i <= 100; ++i){
            if(i % 10 == 0){
                System.out.printf("%7d\n", getPentagonalNumber(i));
            }else{
                System.out.printf("%7d", getPentagonalNumber(i));    
            }
        }
    }
}

