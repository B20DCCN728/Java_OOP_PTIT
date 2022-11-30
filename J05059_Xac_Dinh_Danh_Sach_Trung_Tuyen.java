//Created by Campus
package xac_dinh_danh_sach_trung_tuyen;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class XetTuyen implements Comparable<XetTuyen> {
    private String code, name, status, bonus_str, total_str;
    private double toan, li, hoa, bonus, total;
    
    public XetTuyen(String code, String name, double toan, double li, double hoa){
        this.code = code;
        this.name = name;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
        this.bonus = this.getBonus();
        if((int)this.bonus == this.bonus) this.bonus_str = String.valueOf((int)this.bonus);
        else this.bonus_str = String.format("%.1f", this.bonus);
        this.total = this.toan * 2 + this.li + this.hoa + this.bonus;
        if((int)this.total == this.total) this.total_str = String.valueOf((int)this.total);
        else this.total_str = String.format("%.1f", this.total);
    }
    public void setStatus(String tmp){
        this.status = tmp;
    }
    public double getTotal(){
        return total;
    }
    private double getBonus(){
        if(code.substring(0, 3).equals("KV1")){
            return 0.5;
        }
        else if(code.substring(0, 3).equals("KV2")){
            return 1.0;
        }
        else return 2.5;
    }
    @Override 
    public int compareTo(XetTuyen s){
        return Double.compare(s.total, this.total);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + bonus_str + " " + total_str + " " + status;
    }
}

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
