/*
The purpose of this program is to compute taxes based on filing status
and income. i.e. filing status single with annual income of 150,000. The 
program will correctly compute how much tax is owed
*/

import java.util.Scanner;

public class ComputeTaxes{
	public static void main(String[] args){
		printUserTaxes();
	}

	//prompt the user to enter their filing status and annual income
	public static FilingInfo getTaxInformation(){

		try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter your filing status: (1-4)\n" + 
			"1: Single \n2: Married Filing Jointly \n" +
			"3: Married Filing Seperate \n4: Head of Household");

            int status = input.nextInt();

            System.out.print("Enter your annual household income: ");

            double income = input.nextDouble();

            FilingInfo info = new FilingInfo(status, income);
            return info;
        }
	}

	//calculate the taxes owed and display the information to the user
	public static double calculateTaxes(){
		//rates and brackets are for the year 2022
		double[] taxRates = {0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};
        double userTaxes = 0.0;
        double currentBracket = 0;

		//each nested array is for a different filing status
		//single, married/joint, married/seperate, head of house
		double[][] taxBrackets = {
			{11000, 44725, 95375, 182100, 231250, 578125}, 
			{22000, 89450, 190750, 364200, 462500, 693750}, 
			{11000, 44725, 95375, 182100, 231250, 346875}, 
			{15700, 59850, 95350, 182100, 231250, 578100}
		};

		FilingInfo userInfo = getTaxInformation();
        int userStatus = userInfo.getStatus() - 1;
        //test status married, income 115,000, should be 15915.0
        System.out.println(userStatus);
        System.out.println(22000 * .1 + (89450 - 22000) * .12 + (115000 - 89450) * .22);
		
		for(int i = 0; i < taxBrackets[userStatus].length; i++){
            //calculate the required tax liability for each bracket until the next
            //bracket is greater than the users income
            
            //test
            System.out.println("Before: " + userTaxes);

            userTaxes += ((taxBrackets[userStatus][i] - currentBracket) * taxRates[i]);
            currentBracket = taxBrackets[userStatus][i];

            if(userInfo.getIncome() < taxBrackets[userStatus][i + 1]){
                userTaxes += ((userInfo.getIncome() - currentBracket) * 
                    taxRates[i + 1]);
                break;
            }
        }
        
        return userTaxes;
	}

	//helper method to print the information to the console
	public static void printUserTaxes(){
		double taxes = (int)(calculateTaxes() * 100) / 100.0;

		System.out.println("Your tax liability is: $" + taxes);
	}
}