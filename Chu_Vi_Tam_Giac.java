package chu_vi_tam_giac;
import java.util.*;
import java.lang.*;
import java.math.*;
class Point{
    //
    private double x;
    private double y;
    private double a;
    private double b;
    private double c;
    //
    public Point(Scanner sc){
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    //
    protected boolean isCheck(Point A, Point B){
        this.a = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
        this.b = Math.sqrt((B.x - this.x) * (B.x - this.x) + (B.y - this.y) * (B.y - this.y));
        this.c = Math.sqrt((A.x - this.x) * (A.x - this.x) + (A.y - this.y) * (A.y - this.y));
        if(a + b > c && b + c > a && a + c > b) return true;
        else return false;
    }
    protected double Perimeter(){
        return (this.a + this.b + this.c);
    }
}
public class Chu_Vi_Tam_Giac {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Point A = new Point(sc);
            Point B = new Point(sc);
            Point C = new Point(sc);
            if(C.isCheck(A, B)) System.out.printf("%.3f\n", C.Perimeter());
            else System.out.println("INVALID");
      
        }
    }
    
}
