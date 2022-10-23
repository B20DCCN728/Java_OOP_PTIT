//Created by Campus
package xau_con_lon_nhat;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
public class Xau_Con_Lon_Nhat {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String solve = sc.nextLine();
        int pos = 0;
        while(pos < solve.length()){
            char max = solve.charAt(pos);
            for(int i = pos + 1;i < solve.length();i++){
                if(solve.charAt(i) > max){
                    max = solve.charAt(i);
                }
            }
            int last_pos = 0;
            for(int i = pos;i < solve.length();i++){
                if(solve.charAt(i) == max) 
                {
                    System.out.print(max);
                    last_pos = i;
                }
            }
            pos = last_pos + 1;
        }
    }
    
}
