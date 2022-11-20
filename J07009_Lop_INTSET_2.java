//Created by Campus
package lop_intset_2;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Lop_INTSET_2 {
    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(new File("DATA.in"));
            int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            for(int i = 0; i<m; i++) b[i] = sc.nextInt();
            IntSet s1 = new IntSet(a);
            IntSet s2 = new IntSet(b);
            IntSet s3 = s1.intersection(s2);
            System.out.println(s3);
        }
}
