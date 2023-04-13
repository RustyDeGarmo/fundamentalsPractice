package chapter10;
/*
 * This class creates a Time object to represent either the current time or a 
 * given time. 
 * We assume GMT and use System.currentTimeMillis()
 */
public class Time{
    private int hour;
    private int minute;
    private int second;

    //no arg constructor creates an object with the current time
    Time(){
        long millis = System.currentTimeMillis();
        long seconds = millis / 1000;
        this.second = (int)(seconds % 60);
        long minutes = seconds / 60;
        this.minute = (int)(minutes % 60);
        long hours = minutes / 60;
        this.hour = (int)(hours % 24);
    }

    //constructor that takes elapsed time in milliseconds
    Time(long millis){
        long seconds = millis / 1000;
        this.second = (int)(seconds % 60);
        long minutes = seconds / 60;
        this.minute = (int)(minutes % 60);
        long hours = minutes / 60;
        this.hour = (int)(hours % 24);
    }

    //constructor that takes the hour, minute, and second
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //getters
    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    //setter for elapsed time
    public void setTime(long elapsedTime){
        long seconds = elapsedTime / 1000;
        this.second = (int)(seconds % 60);
        long minutes = seconds / 60;
        this.minute = (int)(minutes % 60);
        long hours = minutes / 60;
        this.hour = (int)(hours % 24);
    }
}