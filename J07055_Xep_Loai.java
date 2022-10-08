//Created by Campus
package xep_loai;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Xep_Loai {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Compare> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Compare(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Compare x: solve){
            System.out.println(x);
        }
    }
    
}                                                                              
