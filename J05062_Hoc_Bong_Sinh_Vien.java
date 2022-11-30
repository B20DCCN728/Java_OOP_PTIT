//Created by Campus
package hoc_bong_sinh_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class SinhVien implements Comparable<SinhVien> {
    static int id = 0;
    static int k;
    static double diemChuan;
    private String name, status, code;
    private double gpa, rl;
    static ArrayList<String> member = new ArrayList<>();
    public SinhVien(String name, double gpa, double rl){
        id += 1;
        this.code = "A" + String.format("%03d", id);
        member.add(this.code);
        this.name = name;
        this.gpa = gpa;
        this.rl = rl;
    }
    public String getCode(){
        return code;
    }
    public void setStatus(){
        if(k >= 1){
            if(gpa >= 3.6&&rl >= 90){
                this.status = "XUATSAC";
                k -= 1;
                diemChuan = gpa;
            }
            else if(gpa >= 3.2&&rl >= 80){
                this.status = "GIOI";
                k -= 1;
                diemChuan = gpa;
            }
            else if(gpa >= 2.5&&rl >= 70){
                this.status = "KHA";
                k -= 1;
                diemChuan = gpa;
            }
            else this.status = "KHONG";     
        }
        else{
            if(gpa == diemChuan){
                if(gpa >= 3.6&&rl >= 90) this.status = "XUATSAC";
                else if(gpa >= 3.2&&rl >= 80) this.status = "GIOI";
                else if(gpa >= 2.5&&rl >= 70) this.status = "KHA";
                else this.status = "KHONG";
            }
            else this.status = "KHONG";
        }
    }
    public double getGpa(){
        return this.gpa;
    }
    @Override
    public int compareTo(SinhVien s){
        if(s.gpa != this.gpa) return Double.compare(s.gpa, this.gpa);
        return Double.compare(s.rl, this.rl);
    }
    @Override
    public String toString(){
        return name + ": " + status;
    }
}

//
public class Hoc_Bong_Sinh_Vien {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String tmp[] = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(tmp[0]);
        int k = Integer.parseInt(tmp[1]);
        ArrayList<SinhVien> solve = new ArrayList<>();
        SinhVien.k = k;
        for(int i = 0;i < n;i++){
            String name = sc.nextLine();
            String data[] = sc.nextLine().split("\\s+");
            solve.add(new SinhVien(name, Double.parseDouble(data[0]),Double.parseDouble(data[1])));
        }
        Collections.sort(solve);     
        for(int i = 0;i < n;i++){
            solve.get(i).setStatus();
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(solve.get(j).getCode().equals(SinhVien.member.get(i))){
                    System.out.println(solve.get(j));
                    break;
                }
            }
        }
    }
    
}
