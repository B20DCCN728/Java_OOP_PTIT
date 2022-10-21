//Created by Campus
package so_0_va_so_9;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.BlockingDeque;
//
public class So_0_Va_So_9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> solve = new ArrayDeque<>();
            solve.add("9");
            while(Integer.parseInt(solve.peek()) % n != 0){
                String res = solve.poll();
                solve.add(res + "0");
                solve.add(res + "9");
            }
            System.out.println(solve.peek());
        }
    }
    
}
/*
2
5
7
*/
