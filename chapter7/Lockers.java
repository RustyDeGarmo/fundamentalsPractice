package chapter7;
/* 
 * There are 100 lockers and 100 students
 * Each locker starts closed
 * The first student opens every locker
 * The second student starts at the second locker and closes every other locker
 * The third starts at the third and switches every third locker
 *  opens close lockers and closes open lockers
 * The fourth starts at the fourth and switches every fourth
 * etc. etc. until the 100th student switches the 100th locker
 * 
 * This program calculates which lockers are open and which are closed.
 */
import java.util.Arrays;

public class Lockers {
    public static void main(String[] args){
        //false is closed and true is open
        boolean[] lockers = new boolean[100];
        int[] students = new int[100];
        
        //populate the arrays
        Arrays.fill(lockers, false);
        for(int i = 1; i <= 100; i++){
            students[i-1] = i;
        }
        //we need to loop through the array for each student 
        for(int i = 0; i < students.length; i++){
            for(int j = 1; j <= lockers.length; j++){
                if(j % students[i] == 0){
                    lockers[j-1] = !lockers[j-1];
                }
            }
        }

        //we loop again to print the open lockers seperated by a space
        for(int i = 0; i < lockers.length; i++){
            if(lockers[i]){
                System.out.print(i+1 + " ");
            }
        }
    }
}
