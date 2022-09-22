/*                                                                           
    The purpose of this program is to sum a series of ratios from 1/3 to 97/99 
    and print the result. Could modify to take user input as the first 
    numerator. i.e. input/input+2 to input+96/input+98

*/


public class SumRatioSeries{
    public static void main(String[] args){
        double sum = 0;

        for(int i = 1; i < 97; i += 2){
            sum += i / (i + 2.0);

            System.out.println(i + " / " + (i+2) + " is: " + (double)i / (i + 2.0));
            System.out.println("The current sum is: " + sum);
        }

        System.out.println("\nThe series result is: " + sum);
    }
}

