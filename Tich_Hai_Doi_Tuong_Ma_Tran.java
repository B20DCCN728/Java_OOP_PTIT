//Created by Campus
package tich_hai_doi_tuong_ma_tran;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tich_Hai_Doi_Tuong_Ma_Tran {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
           Matrix a = new Matrix(n,m);
           a.nextMatrix(sc);
           Matrix b = new Matrix(m,p);
           b.nextMatrix(sc);
           System.out.println(a.mul(b));
       }
}
