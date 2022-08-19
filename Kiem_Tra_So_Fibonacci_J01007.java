import java.util.Scanner;
public class Kiem_Tra_So_Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            long[] arr = new long[1500];
            arr[0] = 0;
            arr[1] = 1;
            if(n == 0 || n == 1) System.out.println("YES");
            else{
                for(int i = 2;i <= 1500;i++){
                    arr[i] = arr[i - 1] + arr[i - 2];
                    if(arr[i] == n) {
                        System.out.println("YES");
                        break;
                    }
                    else if(arr[i] > n) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            t--;
        }
    }
}
