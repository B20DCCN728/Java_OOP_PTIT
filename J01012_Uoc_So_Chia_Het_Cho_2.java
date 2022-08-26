import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class Uoc_So_Chia_Het_Cho_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int res = 0;
            if(n % 2 == 0) res += 1;
            for(int i = 2;i <= Math.sqrt(n);i++){
                if(n % i == 0){
                    if(i % 2 == 0) res++;
                    if((n / i) % 2 == 0) res++;
                    if (i * i == n && i % 2 == 0) res--;
                }
            }
            System.out.println(res);
            t--;
        }
    }
}
