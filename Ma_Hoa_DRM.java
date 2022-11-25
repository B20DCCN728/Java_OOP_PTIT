//Created by Campus
package ma_hoa_drm;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Ma_Hoa_DRM {
    static int Distance(String s){
        int sum = 0;
        for(int i = 0;i < s.length();i++) {
            sum += s.charAt(i) - 'A';
        }
        while(sum > 26) sum -= 26;
        return sum;
    }
    static Character Route(char x, int k){
        int m = x - 'A' + k;
        if(m <= 25) return (char)(x + k);
        else {
            return (char)(m - 26 + 'A');
        }
    }
    static String EnCode(String s, int k){
        String enCode = "";
        for(int i = 0;i < s.length();i++){
            enCode += Route(s.charAt(i), k);
        }
        return enCode;
    }
    static String DRM(String s_1, int d_1, String s_2, int d_2){
        String val_1 = EnCode(s_1, d_1);
        String val_2 = EnCode(s_2, d_2);
        String res = "";
        for(int i = 0;i < val_1.length();i++){
            res += Route(val_1.charAt(i), val_2.charAt(i) - 'A');
        }
        return res;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String solve = sc.nextLine();
            String s_1 = solve.substring(0, solve.length() / 2);
            String s_2 = solve.substring(solve.length() / 2);
            int d_1 = Distance(s_1), d_2 = Distance(s_2);
            System.out.println(DRM(s_1, d_1, s_2, d_2));
        }
    }
    
}
