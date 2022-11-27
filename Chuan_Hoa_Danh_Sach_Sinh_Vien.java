//Created by Campus
package chuan_hoa_danh_sach_sinh_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Chuan_Hoa_Danh_Sach_Sinh_Vien {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<SinhVien> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            solve.add(new SinhVien(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(SinhVien x: solve){
            System.out.println(x);
        }
    }
    
}
