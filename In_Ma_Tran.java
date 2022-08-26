package in_ma_tran;
import java.util.*;
public class In_Ma_Tran {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] arr = new int[105][105];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++) arr[i][j] = sc.nextInt();
            }
            for(int i = 0;i < n;i++){
                if(i % 2 == 0){
                    for(int j = 0;j < n;j++) System.out.print(arr[i][j] + " ");
                }
                else {
                    for(int j = n - 1;j >= 0;j--) System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
}
