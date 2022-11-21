//Created by Campus
package dau_tu_chung_khoan;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Dau_Tu_Chung_Khoan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            int res[] = new int[n + 1];
            for(int i = 1;i <= n;i++) a[i] = sc.nextInt();
            Stack<Integer> q = new Stack<>();
            for(int i = 1;i <= n;i++){
                while(!q.empty()&&a[i] >= a[q.peek()]) q.pop();
                if(q.empty()) res[i] = i;
                else {
                    res[i] = i - q.peek();
                }
                q.push(i);
            }
            for(int i = 1;i <= n;i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
    
}
