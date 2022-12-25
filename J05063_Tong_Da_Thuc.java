//Created by Campus
package tong_da_thuc;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class DaThuc {
    private String s;
    public DaThuc(String s){
        this.s = s;
    }
    public DaThuc cong(DaThuc tmp){
        DaThuc res = new DaThuc("");
        TreeMap<Integer, Integer> q = new TreeMap<>();
        String [] s_1 = s.split("[*x^ +]+");
        String [] s_2 = tmp.s.split("[*x^ +]+");
        for(int i = 1 ;i < s_1.length;i += 2){
            q.put(Integer.parseInt(s_1[i]), Integer.parseInt(s_1[i - 1]));
        }
        for(int i = 1;i < s_2.length;i += 2){
            int keys = Integer.parseInt(s_2[i]), values = Integer.parseInt(s_2[i - 1]);
            if(q.containsKey(keys)){
                q.put(keys, q.get(keys) + values);
            }
            else {
                q.put(keys, values);
            }
        } 
        String a = "";
        for(Map.Entry<Integer, Integer> entry: q.entrySet()){
            a = String.valueOf(entry.getValue()) + "*x^" + String.valueOf(entry.getKey()) + " + " + a;
        }
        a = a.substring(0, a.length() - 3);
        res.s += a;
        return res;
    }
    @Override
    public String toString(){
        return "" + s;
    }
}

//
public class Tong_Da_Thuc {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = Integer.parseInt(sc.nextLine());
            while(t-->0){
                DaThuc p = new DaThuc(sc.nextLine());
                DaThuc q = new DaThuc(sc.nextLine());
                DaThuc r = p.cong(q);
                System.out.println(r);
            }
        }
}
