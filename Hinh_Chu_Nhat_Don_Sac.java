//Created by Campus
package hinh_chu_nhat_don_sac;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Hinh_Chu_Nhat_Don_Sac {
    static long getMaxArea(long [] a, int n, int m){
        Stack<Integer> q = new Stack<>();
        int i = 0;
        long final_max = 0;
        while(i < n){
            if(q.empty()||a[q.peek()] <= a[i]){
                q.push(i++);
            }
            else {
                int tmp = q.pop();
                long current_max = a[tmp] * (q.empty() ? i: i - q.peek() - 1);
                final_max = Math.max(current_max, final_max);
            }
        }
        while(!q.empty()){
            int tmp = q.pop();
            long current_max = a[tmp] * (q.empty() ? i: i - q.peek() - 1);
            final_max = Math.max(current_max, final_max);
        }
        return final_max;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long a[] = new long[n];
        long b[] = new long[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextLong();
            b[i] = (long)m - a[i];
        }  
        long res = Math.max(getMaxArea(a, n, m), getMaxArea(b, n, m));
        System.out.println(res);
    }
    
}
