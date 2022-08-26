package matran_nhi_phan;
import java.util.*;
public class Matran_Nhi_Phan {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n + 1][4];
        int res = 0;
        for(int i = 0;i < n;i++){
            int res_1 = 0;
            int res_0 = 0;
            for(int j = 0;j < 3;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1) res_1++;
                else res_0++;
            }
            if(res_1 > res_0) res++;
        }
        System.out.println(res);
    }
    
}
