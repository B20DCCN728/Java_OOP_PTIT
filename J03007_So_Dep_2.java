/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_dep_2;
import java.util.*;
public class So_Dep_2 {
    static boolean check(String num){
        int n = num.length();
        if(num.charAt(0) != num.charAt(n - 1) || num.charAt(0) != '8') return false;
        String re_num = "";
        int res = 0;
        for(int i = 0;i < n;i++){
            re_num = num.charAt(i) + re_num;
            res += (int)(num.charAt(i));
        }
        if(re_num.equals(num) == true&&res % 10 == 0) return true;
        else return false; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String num = sc.next();
            if(check(num) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
