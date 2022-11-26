//Created by Campus
package uoc_so_chung_lon_nhat;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Uoc_So_Chung_Lon_Nhat {
    static int Gcd(int a, int b){
        while(a * b != 0){
            if(a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }
    static int Lcm(int a, int b){
        return (a * b) / Gcd(a, b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i < n;i++) a[i] = sc.nextInt();
            ArrayList<Integer> res = new ArrayList<>();
            res.add(a[0]);
            for(int i = 1;i < n;i++){
                res.add(Lcm(a[i], a[i - 1]));
            }
            res.add(a[n - 1]);
            for(Integer x: res){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    
}
