/*
the purpose of this program is to compute and order the weekly hours worked 
for a group of employees. Should display the employees and their total hours 
worked for the week in decending order of hours worked. Using a prebuilt 
two-demensional array of employees and hours but it could be easily modified 
to take user input. 

output should be: (employee 1 and 5 can flip flop)
Employee 7: 41
Employee 6: 38
Employee 0: 34
Employee 4: 32
Employee 3: 31
Employee 1: 28
Employee 5: 28
Employee 2: 20
*/

import java.util.Arrays;
import java.util.Comparator;
public class WeeklyHours{
	public static void main(String[] args){
		//these employees work 7 days a week for some reason
		int[][] employeeHours = {
			{2, 4, 3, 4, 5, 8, 8},
			{7, 3, 4, 3, 3, 4, 4},
			{3, 3, 4, 3, 3, 2, 2},
			{9, 3, 4, 7, 3, 4, 1},
			{3, 5, 4, 3, 6, 3, 8},
			{3, 4, 4, 6, 3, 4, 4},
			{3, 7, 4, 9, 3, 8, 4},
			{6, 3, 5, 9, 2, 7, 9}
		};

		displayHours(employeeHours);
	}

	public static void displayHours(int[][] arr){
		int[][] totalHours = sumHours(arr);
		int[][] sortedHours = sortHours(totalHours);


		for(int i = 0; i < arr.length; i++){
			System.out.print("Employee " + sortedHours[i][0] + ": " + 
				sortedHours[i][1]);
			

			System.out.println();
		}
	}

	public static int[][] sumHours(int[][] arr){
		int[][] totalHours = new int[8][2];

		for(int i = 0; i < totalHours.length; i++){
			totalHours[i][0] = i;
			totalHours[i][1] = 0;
			for(int j = 0; j < arr[i].length; j++){
				totalHours[i][1] += arr[i][j];		
			}
		}
		return totalHours;
	}

	public static int[][] sortHours(int[][] arr){

		
		int biggest = arr[0][1];
		int lastBiggest = Integer.MAX_VALUE;
		int tempEmployee;
		int tempEmployeeHours;
		
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){

				if(arr[j][1] >= arr[i][1] && arr[j][1] <= lastBiggest){
					
					tempEmployee = arr[i][0];
					tempEmployeeHours = arr[i][1];
					arr[i][0] = arr[j][0];
					arr[i][1] = arr[j][1];
					arr[j][0] = tempEmployee;
					arr[j][1] = tempEmployeeHours;
					biggest = arr[i][1];
				}				
			}
			lastBiggest = biggest;
			
				
		}
		
		return arr;
	}

	public static int[][] comparatorSort(int[][] arr){
		Arrays.sort(arr, new Comparator<int[]>() {
			//column to sort array by, in our case it is the number of 
			//hours worked so column 1
			int column = 1;

			@Override
			//compare by column
			public int compare(final int[] entry1, 
							final int[] entry2) {
				//To sort in ascending reverse the < operator
				if(entry1[column] < entry2[column]){
					return 1;
				}else{
					return -1;
				}
			}
		});
		return arr;
	}
}