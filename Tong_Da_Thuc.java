//Created by Campus
package tong_da_thuc;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Tong_Da_Thuc {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = Integer.parseInt(sc.nextLine());
            while(t-->0){
                DaThuc p = new DaThuc(sc.nextLine());
                DaThuc q = new DaThuc(sc.nextLine());
                DaThuc r = p.cong(q);
                System.out.println(r);
            }
        }
}
