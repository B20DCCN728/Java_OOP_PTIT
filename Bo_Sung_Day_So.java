package bo_sung_day_so;
import java.util.*;
public class Bo_Sung_Day_So {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 5];
        int ok = 1;
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            if(i == 0){
                if(arr[i] > 1){
                    ok = 0;
                    for(int j = 1;j < arr[i];j++) System.out.println(j);
                }
            }
            else {
                if(arr[i] != arr[i - 1] + 1) {
                    for(int j = arr[i - 1] + 1;j < arr[i];j++) System.out.println(j);
                    ok = 0;
                }
            }
        }
        if(ok == 1) System.out.println("Excellent!");
     }
    
}
