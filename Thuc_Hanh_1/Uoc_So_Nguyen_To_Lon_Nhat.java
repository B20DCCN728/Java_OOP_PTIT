package uoc_so_nguyen_to_lon_nhat;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
public class Uoc_So_Nguyen_To_Lon_Nhat {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            long n = sc.nextLong();
            long res = 0;
            for(long i = 2; i <= Math.sqrt(n);i++){
                while(n % i == 0){
                    while(n % i == 0){
                        res = i;
                        n /= i;
                    }
                }
            }
            if(n > 1) res = n;
            System.out.println(res);
        }
    }
    
}
