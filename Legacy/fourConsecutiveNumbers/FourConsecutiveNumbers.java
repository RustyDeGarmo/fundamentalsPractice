/*
the purpose of this program is to test an integer array for four consecutive 
equal numbers. 
*/
import java.util.Scanner;

public class FourConsecutiveNumbers{
	public static void main(String[] args){
		int[] values = populateList();

		if(isConsecutiveFour(values)){
			System.out.println(
				"This list has four consecutive equal integers");
		}else{
			System.out.println(
				"This list doesn't have four consecutive equal integers");
		}
	}

	public static boolean isConsecutiveFour(int[] values){
		//declare a counter to keep track of how many consecutive equal 
		//numbers we have and set the initial value to be compared to the 
		//first index of the input array
		int counter = 1;
		int value = values[0];


		for(int i = 1; i < values.length; i++){
			if(values[i] == value){
				counter++;
				if(counter >= 4){
					return true;
				}
			}else{
				value = values[i];
				counter = 1;
			}
		}
		return false;
	}

	public static int[] populateList(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter how many integers you'll enter: ");

		int size = input.nextInt();
		int[] values = new int[size];

		System.out.println("Enter the integers: ");

		for(int i = 0; i < size; i++){
			values[i] = input.nextInt();
		}

		return values;
	}
}