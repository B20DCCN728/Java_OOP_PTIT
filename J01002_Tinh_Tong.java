import java.util.Scanner;

public class Tinh_Tong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
                long s;
                s = n * (n + 1) / 2;
                System.out.println(s);
                t--;
        }
    }
}
