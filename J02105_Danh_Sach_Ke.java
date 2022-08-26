package danh_sach_ke;
import java.util.*;
public class Danh_Sach_Ke {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n + 1][n + 1];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++) matrix[i][j] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            System.out.print("List(" + (i + 1) + ") = ");
            for(int j = 0;j < n;j++){
                if(matrix[i][j] == 1){
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println();
        }
    }
    
}
