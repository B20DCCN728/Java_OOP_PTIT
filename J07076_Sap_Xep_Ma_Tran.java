package sap_xep_ma_tran;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
public class Sap_Xep_Ma_Tran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int[][] a = new int[101][101];
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> solve = new ArrayList<>();
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++){
                    a[i][j] = sc.nextInt();
                    if(j == k - 1) solve.add(a[i][j]);
                }
            }
            int d = 0;
            Collections.sort(solve);
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++){
                    if(j == k - 1) {
                        System.out.print(solve.get(d) + " ");
                        d += 1;
                    }
                    else System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
