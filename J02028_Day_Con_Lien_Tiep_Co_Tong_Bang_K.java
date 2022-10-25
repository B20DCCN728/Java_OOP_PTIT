//Created by Campus
package day_con_lien_tiep_co_tong_bang_k;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Day_Con_Lien_Tiep_Co_Tong_Bang_K {
    static long n, k, a[] = new long[100005];
    static boolean problem(){
        int tmp = 0;
        long sum = 0;
        for(int i = 0;i < n;i++){
            sum += a[i];
            while(sum > k){
                sum -= a[tmp];
                tmp++;
            }
            if(sum == k&&tmp - 1!= i) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextLong();
            k = sc.nextLong();
            for(int i = 0;i < n;i++) a[i] = sc.nextLong();
            if(problem()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
