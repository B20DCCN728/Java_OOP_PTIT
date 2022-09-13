package day_uu_the;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
/**
 *
 * @author PC
 */
public class Day_Uu_The {
    static boolean getEven(String[] solve){
        int even = 0;
        int odd = 0;
        for(int i = 0;i < solve.length;i++){
            if(Integer.parseInt(solve[i]) % 2 == 0){
                even++;
            }
            else odd++;
        }
        if(even > odd) return true;
        else return false;
    }
    static boolean getOdd(String[] solve){
        int even = 0;
        int odd = 0;
        for(int i = 0;i < solve.length;i++){
            if(Integer.parseInt(solve[i]) % 2 == 0){
                even++;
            }
            else odd++;
        }
        if(even < odd) return true;
        else return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String[] solve = sc.nextLine().split(" ");
            if(solve.length % 2 == 0) {
                if(getEven(solve)) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if(getOdd(solve)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    
}
