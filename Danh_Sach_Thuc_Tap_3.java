//Created by Campus
package danh_sach_thuc_tap_3;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Danh_Sach_Thuc_Tap_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sinhVien = new Scanner(new File("SINHVIEN.in"));
        Scanner doanhNghiep = new Scanner(new File("DN.in"));
        Scanner thucTap = new Scanner(new File("THUCTAP.in"));
        int n = Integer.parseInt(sinhVien.nextLine());
        HashMap<String, SinhVien> dataSinhVien = new HashMap<>();
        for(int i = 0;i < n;i++){
            SinhVien tmp = new SinhVien(sinhVien.nextLine(), sinhVien.nextLine(), sinhVien.nextLine(), sinhVien.nextLine());
            dataSinhVien.put(tmp.getCode(), tmp);
        }
        n = Integer.parseInt(doanhNghiep.nextLine());
        HashMap<String, DoanhNghiep> dataDoanhNghiep = new HashMap<>();
        for(int i = 0;i < n;i++){
             DoanhNghiep cmp = new DoanhNghiep(doanhNghiep.nextLine(), doanhNghiep.nextLine(), Integer.parseInt(doanhNghiep.nextLine()));
             dataDoanhNghiep.put(cmp.getCode(), cmp);
        }
        TreeMap<String, String> dataThucTap = new TreeMap<>();
        n = Integer.parseInt(thucTap.nextLine());
        for(int i = 0;i < n;i++){
            String data[] = thucTap.nextLine().split(" ");
            dataThucTap.put(data[0], data[1]);
        }
        for(Map.Entry<String, String> entry: dataThucTap.entrySet()){
            DoanhNghiep ht = dataDoanhNghiep.get(entry.getValue());
            if(ht.getSoLuong() < ht.getTuyenDung()){
                dataDoanhNghiep.get(entry.getValue()).setSoLuong(ht.getSoLuong() + 1, dataSinhVien.get(entry.getKey()));
            }
        }
        n = Integer.parseInt(thucTap.nextLine());
        for(int i = 0;i< n;i++){
            String x = thucTap.nextLine();
            dataDoanhNghiep.get(x).danhSachTuyenDung();
        }
    }
    
}
