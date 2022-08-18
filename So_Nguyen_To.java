import java.util.Scanner;
import java.lang.Math;

public class So_Nguyen_To {
    public static long Prime(int n){
        if(n % 2 == 0) return 0;
        for(int i = 3; i <= Math.sqrt(n);i++){
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            if(Prime(n) == 1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }   
}
