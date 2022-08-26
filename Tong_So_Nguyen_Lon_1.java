package tong_so_nguyen_lon_1;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Tong_So_Nguyen_Lon_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger num_1 = sc.nextBigInteger();
            BigInteger num_2 = sc.nextBigInteger();
            System.out.println(num_1.add(num_2));
        }
    }
    
}
