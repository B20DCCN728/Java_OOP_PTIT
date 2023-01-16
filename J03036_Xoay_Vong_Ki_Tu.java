//Created by Campus
package xoay_vong_ki_tu;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Xoay_Vong_Ki_Tu {
    static int route(String s, String prefix){
        int cnt = 0;
        for(int i = 0;i < s.length() - 1;i++){
            s = s.substring(1, s.length()) + s.charAt(0);
            cnt += 1;
            if(s.equals(prefix)) return cnt;
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0;i < n;i++){
            data.add(sc.nextLine());
        }
        int cnt_min = 1000000, ok = 0;
        for(int i = 0;i < n;i++){
            int cnt = 0;
            for(int j = 0;j < n;j++){
                if(i == j) continue;
                if(data.get(i).equals(data.get(j))) continue;
                else {
                    int route = route(data.get(j), data.get(i));
                    if(route != -1) cnt += route;
                    else {
                        ok = 1;
                        break;
                    }
                }
            }
            if(cnt < cnt_min) cnt_min = cnt;
            if(ok == 1) break;
        }
        if(ok == 0) System.out.println(cnt_min);
        else System.out.println(-1);
    }
    
}
