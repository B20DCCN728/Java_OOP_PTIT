import java.util.Scanner;

public class Cat_Doi {
    public static void Show(long n){
        long k = 0, count = 1;
        long res = 0;
        while(n > 0){
            k = n % 10;
            if(k == 0||k == 8||k == 9){
                res += 0 * count;
            }
            else if(k == 1) {
                res += 1 * count;
            }
            else {
                System.out.println("INVALID");
                return;
            }
            count *= 10;
            n /= 10;
        }
        if(res == 0) System.out.println("INVALID");
        else System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            Show(n);
            t--;
        }
    }
    
}
