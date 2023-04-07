package chapter9;

/*
 * This is a simple program to mess with the built in date class
 */
import java.util.Date;

public class DatePlay{
    public static void main(String[] args){
        Date[] dates = new Date[8];
        long startTime = 10000;

        //print a default date, then print dates with elapsed time starting 
        //with startTime and multiplying by 10 for each iteration
        System.out.println(new Date().toString());
        for(int i = 0; i < dates.length; i++){
            dates[i] = new Date(startTime);
            startTime *= 10;
            System.out.println("Date " + i + " is " + dates[i].toString());
        }

    }
}