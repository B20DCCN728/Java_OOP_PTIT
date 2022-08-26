package uoc_chung_lon_nhat_cua_so_nguyen_lon;
import java.util.*;
public class Uoc_Chung_Lon_Nhat_Cua_So_Nguyen_Lon{
    static long convert(String S, long a){
        int n = S.length();
        long res = 0;
        for(int i = 0;i < n;i++){
            res = (res * 10) + (long)(S.charAt(i) - '0');
            res %= a;
        }
        return res;
    }
    static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            String b = sc.next();
            long res = gcd(a, convert(b, a));
            System.out.println(res);    
        }
    }
    
}
