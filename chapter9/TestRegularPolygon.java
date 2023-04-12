package chapter9;

public class TestRegularPolygon {
    public static void main(String[] args){
        RegularPolygon noArg = new RegularPolygon();
        RegularPolygon nAndSide = new RegularPolygon(6, 4);
        RegularPolygon nSideXY = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Testing: noArg");
        System.out.println("The perimeter is: " + noArg.getPerimeter());
        System.out.println("The area is: " + noArg.getArea());
        System.out.println("The perimeter should be 3 and the area should be  roughly 0.433");
        System.out.println();

        System.out.println("Testing: nAndSide");
        System.out.println("The perimeter is: " + nAndSide.getPerimeter());
        System.out.println("The area is: " + nAndSide.getArea());
        System.out.println("The perimeter should be 24 and the area should be  roughly 41.5692");
        System.out.println();

        System.out.println("Testing: nSideXY");
        System.out.println("The perimeter is: " + nSideXY.getPerimeter());
        System.out.println("The area is: " + nSideXY.getArea());
        System.out.println("The perimeter should be 40 and the area should be  roughly 123.107");
        System.out.println();
    }
}
