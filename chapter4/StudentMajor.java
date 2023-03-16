package chapter4;
/*
    This program takes a two digit code as input and outputs the student's major 
    and year of study. The major is the first character and the year of study 
    is the second character. 

    The available majors are: 
    Mathematics (M), 
    Computer Science (C), 
    Information Technology (I)

    Are there really any others? :)
*/

import java.util.*;

public class StudentMajor{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter a code: ");
            String code = input.next();

            if(code.charAt(0) == 'M'){
                if(code.charAt(1) == '1'){
                    System.out.println("Mathematics Freshman");
                }else if(code.charAt(1) == '2'){
                    System.out.println("Mathematics Sophomore");
                }else if(code.charAt(1) == '3'){
                    System.out.println("Mathematics Junior");
                }else if(code.charAt(1) == '4'){
                    System.out.println("Mathematics Senior");
                }else{
                    System.out.println("Invalid input. A valid example is M2");
                }

            }else if(code.charAt(0) == 'C'){
                if(code.charAt(1) == '1'){
                    System.out.println("Computer Science Freshman");
                }else if(code.charAt(1) == '2'){
                    System.out.println("Computer Science Sophomore");
                }else if(code.charAt(1) == '3'){
                    System.out.println("Computer Science Junior");
                }else if(code.charAt(1) == '4'){
                    System.out.println("Computer Science Senior");
                }else{
                    System.out.println("Invalid input. A valid example is C2");
                }
            }else if(code.charAt(0) == 'I'){
                if(code.charAt(1) == '1'){
                    System.out.println("Information Technology Freshman");
                }else if(code.charAt(1) == '2'){
                    System.out.println("Information Technology Sophomore");
                }else if(code.charAt(1) == '3'){
                    System.out.println("Information Technology Junior");
                }else if(code.charAt(1) == '4'){
                    System.out.println("Information Technology Senior");
                }else{
                    System.out.println("Invalid input. A valid example is I2");
                }
            }else {
                System.out.println("Invalid input. A valid example is M2");
            }
        }

    }
}