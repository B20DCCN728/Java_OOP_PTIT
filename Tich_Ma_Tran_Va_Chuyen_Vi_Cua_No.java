///Created by Campus
package tich_ma_tran_va_chuyen_vi_cua_no;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tich_Ma_Tran_Va_Chuyen_Vi_Cua_No {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                 int n = sc.nextInt(), m = sc.nextInt();
                 Matrix a = new Matrix(n,m);
                 a.nextMatrix(sc);
                 Matrix b = a.trans();
                 System.out.println(a.mul(b));
            }
        }
}
