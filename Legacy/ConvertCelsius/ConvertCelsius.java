import java.util.Scanner;

public class ConvertCelsius {
	public static void main(String[] args){
		//create scanner for input
        try(Scanner input = new Scanner(System.in);){
            
            //prompt user and recieve input
            System.out.println("What is the temp in celsius?");
            double temp = input.nextDouble();

            //calculate and output the results
            double fahrenheit = (9.0/5) * temp + 32;
            System.out.println(temp + " degrees celsius is " + 
                fahrenheit + " degrees fahrenheit");

        }
	}
}