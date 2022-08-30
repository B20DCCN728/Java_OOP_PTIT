package tong_phan_so;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
class Phan_So{
    private long numerator;
    private long denominator;
    protected void input(Scanner sc){
        this.numerator = sc.nextLong();
        this.denominator = sc.nextLong();
    }
    private long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b, a % b);
    }
    public void Calculate(Phan_So A, Phan_So B){
        this.denominator = A.denominator * B.denominator;
        this.numerator = A.numerator * B.denominator + B.numerator * A.denominator;
        long gcd = this.GCD(this.denominator, this.numerator);
        this.denominator /= gcd;
        this.numerator /= gcd;
        System.out.println(this.numerator + "/" + this.denominator);
    }
}
public class Tong_Phan_So {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Phan_So A = new Phan_So();
        Phan_So B = new Phan_So();
        A.input(sc);
        B.input(sc);
        Phan_So res = new Phan_So();
        res.Calculate(A, B);
    }
    
}
