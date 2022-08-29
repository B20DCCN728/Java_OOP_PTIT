package phan_so;
import java.util.*;
import java.lang.*;
import java.text.*;
class Solve{
    private long numerator;
    private long denominator;
    protected Solve(Scanner sc){
        this.numerator = sc.nextLong();
        this.denominator = sc.nextLong();
    }
    protected long GetNum(){
        return this.numerator;
    }
    protected long GetDen(){
        return this.denominator;
    }
}
public class Phan_So {
    static long Gcd(long a, long b){
        if(b == 0) return a;
        return Gcd(b, a % b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Solve solve = new Solve(sc);
        long GCD = Gcd(solve.GetNum(), solve.GetDen());
        System.out.println(solve.GetNum() / GCD + "/" + solve.GetDen() / GCD);
    }   
}
