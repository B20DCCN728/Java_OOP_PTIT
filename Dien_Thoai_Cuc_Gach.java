package dien_thoai_cuc_gach;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
public class Dien_Thoai_Cuc_Gach {
    static boolean isCheck(String solve){
        int n = solve.length();
        solve = solve.toLowerCase();
        String res = "";
        for(int i = 0;i < n;i++){
            char x = solve.charAt(i);
            if(x == 'a'||x == 'b'||x == 'c') 
                res += '2';
            if(x == 'd'||x == 'e'||x == 'f') 
                res += '3';
            if(x == 'g'||x == 'h'||x == 'i') 
                res += '4';
            if(x == 'j'||x == 'k'||x == 'l') 
                res += '5';
            if(x == 'm'||x == 'n'||x == 'o') 
                res += '6';
            if(x == 'p'||x == 'q'||x == 'r'||x == 's') 
                res += '7';
            if(x == 't'||x == 'u'||x == 'v') 
                res += '8';
            if(x == 'w'||x == 'x'||x == 'y'||x == 'z') 
                res += '9';
        }
        n = res.length();
        for(int i = 0;i < n / 2;i++){
            if(res.charAt(i) != res.charAt(n - i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String solve = sc.next();
            if(isCheck(solve)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
