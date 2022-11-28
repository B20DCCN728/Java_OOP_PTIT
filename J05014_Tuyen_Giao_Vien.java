//Created by Campus
package tuyen_giao_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class GiaoVien implements Comparable<GiaoVien>{
    static int id = 0;
    private String code = "GV", name, maXetTuyen, monHoc, trangThai;
    private double a, b, uuTien, total;
    public GiaoVien(String name, String maXetTuyen, double a, double b){
        id += 1;
        this.code += String.format("%02d", id);
        this.name = name;
        this.maXetTuyen = maXetTuyen;
        this.a = a;
        this.b = b;
        this.uuTien = this.getUuTien();
        this.monHoc = this.getMonHoc();
        this.total = this.a * 2 + this.b + this.uuTien;
        this.trangThai = this.setTrangThai();
    }
    public String setTrangThai(){
        if(total >= 18) return "TRUNG TUYEN";
        else return "LOAI";
    }
    public String getMonHoc(){
        if(maXetTuyen.charAt(0) == 'A'){
            return "TOAN";
        }
        else if(maXetTuyen.charAt(0) == 'B'){
            return "LY";
        }
        else return "HOA";
    }
    public double getUuTien(){
        if(maXetTuyen.charAt(1) == '1'){
            return 2.0;
        }
        else if(maXetTuyen.charAt(1) == '2'){
            return 1.5;
        }
        else if(maXetTuyen.charAt(1) == '3'){
            return 1.0;
        }
        else return 0.0;
    }
    @Override
    public int compareTo(GiaoVien s){
        return Double.compare(s.total, this.total);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + monHoc + " " + String.format("%.1f", total) + " " + trangThai;
    }
}

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
