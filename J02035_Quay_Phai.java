Created by Campus
import java.util.Scanner;
public class Quay_phai {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- >0) {
            int n = s.nextInt();
            int k = 0;
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextLong();
                if(i > 0 && arr[i] < arr[i-1])
                    k = i;
            }
            System.out.println(k);
        }
    }
}
