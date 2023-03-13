/*
The purpose of this program is to test the time difference in execution 
between linear search and binary search. We will generate an array of 100,000 
random integers and a random key to search for, time the linear search, sort 
the array, and finally time the binary search.
*/

public class TimeTest{
	public static void main(String[] args){
		int size = 100000;
		int[] intArray = generateRandomArray(size);
		int key = generateKey();

		linearSearch(intArray, key);
		selectionSortArray(intArray);
		binarySearch(intArray, key);

		
	}

	public static int[] generateRandomArray(int size){
		int[] output = new int[size];

		for(int i = 0; i < size; i++){
			output[i] = (int)(Math.random() * 100 + 1);
		}

		return output;
	}

	public static int linearSearch(int[] list, int key){
		long startTime = System.nanoTime();
		int index = -1;
		for(int i = 0; i < list.length; i++){
			if(key == list[i]){
				index = i;
			}
		}

		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		System.out.println("The execution time for linear search is " + 
			executionTime + " milliseconds");

		return index;
	}


	public static void selectionSortArray(int[] list){
		long startTime = System.nanoTime();
		int temp;

		for(int i = 0; i < list.length - 1; i++){
			for(int j = i + 1; j < list.length; j++){
				if(list[j] < list[i]){
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}

		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		System.out.println("The execution time for selection sort is " 
			+ executionTime + " milliseconds");
	}

	public static int binarySearch(int[] list, int key){
		long startTime = System.nanoTime();
		int lowIndex = 0;
		int highIndex = list.length - 1;
		int result = -1;
		
		while(highIndex > lowIndex){
			int testIndex = (lowIndex + highIndex) / 2;

			if(key == testIndex){
				//key found
				result = testIndex;
				break;
			}else if(key < testIndex){
				//key is in left half
				highIndex = testIndex - 1;
			}else{
				//key is in right half
				lowIndex = testIndex + 1;
			}

		}

		
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		System.out.println("The execution time for binary search is " 
			+ executionTime + " milliseconds");

		return result;
	}

	public static int generateKey(){
		return (int)(Math.random() * 100 + 1);
	}

	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(i % 50 == 0){
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void testSelectionSort(int size){
		//test for selection sort
		int[] test = generateRandomArray(size);
		printArray(test);
		selectionSortArray(test);
		printArray(test);
	}
}