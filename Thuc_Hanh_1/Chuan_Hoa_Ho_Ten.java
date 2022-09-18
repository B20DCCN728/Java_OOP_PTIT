package chuan_hoa_ho_ten;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;

public class Chuan_Hoa_Ho_Ten {
    static String[] formatName(String[] solve){
        String res = "";
        for(int i = 0;i < solve.length;i++){
            res += Character.toUpperCase(solve[i].charAt(0)) + solve[i].substring(1);
            res += " ";
        }
        return res.trim().split(" ");    
    }
    
    static String format_1(String[] solve){
        String res = "";
        res += solve[solve.length - 1] + " ";
        for(int i = 0;i < solve.length - 1;i++){
            res += solve[i] + " ";
        }
        return res.trim();
    }
    
    static String format_2(String[] solve){
        String res = "";
        String r = "";
        res += solve[0];
        for(int i = 1;i < solve.length;i++){
            r += solve[i] + " ";
        }
        return r.trim() + " " + res;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            int k = Integer.parseInt(sc.nextLine().trim());
            String[] solve = sc.nextLine().toLowerCase().trim().replaceAll("\\s+", " ").split(" ");
            String[] fullName = formatName(solve);
            if(k == 1) System.out.println(format_1(fullName));
            else {
                System.out.println(format_2(fullName));
            }
        }
    }
}