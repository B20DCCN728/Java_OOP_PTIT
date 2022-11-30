//Created by Campus
package liet_ke_nhan_vien_theo_nhom;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class NhanVien implements Comparable<NhanVien> {
    private String chucVu, heSoLuong, soHieu, name;
    static int gd = 0, tp = 0, pp = 0;
    public NhanVien(String chucVu, String heSoLuong, String soHieu, String name){
        if(chucVu.equals("GD")){
            if(gd < 1){
                gd += 1;
                this.chucVu = chucVu;
            }
            else this.chucVu = "NV";
        }
        else if(chucVu.equals("TP")){
            if(tp < 3){
                tp += 1;
                this.chucVu = chucVu;
            }
            else this.chucVu = "NV";
        }
        else if(chucVu.equals("PP")){
            if(pp < 3){
                pp += 1;
                this.chucVu = chucVu;
            }
            else this.chucVu = "NV";
        }
        else this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.soHieu = soHieu;
        this.name = name;
    }
    public String getChucVu(){
        return chucVu;
    }
    @Override
    public int compareTo(NhanVien s){
        int x = Integer.parseInt(s.heSoLuong) - Integer.parseInt(this.heSoLuong);
        if(x != 0) return x;
        return Integer.parseInt(this.soHieu) - Integer.parseInt(s.soHieu);
    }
    @Override
    public String toString(){
        return name + " " + chucVu + " " + soHieu + " " + heSoLuong;
    }
}

//
public class Liet_Ke_Nhan_Vien_Theo_Nhom {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String s = sc.nextLine();
            String chucVu = s.substring(0, 2);
            String heSoLuong = s.substring(2, 4);
            String soHieu = s.substring(4, 7);
            String name = s.substring(8);
            solve.add(new NhanVien(chucVu, heSoLuong, soHieu, name));
        }
        Collections.sort(solve);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String check = sc.nextLine();
            for(NhanVien x: solve){
                if(x.getChucVu().equals(check)){
                    System.out.println(x);
                }
            }
            System.out.println();
        }
    }
    
}
