//Created by Campus
package so_la_ma;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class So_La_Ma {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String solve = sc.nextLine();
            int res = 0;
            for(int i = 0;i < solve.length();i++){
                if(solve.charAt(i) == 'I'){
                    if(i + 1 < solve.length()&&(solve.charAt(i + 1) == 'V'||solve.charAt(i + 1) == 'X')){
                        res -= 1;
                    }
                    else {
                        res += 1;
                    }
                }
                else if(solve.charAt(i) == 'X'){
                    if(i + 1 < solve.length()&&(solve.charAt(i + 1) == 'L'||solve.charAt(i + 1) == 'C')){
                        res -= 10;
                    }
                    else {
                        res += 10;
                    }                    
                }
                else if(solve.charAt(i) == 'C'){
                    if(i + 1 < solve.length()&&(solve.charAt(i + 1) == 'M'||solve.charAt(i + 1) == 'D')){
                        res -= 100;
                    }
                    else {
                        res += 100;
                    }                   
                }
                else if(solve.charAt(i) == 'D') res += 500;
                else if(solve.charAt(i) == 'M') res += 1000;
                else if(solve.charAt(i) == 'L') res += 50;
                else res += 5;
            }
            System.out.println(res);
        }
    }
    
}
