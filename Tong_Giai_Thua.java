import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Tong_Giai_Thua {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long currentSum = 1;
        long Sum = 0;
        for(long i = 1;i <= n;i++){
            currentSum *= i;
            Sum += currentSum;
        }
        System.out.println(Sum);
    }
}
