//Created by Campus
package xep_hang;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Xep_Hang {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        TreeMap<Integer, Integer> solve = new TreeMap<>();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(solve.containsKey(x)){
                //có thể có vài người đến cùng lúc nên cộng thêm 
                y += solve.get(x);
            }
            solve.put(x, y);
        }
        int time = 0;
        for(Map.Entry<Integer, Integer> it: solve.entrySet()){
            if(time < it.getKey()) time = it.getKey();
            time += it.getValue();
        }
        System.out.println(time);
    }
    
}
