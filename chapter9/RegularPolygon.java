package chapter9;
/*
 * This class creates regular polygon objects. A regular polygon is a n-sided 
 * polygon where all sides are equal and all angles are equal. 
 * It is both equilateral and equiangular.
 */
public class RegularPolygon {
    private int n = 3;//number of sides
    private double side = 1;//length of a side
    private double x = 0;//x coordinate
    private double y = 0;//y coordinate

    //no arg constructor that creates a regular polygon with defaults
    RegularPolygon(){

    }

    //constructor that creates a regular polygon with specified number of 
    //sides and length of side, but is centerred at default (0, 0)
    RegularPolygon(int n, double side){

    }

    //constructor that creates a regular polygon with all values specified
    RegularPolygon(int n, double side, double x, double y){

    }

    public int getN(){
        return n;
    }

    public double getSide(){
        return side;
    }

    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }

    public void setN(int n){
        this.n = n;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    //method to return the perimeter
    public double getPerimeter(){
        return this.side * this.n;
    }

    //method to return the area
    public double getArea(){

        return 0;
    }

}
