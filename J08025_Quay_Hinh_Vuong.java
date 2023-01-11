//Created by Campus
package quay_hinh_vuong;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
public class Quay_Hinh_Vuong {
    final static int [] leftSide = {3, 0, 2, 4, 1, 5};
    final static int [] rightSide = {0, 4, 1, 3, 5, 2};
    static boolean isEqual(String a, String b){
        for(int i = 0;i < a.length();i++){
            if(a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    static String routingLeftSide(String a){
        String l = "";
        for(int i = 0;i < a.length();i++){
            l += a.charAt(leftSide[i]);
        }
        return l;
    }
    static String routingRightSide(String a){
        String l = "";
        for(int i = 0;i < a.length();i++){
            l += a.charAt(rightSide[i]);
        }
        return l;        
    }
    static int counter(String a, String b){
        Queue<String> q = new LinkedList<>();
        HashMap<String, Integer> count = new HashMap<>();
        q.add(a);
        count.put(a, 0);
        String mp = q.peek();
        if(isEqual(mp, b)){
            return count.get(mp);
        }        
        while(!q.isEmpty()){
            String tmp = q.poll();
            int cnt = count.get(tmp);
            String routeLeft = routingLeftSide(tmp);
            if(isEqual(routeLeft, b)){
                return cnt + 1;
            }
            q.add(routeLeft);
            count.put(routeLeft, cnt + 1);
            String routeRight = routingRightSide(tmp);
            if(isEqual(routeRight, b)){
                return cnt + 1;
            }
            q.add(routeRight);
            count.put(routeRight, cnt + 1);            
        }
        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = "", b = "";
            for(String x: sc.nextLine().split(" ")){
                a += x;
            }
            for(String x: sc.nextLine().split(" ")){
                b += x;
            }
            System.out.println(counter(a, b));
         }
    }
    
}
