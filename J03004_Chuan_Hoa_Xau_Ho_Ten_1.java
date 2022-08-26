/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuan_hoa_xau_ho_ten_1;
import java.util.*;
public class Chuan_Hoa_Xau_Ho_Ten_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String S = sc.nextLine();
            S = S.trim();
            S = S.replaceAll("\\s+", " ");
            String[] res = S.split(" ");
            String str = "";
            for(int i = 0;i < res.length;i++){
                str += String.valueOf(res[i].charAt(0)).toUpperCase() + res[i].substring(1).toLowerCase();
                if(i < res.length - 1) str += " ";
            }
            System.out.println(str);
        }
    }
    
}
