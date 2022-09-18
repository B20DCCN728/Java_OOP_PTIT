package nho_nhat_va_lon_nhat;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;

public class Nho_Nhat_Va_Lon_Nhat {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            TreeSet<BigInteger> set = new TreeSet<>();
            for(int i = 0;i < n;i++){
                set.add(sc.nextBigInteger());
            }
            if(set.size() == 1) System.out.println("BANG NHAU");
            else{
                System.out.println(set.first() + " " + set.last());
            }
        }
    }
    
}
