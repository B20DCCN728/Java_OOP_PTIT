///Created by Campus
package tich_ma_tran_va_chuyen_vi_cua_no;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Matrix {
    private int[][] otp;
    private int n, m;
    public Matrix(int [][] otp, int n, int m){
        this.otp = otp;
        this.n = n;
        this.m = m;
    }
    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
    }
    public void nextMatrix(Scanner sc){
        this.otp = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                this.otp[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix trans(){
        int res[][] = new int[m][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                res[j][i] = otp[i][j];
            }
        }
        Matrix dp = new Matrix(res, m, n);
        return dp;       
    }
    public Matrix mul(Matrix tmp){
        int res[][] = new int[n][tmp.m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < tmp.m;j++){
                int cmp = 0;
                for(int k = 0;k < m;k++){
                    cmp += otp[i][k] * tmp.otp[k][j];
                }
                res[i][j] = cmp;
            }
        }
        Matrix dp = new Matrix(res, n, tmp.m);
        return dp;
    }
    @Override
    public String toString(){
        String s = "";
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                s += String.valueOf(otp[i][j]) + " ";
            }
            s += "\n";
        }
        return s;
    }
}
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
