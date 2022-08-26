import java.util.Scanner;
import java.lang.Math;

public class Tinh_So_Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long[] arr = new long[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2;i <= n;i++){
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[n]);
            t--;
        }
    }
}
