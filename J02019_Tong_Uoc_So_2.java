//Created by Campus
package tong_uoc_so_2;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Tong_Uoc_So_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [] era = new int[m + 1];
        for(int i = 2;i <= m;i++){
            for(int j = 2 * i;j <= m;j += i){
                era[j] += i;
            }
        }
        int res = 0;
        for(int i = n;i <= m;i++){
            if(era[i] + 1 > i) res += 1;
        }
        System.out.println(res);
    }
    
}
