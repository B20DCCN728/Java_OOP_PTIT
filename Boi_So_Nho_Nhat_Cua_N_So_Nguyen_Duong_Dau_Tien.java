package boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien;

import java.math.BigInteger;
import java.util.*;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class Boi_So_Nho_Nhat_Cua_N_So_Nguyen_Duong_Dau_Tien {
    static Long GCD(Long a, Long b){
        BigInteger m = BigInteger.valueOf(a);
        BigInteger n = BigInteger.valueOf(b);
        BigInteger gcd = m.gcd(n);
        return gcd.longValue();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Long n = sc.nextLong();
            Long res = 1L;
            for(Long i = 1L;i <= n;i++){
                res = i * res / GCD(res, i);
            }
            System.out.println(res);
        }
    }
    
}
