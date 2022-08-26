/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hieu_so_nguyen_lon_1;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Hieu_So_Nguyen_Lon_1 {
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-- > 0){
            BigInteger s_1 = sc.nextBigInteger();
            BigInteger s_2 = sc.nextBigInteger();
            BigInteger res = s_1.subtract(s_2);
            BigInteger k = 10;
            System.out.println(res.abs());
       }
    }
    
}
