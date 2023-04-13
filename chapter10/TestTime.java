package chapter10;

public class TestTime {
    public static void main(String[] args){
        //create objects using each constructor
        Time noArg = new Time();
        Time elapsedTime = new Time(555550000L);
        Time hourMinuteSecond = new Time(5, 23, 55);

        //display the time in hour:minute:second format
        System.out.println("Displaying noArg constructor for current time in GMT");
        System.out.println(noArg.getHour() + ":" + noArg.getMinute() + ":" + 
            noArg.getSecond());
        System.out.println();

        System.out.println("Displaying elapsedTime constructor with 555550000L milliseconds");
        System.out.println(elapsedTime.getHour() + ":" + elapsedTime.getMinute() + 
            ":" + elapsedTime.getSecond());
        System.out.println();

        System.out.println("Displaying setTime Method with 543322456700L milliseconds");
        elapsedTime.setTime(543322456700L);
        System.out.println(elapsedTime.getHour() + ":" + elapsedTime.getMinute() + 
            ":" + elapsedTime.getSecond());
        System.out.println();

        System.out.println("Displaying hourMinuteSecond constructor with 5 hours, 23 minutes , 55 seconds");
        System.out.println(hourMinuteSecond.getHour() + ":" + 
            hourMinuteSecond.getMinute() + ":" + hourMinuteSecond.getSecond());
        System.out.println();
    }
}
