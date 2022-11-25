//Created by Campus
package khoang_cach_nho_hon_k;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Khoang_Cach_Nho_Hon_K {
    static int Lower_Bound(int a[], int l, int r, int k){
        int res = -1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] < k) {
                res = m;
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return res;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i < n;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            long res = 0;
            for(int i = 0;i < n - 1;i++){
                int val = a[i] + k;
                int x = Lower_Bound(a, i + 1, n - 1, val);
                if(x != -1) res += x - i;
            }
            System.out.println(res);
        }
    }
    
}
