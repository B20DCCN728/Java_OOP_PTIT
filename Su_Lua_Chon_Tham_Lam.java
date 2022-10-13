//Created by Campus
package su_lua_chon_tham_lam;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Su_Lua_Chon_Tham_Lam {
    static String getMax(int n, int s){
        String res = "";
        for(int i = 0;i < n;i++){
            if(s >= 9){
                res += '9';
                s -= 9;
            }
            else{
                res += String.valueOf(s);
                s = 0;
            }
        }
        return res;
    }
    static String getMin(int n, int s){
        String res = "";
        for(int i = 0;i < n;i++){
            if(s > 9){
                res = '9' + res;
                s -= 9;
            }
            else {
                if(i == n - 1){
                    if(s == 0) res = '1' + res;
                    else res = String.valueOf(s) + res;
                }
                else {
                    if(s == 0) res = '0' + res;
                    else {
                        res = String.valueOf(s - 1) + res;
                        s = 0;
                    }
                }
            }
        }
        return res;
    }
    static String getMaz(int n, int s){
        String res = "";
        for(int i = 0;i < n;i++){
            if(s > 9){
                res += '9';
                s -= 9;
            }
            else {
                res += String.valueOf(s);
                s = 0;
            }
        }
        return res;
    }
    static String getMiz(int n, int s){
        String res = "";
        for(int i = 0;i < n;i++){
            if(s > 9){
                res = '9' + res;
                s -= 9;
            }
            else {
                if(i == n - 1){
                    if(s == 0) res = '1' + res;
                    else {
                        res = String.valueOf(s) + res;
                    }
                }
                else {
                    if(s == 0) res = '0' + res;
                    else{
                        res = String.valueOf(s - 1) + res;
                        s = 0;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] solve = sc.nextLine().split(" ");
        int n = Integer.parseInt(solve[0]);
        int s = Integer.parseInt(solve[1]);
        if(n < 2||s < 2||s >= 9 * n) System.out.println("-1 -1");
        else{
            String max = getMax(n, s);
            String min = getMin(n, s);
            System.out.println(min + " " + max);
        }
    }

}
