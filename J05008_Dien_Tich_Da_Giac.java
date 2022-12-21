//Created by Campus
package dien_tich_da_giac;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class Point {
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

//
public class Dien_Tich_Da_Giac {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<Point> point = new ArrayList<>();
            for(int i = 0;i < n;i++){
                String [] tmp = sc.nextLine().split(" ");
                point.add(new Point(Double.parseDouble(tmp[0]), Double.parseDouble(tmp[1])));
            }
            double area = 0;
            for(int i = 0;i < point.size() - 1;i++){
                area += (point.get(i).getX() * point.get(i + 1).getY() - point.get(i + 1).getX() * point.get(i).getY());
            }
            area += (point.get(n - 1).getX() * point.get(0).getY() - point.get(0).getX() * point.get(n - 1).getY());
            System.out.println(String.format("%.3f", area / 2));
        }
    }
    
}
