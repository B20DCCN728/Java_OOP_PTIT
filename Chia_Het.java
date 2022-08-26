package chia_het;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Chia_Het {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger num_1 = sc.nextBigInteger();
            BigInteger num_2 = sc.nextBigInteger();
            if(num_1.compareTo(num_2) == 1) {
                if(num_1.mod(num_2).equals(BigInteger.ZERO)) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if(num_2.mod(num_1).equals(BigInteger.ZERO)) System.out.println("YES"); 
                else System.out.println("NO");
            }
        }
    }
    
}
