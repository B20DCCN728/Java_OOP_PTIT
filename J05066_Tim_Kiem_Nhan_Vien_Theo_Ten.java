//Created by Campus
package tim_kiem_nhan_vien_theo_ten;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class NhanVien implements Comparable<NhanVien> {
    private String name, chucVu, soHieu, bacLuong;
    private int cSoHieu, cBacLuong;
    public NhanVien(String code, String name){
        this.name = name;
        this.chucVu = code.substring(0, 2);
        this.bacLuong = code.substring(2, 4);
        this.cBacLuong = Integer.parseInt(bacLuong);
        this.soHieu = code.substring(4);        
        this.cSoHieu = Integer.parseInt(soHieu);
        this.setChucVu();
    }
    private void setChucVu(){
        if(chucVu.equals("GD")&&Integer.parseInt(soHieu) > 1){
            this.chucVu = "NV";
        }
        else if((chucVu.equals("TP")||chucVu.equals("PP"))&&Integer.parseInt(soHieu) > 3){
            this.chucVu = "NV";
        }
        else this.chucVu = chucVu;
    }
    public boolean isCheck(String s){
        String lname = name.toLowerCase();
        if(lname.contains(s)) return true;
        else return false;
    }
    @Override
    public int compareTo(NhanVien x){
        if(this.cBacLuong != x.cBacLuong) return x.cBacLuong - this.cBacLuong;
        return this.cSoHieu - x.cSoHieu;
    }
    @Override
    public String toString(){
        return name + " " + chucVu + " " + soHieu + " " + bacLuong;
    }
}

//
public class Tim_Kiem_Nhan_Vien_Theo_ten {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String tmp = sc.nextLine().trim();
            solve.add(new NhanVien(tmp.substring(0, 7), tmp.substring(8)));
        }
        Collections.sort(solve);
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < m;i++){
            String cnt = sc.nextLine().toLowerCase();
            for(NhanVien x: solve){
                if(x.isCheck(cnt)) System.out.println(x);
            }
            System.out.println();
        }
    }
    
}
