package chapter4;
/*
    This program is meant to take in user input of the distance from the 
    center of a pentagon to a vertex and compute the area of the pentagon
    rounded to two decimal points

    Area Formula: (5 x s^2) / (4 x tan(pi / 5)) where s is the length of a side
    Side Formula: 2 x r x sin(pi / 5) where r is the length from the center to 
        a vertex
*/
import java.util.*;

public class PentagonArea{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            final double PI = 3.141592;
            System.out.print("Distance from center to vertex: ");
            double radius = input.nextDouble();

            double side = 2 * radius * Math.sin(PI / 5);
            double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(PI / 5));

            System.out.println("The area of a pentagon with a radius of " + 
            radius + " is " + ((int)(area * 100) / 100.0));
        }

    }
}