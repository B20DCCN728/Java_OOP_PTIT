//Created by Campus
package liet_ke_va_dem;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Liet_Ke_Va_Dem {
    static boolean isCheck(long n){
        String s = String.valueOf(n);
        for(int i = 1;i < s.length();i++){
            if(s.charAt(i) < s.charAt(i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashMap<Long, Integer> solve = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()){
            long n = sc.nextLong();
            if(!solve.containsKey(n)){
                if(isCheck(n)){
                    solve.put(n, 1);
                }
            }
            else {
                solve.put(n, solve.get(n) + 1);
            }
        }
        ArrayList<Map.Entry<Long, Integer>> entry = new ArrayList<Map.Entry<Long, Integer>>(solve.entrySet());
        Collections.sort(entry, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for(Map.Entry<Long, Integer> x: entry){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
    
}
