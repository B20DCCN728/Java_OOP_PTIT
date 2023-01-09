//Created by Campus
package dien_chu_so;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
public class Dien_Chu_So {
    static int isRes(String a, String b){
        int res = 0;
        for(int i = 0;i < a.length();i++){
            char x = a.charAt(i);
            char y = b.charAt(i);
            if(x != y){
                if(x == '?'){
                    res += ('9' - b.charAt(i)) * counter(i + 1, a);
                }
                else if(x > y){
                    return res + counter(i + 1, a);
                }
                else return res;
            }
        }
        return res;
    }
    static int counter(int idx, String a){
        int cnt = 1;
        for(int i = idx;i < a.length();i++){
            if(a.charAt(i) == '?'){
                cnt *= 10;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(isRes(a, b));
        }
    }
}
