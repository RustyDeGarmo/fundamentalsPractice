package chapter5;
/*
 * This program calculates what the total cost of attending four years of 
 *  University will be after 10 years assuming annual tuition is 10,000 now and 
 * increases by 5% every year.
 */
public class FutureTuition {
    public static void main(String[] args){
        double tuition = 10000;
        double totalTuition = 0;

        for(int i = 0; i < 14; i++){
            tuition *= 1.05;
            if(i >= 10){
                System.out.println("Year " + i + " tuition is: " + 
                    ((int)(tuition * 100) / 100.0));
                totalTuition += (int)(tuition * 100) / 100.0;
            }
        }
        System.out.println("Total tuition for the four year program is: " + totalTuition);
    }
}
