//Created by Campus
package ma_tran_xoan_oc_tang_dan_real;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Ma_Tran_Xoan_Oc_Tang_Dan_real {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n * n];
        for(int i = 0;i < n * n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a); 
        int f[][] = new int[n][n], t = 0, r = n, l = 0, b = n, id = 0;
        while(id < n * n){
            for(int i = l;i < r;i++) f[t][i] = a[id++];
            t++;
            for(int i = t;i < b;i++) f[i][r - 1] = a[id++];
            r--;
            for(int i = r - 1;i >= l;i--) f[b - 1][i] = a[id++];
            b--;
            for(int i = b - 1;i >= t;i--) f[i][l] = a[id++];
            l++;
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++) {
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
