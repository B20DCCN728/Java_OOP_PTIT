package tach_doi_va_tinh_tong;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;
import java.math.*;

public class Tach_Doi_Va_Tinh_Tong {
    /**
     * @CampusETH
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger a = sc.nextBigInteger();
        while(true){
            String solve = a.toString();
            if(solve.length() == 1) break;
            int n = solve.length();
            String s1 = solve.substring(0, n / 2);
            String s2 = solve.substring(n / 2);
            BigInteger a1 = new BigInteger(s1);
            BigInteger a2 = new BigInteger(s2);
            a = a1.add(a2);
            System.out.println(a);
        }
        //sc.close();
    }
    
}
