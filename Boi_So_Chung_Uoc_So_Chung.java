import java.util.Scanner;
import java.text.DecimalFormat;
public class Boi_So_Chung_Uoc_So_Chung {
    public static long LCM(long a, long b, long res){
        return (a * b) / res;
    }
    public static long GCD(long a, long b){
        if(a == 0 || b == 0){
            return a + b;
        }
        while(a != b){
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long gcd = GCD(a, b);
            System.out.println(LCM(a, b, gcd) + " " + gcd);
            t--;
        }
    }
}
