//Created by Campus
package tim_so_du;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tim_So_Du {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int mod = 0;
            for(int i = 0;i < s.length();i++){
                mod = (mod * 10 + s.charAt(i) - '0') % 4;
            }
            if(mod == 0) System.out.println("4");
            else System.out.println("0");
        }
    }
    
}
