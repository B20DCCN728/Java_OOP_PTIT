//Created by Campus
package kiem_tra_va_tinh_dien_tich_tam_giac;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
class Point {
    public double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //quên không tạo hàm tính luôn kc ở đây :]]]]]
}

//
class Triangle {
    private Point a, b, c;
    private double ab, bc, ac;
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
        set();
    }
    public void set(){
        this.ab = Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        this.bc = Math.sqrt((b.x - c.x) * (b.x - c.x) + (b.y - c.y) * (b.y - c.y));
        this.ac = Math.sqrt((a.x - c.x) * (a.x - c.x) + (a.y - c.y) * (a.y - c.y));
    }
    public boolean isCheck(){
        if(ab + bc <= ac||bc + ac <= ab||ab + ac <= bc) return false;
        return true;
    }
    public String getArea(){
        double res;
        res = Math.sqrt(((ab + bc + ac) * (ab + bc - ac) * (-ab + bc + ac) * (ab - bc + ac))) / 4;
        return String.format("%.04f", res);
    }
}

//
public class Kiem_Tra_Va_Tinh_Dien_Tich_Tam_Giac {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Triangle solve = new Triangle(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));
            if(solve.isCheck()){
                System.out.println(solve.getArea());
            }
            else System.out.println("INVALID");
        }
    }
    
}
