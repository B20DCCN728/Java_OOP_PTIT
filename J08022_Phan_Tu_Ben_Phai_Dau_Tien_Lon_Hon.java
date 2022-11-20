//Created by Campus
package phan_tu_ben_phai_dau_tien_lon_hon;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Phan_Tu_Ben_Phai_Dau_Tien_Lon_Hon {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0;i < n;i++) a[i] = sc.nextLong();
            Stack<Integer> q = new Stack<>();
            long res[] = new long[n];
            for(int i = n - 1;i >= 0;i--){
                while(!q.empty()&&a[i] >= a[q.peek()]) q.pop();
                if(q.empty()){
                    res[i] = -1L;
                }
                else{
                    res[i] = a[q.peek()];
                }
                q.push(i);
            }
            for(int i = 0;i < n;i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
    
}
