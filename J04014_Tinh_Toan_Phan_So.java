package tinh_toan_phan_so;
import java.util.*;
import java.io.*;
import java.math.*;

class Point{
    private long numerator;
    private long denominator;
    public void Input(Scanner sc){
        this.numerator = sc.nextLong();
        this.denominator = sc.nextLong();
    }
    private long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b, a % b);
    }
    public void Calculate_1(Point A, Point B){
        this.denominator = A.denominator * B.denominator;
        this.numerator = A.numerator * B.denominator + B.numerator * A.denominator;
        this.denominator *= this.denominator;
        this.numerator *= this.numerator;
        long gcd = this.GCD(this.denominator, this.numerator);
        this.denominator /= gcd;
        this.numerator /= gcd;
        System.out.print(this.numerator + "/" + this.denominator + " ");
    }
    protected void Calculate_2(Point A, Point B, Point C){
        this.numerator = A.numerator * B.numerator * C.numerator;
        this.denominator = A.denominator * B.denominator * C.denominator;
        long gcd = this.GCD(this.numerator, this.denominator);
        this.denominator /= gcd;
        this.numerator /= gcd;
        System.out.println(this.numerator + "/" + this.denominator);
    }
}

public class Tinh_Toan_Phan_So {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point();
            a.Input(sc);
            Point b = new Point();
            b.Input(sc);
            Point c = new Point();
            c.Calculate_1(a, b);
            Point d = new Point();
            d.Calculate_2(a, b, c);
        }
    }
    
}
