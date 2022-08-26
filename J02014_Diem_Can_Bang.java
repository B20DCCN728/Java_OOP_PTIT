/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diem_can_bang;
import java.lang.Math;
import java.util.*;
public class Diem_Can_Bang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[100001];
            int res = 0;
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
                res += arr[i];
            }
            int ok = 1;
            res -= arr[0];
            int current_res = 0;
            for(int i = 1;i < n - 1;i++){
                current_res += arr[i - 1];
                res -= arr[i];
                if(current_res == res){
                    System.out.println(i + 1);
                    ok = 0;
                    break;
                }
            }
            if(ok == 1) System.out.println(-1);
        }
    }
    
}
