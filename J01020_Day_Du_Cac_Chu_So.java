//Created by Campus
package day_du_cac_chu_so;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Day_Du_Cac_Chu_So {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n == 0) System.out.println("Impossible");
            else {
                HashSet<Character> solve = new HashSet<>();
                for(int i = 1;i <= 100;i++){
                    String tmp = String.valueOf(n * i);
                    for(int j = 0;j < tmp.length();j++){
                        solve.add(tmp.charAt(j));
                    }
                    if(solve.size() == 10) {
                        System.out.println(n * i);
                        break;
                    }
                }
            }
        }
    }
    
}
