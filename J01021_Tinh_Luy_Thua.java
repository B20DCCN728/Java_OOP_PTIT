import java.util.Scanner;

public class Tinh_Luy_Thua {

    static int mod = (int)1e9 + 7;

    static long Pow_2(long a, long b){
        if(b == 1) return a;
        long  k = Pow_2(a, b / 2);
        if(b % 2 == 1) return (((k * k) % mod) * a) % mod;
        else return (k * k) % mod; // <--- MLE =))
    }
    static long Pow(long a, long b){
        long res = 1;
        while(b > 0){
            if(b % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a, b;
        while(true)
        {
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 && b == 0)
                break;
            System.out.println(Pow(a, b));
        }
    }
}
