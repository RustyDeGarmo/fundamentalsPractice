package chapter13;
/*
 * This program takes a decimal number as input and converts it to a 
 * fraction. We can use our Rational class
 */

import java.util.*;

public class TestDecimal {
    public static void main(String[] args){
        //prompt the user to input a decimal 
        //then display the number as a fraction
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a decimal number: ");
            String inNumber = input.next();

            Rational fraction = toFraction(inNumber);

            System.out.println(fraction.toString());
        }
    }

    public static Rational toFraction(String numString){
        //convert the string decimal number to a Rational fraction
        
        //get the whole number part and the decimal part
        String decimalString = numString.substring(numString.indexOf("."));
        int intPart = (int)Double.parseDouble(numString);
        double decimalPart = Double.parseDouble(numString) - intPart;

        /*
         * get the length of the decimal part of the number
         * then get a long numerator and denominator to use with our 
         * Rational class
         */
        int decimalSize = decimalString.length() - 1; // subtract the leading 0
        long multiple = 10; //used to convert to long for Rational
        for(int i = 1; i < decimalSize; i++){
            multiple *= 10;
        }
        long numerator = ((long)(decimalPart * multiple)) + (intPart * multiple);
        long denominator = 1 * multiple;
        Rational fraction = new Rational(numerator, denominator);
        

        //print statements for testing
        System.out.println("The decimal string is: " + decimalString);
        System.out.println("The int part is: " + intPart);
        System.out.println("The decimal part is: " + decimalPart);
        System.out.println("The size of the decimal part is: " + decimalSize);
        System.out.println("The multiple is: " + multiple);
        System.out.println("The numerator is: " + numerator);
        System.out.println("The denominator is: " + denominator);

        return fraction;
    }
}
