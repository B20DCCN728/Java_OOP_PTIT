package khai_bao_lop_point;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
class Point{
    private double x;
    private double y;
    protected Point(Scanner sc){
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    protected double distance(Point b){
        double res_x = this.x - b.x;
        double res_y = this.y - b.y;
        return Math.sqrt(res_x * res_x + res_y * res_y);
    }
}
public class Khai_Bao_Lop_Point{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".0000");
        int t = sc.nextInt();
        while(t-- > 0){
            Point A = new Point(sc);
            Point B = new Point(sc);
            System.out.println(df.format(A.distance(B)));
        }
    }
    
}
