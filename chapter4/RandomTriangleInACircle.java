package chapter4;
/*
    This program generates three random points on a circle that is centered at 
    (0, 0) and has a radius of 40. We then display the three angles of the 
    triangle that is formed by these random points. The angles are displayed in 
    degrees.
*/

public class RandomTriangleInACircle{
    public static void main(String[] args){
        final int RADIUS = 40;
        double[] randomAngles = new double[3];

        //sides 0 is a, 1 is b, 2 is c
        double[] sides = new double[3];

        //our triangles angles
        //0 is angle A, 1 is B, 2 is C
        double[] angles = new double[3];

        //get three random angles 
        for(int i = 0; i < 3; i++){
            randomAngles[i] = getRandomAngle();
        }

        //find the points
        double x1 = RADIUS * Math.cos(randomAngles[0]);
        double y1 = RADIUS * Math.sin(randomAngles[0]);
        double x2 = RADIUS * Math.cos(randomAngles[1]);
        double y2 = RADIUS * Math.sin(randomAngles[1]);
        double x3 = RADIUS * Math.cos(randomAngles[2]);
        double y3 = RADIUS * Math.sin(randomAngles[2]);
        
        //find the sides
        sides[0] = Math.sqrt(Math.pow((x2 - x3), 2) + 
        Math.pow((y2 - y3), 2));
        sides[1] = Math.sqrt(Math.pow((x1 - x3), 2) + 
        Math.pow((y1 - y3), 2));
        sides[2] = Math.sqrt(Math.pow((x1 - x2), 2) + 
        Math.pow((y1 - y2), 2));
        
        //find our angles
        angles[0] = getAngleWithSides(sides[0], sides[1], sides[2]);

        angles[1] = getAngleWithSides(sides[1], sides[2], sides[0]);
        
        angles[2] = getAngleWithSides(sides[2], sides[0], sides[1]);

        printAngles(angles);

    }

    public static double getRandomAngle(){
        //we need a random angle between 0 and 2 * PI radians
        return (Math.random() * (2 * Math.PI));
    }

    public static double getAngleWithSides(double a, double b, double c){
        return Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - 
        Math.pow(a, 2) ) / (2 * b * c)));
    }

    public static void printAngles(double[] angles){
        for(int i = 0; i < angles.length; i++){
            System.out.println("Angle " + (char)(i+65) + " is: " + Math.round((angles[i] * 100)) / 100.0);
        }
    }
}