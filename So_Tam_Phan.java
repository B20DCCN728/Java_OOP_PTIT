import java.util.Scanner;
public class So_Tam_Phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            long k = 0, ok = 1; 
            while(n > 0){
                k = n % 10;
                if(k == 1||k == 2||k == 0){
                    n /= 10;
                }
                else{
                    ok = 0;
                    break;
                }
            }
            if(ok == 1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
