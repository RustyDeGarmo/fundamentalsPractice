/*                                                                           
    The purpose of this program is to generate four random integers
    between 1 and some given integer. This is to assist me in my 
    practice. I will enter the number of chapter problems available and 
    practice the ones the picker returns.

*/

import java.util.Scanner;

public class FourProblemPicker{
    
    public static void picker(int availableProblems){
        for(int i = 0; i < 4; i++){
            System.out.println("Practice problem: " + 
                (int)(Math.random() * availableProblems + 1));
        }

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of available problems: ");      
        int availableProblems = input.nextInt();

        picker(availableProblems);


        System.out.println("\n\nPress Enter to exit");
        System.console().readLine();
    }
}