/*
	the purpose of this program is to reverse an inputted array of integers
*/

import java.util.Scanner;

public class ReverseArray{
	public static void main(String[] args){

		int[] arr = populateArray();
		arr = reverseArray(arr);
		printArray(arr);
	}

	public static int[] reverseArray(int[] arr){
		int[] result = new int[arr.length];
		int counter = 0;

		for(int i = arr.length - 1; i >= 0; i--){
			result[counter] = arr[i];
			counter++;
		}

		return result;
	}

	public static int[] populateArray(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter how many numbers there are: ");

		int arraySize = input.nextInt();
		int[] inputArray = new int[arraySize];

		System.out.println("Enter the numbers: ");
		for(int i = 0; i < inputArray.length; i++){
			inputArray[i] = input.nextInt();
		}

        input.close();
		return inputArray;
	}

	public static void printArray(int[] arr){
		System.out.println("The array reversed is: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}