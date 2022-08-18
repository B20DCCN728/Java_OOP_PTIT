import java.util.Scanner;
import java.text.DecimalFormat;

public class Phan_Tich_Thua_So_Nguyen_To {
    public static void Solution(int n){
        int count = 0;
        for(int i = 2;i <= n;i++){
            if(n % i == 0) {
                System.out.print((i) + "(");
                while(n % i == 0){
                    n /= i;
                    count++;
                }
                System.out.print((count) + ") ");
                count = 0;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int tUp = 1;
        while(t > 0){
            int n = sc.nextInt();
            System.out.print("Test " + (tUp) + ": ");
            Solution(n);
            tUp++;
            t--;
            System.out.println();
        }
    }
}
