//Created by Cmapus
package quan_li_bai_tap_nhom;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class SinhVien implements Comparable<SinhVien>{
    private String code, name, phoneNumber, homeWork;
    private int gr;
    public SinhVien(String code, String name, String phoneNumber){
        this.code = code;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void setHomeWork(int gr, String homeWork){
        this.homeWork = homeWork;
        this.gr = gr;
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
        return code + " " + name + " " + phoneNumber + " " + gr + " " + homeWork;
    }
}

//
public class Quan_Li_Bai_Tap_Nhom {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner bt = new Scanner(new File("BAITAP.in"));
        Scanner gr = new Scanner(new File("NHOM.in"));
        TreeMap<String, SinhVien> sinhVien = new TreeMap<>();
        int n = Integer.parseInt(sv.nextLine());
        for(int i = 0;i < n;i++){
            SinhVien tmp = new SinhVien(sv.nextLine(), sv.nextLine(), sv.nextLine());
            sinhVien.put(tmp.getCode(), tmp);
        }
        int t = Integer.parseInt(bt.nextLine());
        ArrayList<String> baiTap = new ArrayList<>();
        for(int i = 0;i < t;i++){
            baiTap.add(bt.nextLine());
        }
        
        for(int i = 0;i < n;i++){
            String data[] = gr.nextLine().split(" ");
            sinhVien.get(data[0]).setHomeWork(Integer.parseInt(data[1]), baiTap.get(Integer.parseInt(data[1]) - 1));
        }
        for(Map.Entry<String, SinhVien> entry: sinhVien.entrySet()){
            System.out.println(entry.getValue());
        }
    }
    
}
