/*
        The Problem: 
        Financial application: compound value - Suppose you save each 
        month in a savings account with an interest rate of 5%. Get 
        user input for the monthly savings ammount and calculate 
        how much will be in the account after six months.
*/
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        double monthlyInterestRate = .05/12 + 1;
        double savings = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your monthly deposit ammount: ");
        double monthlyDeposit = input.nextDouble();
        
        for(int i = 0; i < 6; i++){
            savings = (savings + monthlyDeposit) * monthlyInterestRate;
        }

        //round to two decimal places
        savings = ((double)(int)(savings*100))/100;
        
        System.out.println("\nYour savings balance after six months is: " + 
            savings);

    }
}