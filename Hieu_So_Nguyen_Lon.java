/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hieu_so_nguyen_lon;
import java.math.*;
import java.util.*;
import java.lang.*;
public class Hieu_So_Nguyen_Lon {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s_1 = sc.next();
            String s_2 = sc.next();
            BigInteger num_1 = new BigInteger(s_1);
            BigInteger num_2 = new BigInteger(s_2);
            BigInteger res = num_1.subtract(num_2).abs();
            String ans = res.toString();
            if(ans.length() < Math.max(s_1.length(), s_2.length())){
                ans = '0' + ans;
            }
            System.out.println(ans);
        }
    }
    
}
