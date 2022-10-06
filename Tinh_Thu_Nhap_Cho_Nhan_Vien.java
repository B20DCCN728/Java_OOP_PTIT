//Created by Campus
package tinh_thu_nhap_cho_nhan_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
public class Tinh_Thu_Nhap_Cho_Nhan_Vien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Salary> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Salary(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Salary x: solve){
            System.out.println(x);
        }
    }
    
}
