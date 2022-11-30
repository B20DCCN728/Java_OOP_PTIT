//Created by Campus
package dao_dau;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Dao_Dau {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int n = sc.nextInt(), k = sc.nextInt();
        for(int i = 0;i < n;i++){
            q.add(sc.nextInt());
        }
        while(k-- > 0){
            int tmp = -q.poll();
            q.add(tmp);
        }
        long res = 0;
        while(!q.isEmpty()){
            res += q.poll();
        }
        System.out.println(res);
    }
    
}
