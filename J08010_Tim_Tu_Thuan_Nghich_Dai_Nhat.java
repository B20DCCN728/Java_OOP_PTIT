//Created by Campus
package tim_tu_thuan_nghich_dai_nhat;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tim_Tu_Thuan_Nghich_Dai_Nhat {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> solve = new LinkedHashMap<>();
        int m = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(s.equals(new StringBuilder(s).reverse().toString())){
                m = Math.max(m, s.length());
                if(solve.containsKey(s)){
                    solve.put(s, solve.get(s) + 1);
                }
                else {
                    solve.put(s, 1);
                }
            }
        }
        for(String x: solve.keySet()){
            if(x.length() == m) System.out.println(x + " " + solve.get(x));
        }
    }
}
