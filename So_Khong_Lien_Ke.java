import java.util.Scanner;
import java.lang.Math;
public class So_Khong_Lien_Ke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long sum = 0;
            long n = sc.nextLong();
            long first = 0;
            long second = 0;
            first = n % 10; 
            sum += first;
            n /= 10;
            int ok = 1;
            while(n > 0){
                second = first;
                first = n % 10;
                sum += first;
                if(Math.abs(first - second) != 2) {
                    ok = 0;
                    break;
                }
                n /= 10;
            }
            if(ok == 1 && sum % 10 == 0) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
