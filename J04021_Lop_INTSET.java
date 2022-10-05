//Created by Campus
package lop_intset;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class IntSet {
    private int[] solve;
    public IntSet(int[] solve){
        this.solve = solve;
    }
    //
    public IntSet union(IntSet s){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i < this.solve.length;i++) set.add(this.solve[i]);
        for(int i = 0;i < s.solve.length;i++) set.add(s.solve[i]);
        int[] data = new int[set.size()];
        int k = 0;
        for(Integer x: set){
            data[k] = x;
            k += 1;
        }
        IntSet res = new IntSet(data);
        return res;
    }
    //
    @Override
    public String toString(){
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0;i < this.solve.length;i++){
            res.add(String.valueOf(this.solve[i]));
        }
        return "".join(" ", res);
    }
    //
}

//
public class Lop_INTSET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }  
}
