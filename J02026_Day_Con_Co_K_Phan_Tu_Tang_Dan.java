//Created by Campus
package day_con_co_k_phan_tu_tang_dan;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Day_Con_Co_K_Phan_Tu_Tang_Dan {
    static boolean visited[] = new boolean[16];
    static int a[] = new int[16], res[] = new int[16];
    static int n, k;
    static void out(){
        for(int i = 1;i <= k;i++){
            System.out.print(a[res[i]] + " ");
        }
        System.out.println();
    }
    static void Try(int i){
        for(int j = res[i - 1] + 1;j <= n - k + i;j++){
            res[i] = j;
            if(i == k){
                out();
            }
            else Try(i + 1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            for(int i = 1;i <= n;i++) a[i] = sc.nextInt();
            Arrays.sort(a, 1, n + 1);
            Try(1);
        }
    }
    
}
