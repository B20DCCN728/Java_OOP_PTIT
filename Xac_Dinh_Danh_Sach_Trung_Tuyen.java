//Created by Campus
package xac_dinh_danh_sach_trung_tuyen;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Xac_Dinh_Danh_Sach_Trung_Tuyen {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<XetTuyen> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            solve.add(new XetTuyen(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),  Double.parseDouble(sc.nextLine()),  Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(solve);
        int k = Integer.parseInt(sc.nextLine());
        double tmp = solve.get(k - 1).getTotal();
        for(XetTuyen x: solve){
            if(x.getTotal() >= tmp){
                x.setStatus("TRUNG TUYEN");
            }
            else x.setStatus("TRUOT");
        }
        System.out.println(String.format("%.1f", tmp));
        for(XetTuyen x: solve){
            System.out.println(x);
        }
    }
    
}
