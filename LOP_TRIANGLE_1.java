package lop_triangle._1;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Point{
    private double x, y;
    
    public Point(Scanner sc){
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    
    public static Point nextPoint(Scanner sc){
        Point x = new Point(sc);
        return x;
    }
    
    protected double getX(){
        return this.x;
    }
    
    protected double getY(){
        return this.y;
    }
}
//
class Triangle {
    private double ab, bc, ca;
    public Triangle(Point a, Point b, Point c){
        this.ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        this.bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        this.ca = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
    }
    
    protected boolean valid(){
        if(this.ab + this.bc <= this.ca) return false;
        if(this.bc + this.ca <= this.ab) return false;
        if(this.ab + this.ca <= this.bc) return false;
        return true;
    }
    
    protected String getPerimeter(){
        return String.format("%.3f", this.ab + this.bc + this.ca);
    }
}
//
public class LOP_TRIANGLE_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }        
    }
    
}
