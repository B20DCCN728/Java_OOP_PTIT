package hinh_chu_nhat_lon_nhat;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Hinh_Chu_Nhat_Lon_Nhat {
    static long Area(long [] a, int n){
        Stack<Integer> q = new Stack<>();
        long max_area = 0;
        int i = 0;
        while(i < n){
            if(q.empty()||a[q.peek()] <= a[i]){
                q.push(i++);
            }
            else {
                int tmp = q.pop();
                long current_max = a[tmp] * (q.empty() ? i: i - q.peek() - 1);
                max_area = Math.max(current_max, max_area);
            }
        }
        while(!q.empty()){
            int tmp = q.pop();
            long current_max = a[tmp] * (q.empty() ? i: i - q.peek() - 1);
            max_area = Math.max(current_max, max_area);
        }
        return max_area;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0;i < n;i++) a[i] = sc.nextLong();
            long res = Area(a, n);
            System.out.println(res);
        }
    } 
}
