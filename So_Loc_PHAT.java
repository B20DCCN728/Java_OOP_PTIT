//Created by Campus
package so_loc_phat;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class So_Loc_PHAT {
    /**
     * @**
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            Stack<String> res = new Stack();
            q.add("6");
            q.add("8");
            int count = 0;
            while(true){
                String x = q.poll();
                if(x.length() > n) {
                    break;
                }
                count += 1;
                res.push(x);
                q.add(x + "6");
                q.add(x + "8");
            }
            System.out.println(count);
            while(!res.empty()){
                System.out.print(res.pop() + " ");
            }
            System.out.println();
        }
    }
    
}
