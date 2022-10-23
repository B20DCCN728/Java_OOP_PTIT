//Created by Campus
package chia_het_cho_11;
//
import java.util.*;
import java.lang.*;
import java.math.*;
//
public class Chia_Het_Cho_11 {
    static long Mod(String solve){
        long mod = 0, tmp;
        for(int i = 0;i < solve.length();i++){
            mod = (mod * 10 + solve.charAt(i) - '0') % 11; 
        }
        return mod;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String solve = sc.nextLine();
            if(Mod(solve) == 0) System.out.println("1");
            else System.out.println("0");
        }
    }
    
}
