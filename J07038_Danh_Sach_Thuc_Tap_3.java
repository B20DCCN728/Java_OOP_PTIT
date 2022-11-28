//Created by Campus
package danh_sach_thuc_tap_3;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class SinhVien implements Comparable<SinhVien>{
    private String code, name = "", group, email;
    public SinhVien(String code, String nameNotFormat, String group, String email){
        this.code = code;
        String tmp[] = nameNotFormat.trim().split("\\s+");
        for(int i = 0;i < tmp.length;i++){
            this.name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        this.name = this.name.trim();
        this.group = group;
        this.email = email;
    }
    public String getCode(){
        return code;
    }
    @Override
    public int compareTo(SinhVien s){
        return this.code.compareTo(s.code);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + group; 
    }
}
//
class DoanhNghiep {
    private String code, name;
    private int tuyenDung, soLuong = 0;
    private ArrayList<SinhVien> sinhVien = new ArrayList<>();
    public DoanhNghiep(String code, String name, int tuyenDung){
        this.code = code;
        this.name = name;
        this.tuyenDung = tuyenDung;
    }
    public int getSoLuong(){
        return this.soLuong;
    }
    public int getTuyenDung(){
        return this.tuyenDung;
    }
    public void setSoLuong(int soLuong, SinhVien a){
        this.soLuong = soLuong;
        sinhVien.add(a);
    }
    public String getCode(){
        return this.code;
    }
    public void danhSachTuyenDung(){
        System.out.println("DANH SACH THUC TAP TAI " + name + ":");
        for(int i = 0;i < sinhVien.size();i++){
            System.out.println(sinhVien.get(i));
        }
    }
}

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
