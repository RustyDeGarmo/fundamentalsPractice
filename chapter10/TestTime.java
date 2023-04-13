package chapter10;

public class TestTime {
    public static void main(String[] args){
        //create objects using each constructor
        Time noArg = new Time();
        Time elapsedTime = new Time(555550000L);
        Time hourMinuteSecond = new Time(5, 23, 55);

        //display the time in hour:minute:second format
        System.out.println("Testing noArg constructor");
        System.out.println(noArg.getHour() + ":" + noArg.getMinute() + ":" + 
            noArg.getSecond());
        System.out.println();

        System.out.println("Testing elapsedTime constructor");
        System.out.println(elapsedTime.getHour() + ":" + elapsedTime.getMinute() + 
            ":" + elapsedTime.getSecond());
        System.out.println();

        System.out.println("Testing hourMinuteSecond constructor");
        System.out.println(hourMinuteSecond.getHour() + ":" + 
            hourMinuteSecond.getMinute() + ":" + hourMinuteSecond.getSecond());
        System.out.println();
    }
}
