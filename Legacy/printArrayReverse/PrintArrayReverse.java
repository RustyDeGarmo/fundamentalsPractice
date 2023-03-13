/*
the purpose of this program is to take 10 integers as input and print them 
in reverse order.
*/

import java.util.Scanner;

public class PrintArrayReverse{
	public static void main(String[] args){
		System.out.println("Enter 10 integers: ");

		try(Scanner input = new Scanner(System.in);){
            
            int[] arr = new int[10];

            for(int i = 0; i < arr.length; i++){
                arr[i] = input.nextInt();
            }

            System.out.println("Your integers reversed are: "); 

            for(int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i]);
		}
        }

	}
}