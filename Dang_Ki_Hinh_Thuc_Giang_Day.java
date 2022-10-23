//Created by Campus
package dang_ki_hinh_thuc_giang_day;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
public class Dang_Ki_Hinh_Thuc_Giang_Day {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Problem> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Problem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Problem x: solve){
            if(x.th.compareTo("Truc tiep") != 0) System.out.println(x);
        }
    }
    
}
