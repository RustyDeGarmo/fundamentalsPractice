/*                                                                           
    The purpose of this program is to print tables displaying conversions 
    from miles to kilometers for miles 1 to 10, and kilometers to miles from 
    kilometers 20 to 65 counting by 5s. We'll round to three decimal places.

*/


public class MileKiloTables{
    public static void main(String[] args){
        
        //starting kilometers
        int kilometers = 25;

        //We need to print the first line manually
        System.out.println("Miles\t\tKilometers\t|\tKilometers\tMiles");

        //we'll loop 10 times and use our loop variable for our miles
        for(int i = 1; i < 10; i++){
            System.out.println(
                i + "\t\t" + mileToKilo(i) + "\t\t|\t" + kilometers + 
                "\t\t" + kiloToMile(kilometers));
            kilometers += 5;
        }
    }


    public double mileToKilo(double miles){
        return (int)(miles * 1600) / 1000;
    }

    public double kiloToMile(double kilos){
        return (int)(kilos / 1600) * 1000;
    }
}

