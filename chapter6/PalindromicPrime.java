package chapter6;
/*
 * This program displays the palindromic prime numbers, numbers that 
 * are both prime and palindromes. The problem says to display the 
 * first 100, but we can spice it up and let the user decide how 
 * many should be displayed. Perhaps we should bake in an upper limit
 * so we don't break our hardware limitations, though.
 * 
 * We will print 10 numbers per line.
 */

 import java.util.*;

public class PalindromicPrime {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            int maxToDisplay = 250;
            int counter = 0;

            System.out.print(
                "Enter how many palindromic primes to display (max 250): ");
            int numToDisplay = input.nextInt();
            if(numToDisplay <= maxToDisplay){
                for(int i = 2; counter < numToDisplay; i++){
                    if(isPrime(i) && isPalindrome(i)){
                        if(counter % 10 == 0){
                            System.out.println();
                        }
                        counter++;
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }

    public static boolean isPrime(int num){
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }

    public static boolean isPalindrome(int num){
        //reverse num and check for equality
        int reverse = 0;
        int temp = num;

        while(temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        
        return (reverse == num);
    }

}
