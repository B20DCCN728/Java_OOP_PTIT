/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuan_hoa_xau_ho_ten_2;
import java.util.*;
public class Chuan_Hoa_Xau_Ho_Ten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String S = sc.nextLine();
            S = S.trim();
            S = S.replaceAll("\\s+", " ");
            String[] res = S.split(" ");
            String str = "";
            int n = res.length;
            for(int i = 1;i < n;i++){
                str += String.valueOf(res[i].charAt(0)).toUpperCase() + res[i].substring(1).toLowerCase();
                if(i < n - 1) str += " ";
                else str += ", ";
            }
            str += res[0].toUpperCase();
            System.out.println(str);
        }
    }
    
}
