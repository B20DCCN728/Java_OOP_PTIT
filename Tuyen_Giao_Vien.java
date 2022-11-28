//Created by Campus
package tuyen_giao_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tuyen_Giao_Vien {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> solve = new ArrayList<>();
        for(int i = 0 ;i < n;i++){
            solve.add(new GiaoVien(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(solve);
        for(GiaoVien x: solve) {
            System.out.println(x);
        }
    }
    
}
