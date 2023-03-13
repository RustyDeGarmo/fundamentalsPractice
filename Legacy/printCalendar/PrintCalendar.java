/*
This program takes a month and year from the user and prints
the calendar for that year. Can only accurately print calendars after 1800
*/


import java.util.Scanner;

public class PrintCalendar{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a full year (e.g. 2005): ");
		int year = input.nextInt();

		System.out.print("Enter a month as a number (e.g. 2 = February): ");
		int month = input.nextInt();

		if(year < 1800 || month < 1 || month > 12){
			System.out.println("The year must be later than 1800 " + 
				"and the month must be a number between 1 and 12 inclusive");
			System.exit(0);
		}

		printMonth(year, month);

        input.close();

	}

	public static void printMonth(int year, int month){
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}

	public static void printMonthTitle(int year, int month){
		System.out.println("\n         " + getMonthName(month) + " " + year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

	}

	public static void printMonthBody(int year, int month){
		//print starting spaces
		int startDay = getStartDay(year, month);
		
		for(int j = 0; j < startDay; j++){
			System.out.print("    ");
		}
		
		//print days of the month
		for(int i = 1; i <= getNumberOfDaysInMonth(year, month); i++){
			if((i + startDay) % 7 == 0){
				System.out.printf("%4d\n", i);
			}else{
				System.out.printf("%4d", i);
			}
		}
		System.out.println();
	}

	public static String getMonthName(int month){
		switch (month){
		case 1: 
			return "January";
		case 2: 
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "invalid month";
		}
	}

	public static int getStartDay(int year, int month){
		int START_DAY_JAN_1800 = 4;
		return (getTotalNumberOfDays(year, month) + START_DAY_JAN_1800) % 7;
	}

	public static int getTotalNumberOfDays(int year, int month){
		int days = 0;

		for(int i = year - 1; i > 1800; i--){
			if(isLeapYear(i)){
				days += 366;
			}else{
				days += 365;
			}
		}

		for(int j = 1; j < month; j++){
			days += getNumberOfDaysInMonth(year, j);
		}

		return days;
	}

	public static int getNumberOfDaysInMonth(int year, int month){
		switch (month){
		case 1:
			return 31;
		case 2:
			if(isLeapYear(year)){
				return 29;
			}else{
				return 28;
			}
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return -1;
		}
	}

	public static boolean isLeapYear(int year){
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}