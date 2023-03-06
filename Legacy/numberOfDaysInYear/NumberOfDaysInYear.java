/*                                                                           
    The purpose of this program is to print the number of days in an input 
    year. Tested with printing the number of days in the years 2000 to 2020.
*/

import java.util.Scanner;

public class NumberOfDaysInYear{
    public static void main(String[] args){
    
    testNumberOfDaysInYear();        

    }

    public static int getNumberOfDaysInYear(int year){
        return isLeapYear(year) ? 366 : 365;
        
    }

    public static void testNumberOfDaysInYear(){
        
        System.out.println("\nThe number of days per year from " + 
            "the year 2000 to the year 2020 are: ");
        for(int i = 2000; i <= 2020; ++i){
            System.out.print("Year: " + i + "    Number of Days: ");
            System.out.printf("%4d\n", getNumberOfDaysInYear(i));
        }
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}

