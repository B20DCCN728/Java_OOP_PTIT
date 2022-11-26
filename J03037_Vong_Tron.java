//Created by Campus
package vong_tron;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Vong_Tron {
    //Building Code
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int pos[] = new int[26];
        int cnt[] = new int[26];
        Arrays.fill(pos, -1);
        Arrays.fill(cnt, 0);
        int res = 0;
        for(int i = 0;i < s.length();i++){
            int tmp = s.charAt(i) - 'A';
            if(pos[tmp] == -1){
                pos[tmp] = i;
                cnt[tmp]++;
                continue;
            }
            for(int j = pos[tmp] + 1;j < i;j++){
                if(cnt[s.charAt(j) - 'A'] == 1) res += 1;
            }
            cnt[tmp]++;
        }
        System.out.println(res);
    }
    
}
