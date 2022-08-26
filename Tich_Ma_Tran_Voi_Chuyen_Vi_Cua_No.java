package tich_ma_tran_voi_chuyen_vi_cua_no;
import java.util.*;
import java.lang.*;
public class Tich_Ma_Tran_Voi_Chuyen_Vi_Cua_No{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 0;
        while(t-- > 0){
            k++;
            System.out.println("Test " + (k) + ":");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n + 5][m + 5];
            int[][] trans_matrix = new int[m + 5][ n + 5];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++) {
                    matrix[i][j] = sc.nextInt();
                    trans_matrix[j][i] = matrix[i][j];
                }
            }
            int[][] res = new int[m + 5][m + 5];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    res[i][j] = 0;
                    for(int x = 0;x < m;x++){
                        res[i][j] += matrix[i][x] * trans_matrix[x][j];
                    }
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
