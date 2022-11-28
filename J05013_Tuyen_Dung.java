//Created by Campus
package tuyen_dung;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class TuyenDung implements Comparable<TuyenDung>{
    static int id = 0;
    private String maThiSinh = "TS", tenThiSinh, status;
    private double thucHanh, liThuyet, trungBinh; 
    public TuyenDung(String tenThiSinh, double thucHanh, double liThuyet){
        id += 1;
        this.maThiSinh += String.format("%02d", id);
        this.tenThiSinh = tenThiSinh;
        if(thucHanh > 10) this.thucHanh = thucHanh / 10;
        else this.thucHanh = thucHanh;
        if(liThuyet > 10) this.liThuyet = liThuyet / 10;
        else this.liThuyet = liThuyet;
        this.trungBinh = (this.liThuyet + this.thucHanh) / 2;
        this.status = this.setStatus();
    }
    public String setStatus(){
        if(trungBinh < 5) return "TRUOT";
        else if(trungBinh > 5&&trungBinh < 8) return "CAN NHAC";
        else if(trungBinh >= 8&&trungBinh <= 9.5) return "DAT";
        else return "XUAT SAC";
    }
    @Override
    public int compareTo(TuyenDung s){
        return Double.compare(s.trungBinh, this.trungBinh);
    }
    @Override
    public String toString(){
        return maThiSinh + " " + tenThiSinh + " " + String.format("%.2f", trungBinh) + " " + status;
    }
}

//
public class Tuyen_Dung {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TuyenDung> solve = new ArrayList<>();
        for(int i = 0 ;i < n;i++){
            solve.add(new TuyenDung(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(solve);
        for(TuyenDung x: solve) {
            System.out.println(x);
        }
    }
    
}
