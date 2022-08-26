/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boi_chung_nho_nhat;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Boi_Chung_Nho_Nhat {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger input_1 = sc.nextBigInteger();
            BigInteger input_2 = sc.nextBigInteger();
            BigInteger res = input_1.gcd(input_2);
            res = input_1.multiply(input_   2).divide(res);
            System.out.println(res);
        }
    }
    
}
