package liet_ke_to_hop;
import java.util.*;
public class Liet_Ke_To_Hop {
    static int n, k, res = 0;
    static int[] arr = new int[10005];
    static void Try(int i){
        for(int j = arr[i - 1] + 1;j <= n;j++){
            arr[i] = j;
            if(i == k) {
                for(int x = 1;x <= k;x++) System.out.print(arr[x] + " ");
                System.out.println();
                res++;
            }
            else Try(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("Tong cong co " + res + " to hop");
    }
    
}
