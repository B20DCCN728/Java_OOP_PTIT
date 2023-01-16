//Created by Campus
package toan_lop_3;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Toan_Lop_3 {
    static boolean isCheck(String s, String prefix){
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '?') continue;
            else if (s.charAt(i) != prefix.charAt(i)) return false;
        }
        return true;
    }
    static String solve(String s){
        if(s.charAt(3) == '*'||s.charAt(3) == '/') {
            return "WRONG PROBLEM!";
        }
        for(int i = 10;i <= 99;i++){
            for(int j = 10;j <= 99;j++){
                int add = i + j;
                if(add >= 10&&add <= 99){
                    String a = String.valueOf(i) + " + " + String.valueOf(j) + " = " + String.valueOf(add);
                    if(isCheck(s, a)) return a;
                }
                int substract = i - j;
                if(substract >= 10&&substract <= 99){
                    String a = String.valueOf(i) + " - " + String.valueOf(j) + " = " + String.valueOf(substract);
                    if(isCheck(s, a)) return a;                    
                }
            }
        }
        return "WRONG PROBLEM!";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String solve = sc.nextLine();
            System.out.println(solve(solve));
        }
    }
    
}
