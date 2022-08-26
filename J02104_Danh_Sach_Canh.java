package danh_sach_canh;
import java.util.*;
public class Danh_Sach_Canh {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n  =sc.nextInt();
       int[][] matrix = new int[n + 5][n + 5];
       for(int i = 0;i < n;i++) {
           for(int j = 0;j < n;j++) matrix[i][j] = sc.nextInt();
       }
       for(int i = 0;i < n;i++){
           for(int j = i + 1;j < n;j++){
               if(matrix[i][j] == 1){
                   System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
               }
           }
       }
    }
    
}
