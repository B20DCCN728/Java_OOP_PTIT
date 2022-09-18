package liet_ke_tu_khac_nhau_th;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
public class Liet_Ke_Tu_Khac_Nhau_TH {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        String t1 = "", t2 = "";
        while(n1-- > 0){
            t1 += sc.nextLine().toLowerCase() + " ";
        }
        String[] x = t1.trim().split(" ");
        int n2 = Integer.parseInt(sc.nextLine());
        while(n2-- > 0){
            t2 += sc.nextLine().toLowerCase() + " ";
        }
        String[] y = t2.trim().split(" ");
        TreeSet<String> s1 = new TreeSet<>(Arrays.asList(x));
        TreeSet<String> s2 = new TreeSet<>(Arrays.asList(y));
        TreeSet<String> s3 = new TreeSet<>(s1);
        s1.removeAll(s2);
        s2.removeAll(s3);
        for(String i : s1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(String i : s2) {
            System.out.print(i + " ");
        }
    }
    
}
