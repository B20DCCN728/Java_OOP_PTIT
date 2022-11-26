//Created by Campus
package sap_xep_ket_qua_tuyen_sinh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Student implements Comparable<Student>{
    private String code, name = "", totalScore, bonus, status;
    private double total;
    public Student(String code, String name, double math, double phy, double che){
        this.code = code;
        String[] format = name.trim().toLowerCase().split("\\s+");
        for(int i = 0;i < format.length;i++){
            this.name += Character.toUpperCase(format[i].charAt(0)) + format[i].substring(1) + " ";
        }
        this.name = this.name.trim();
        this.total = math * 2 + phy + che + this.getBonus();
        if(this.getBonus() == 0.5 || this.getBonus() == 2.5) this.bonus = String.valueOf(this.getBonus());
        else this.bonus = "1";
        if((int)this.total == this.total) this.totalScore = String.valueOf((int)this.total);
        else this.totalScore = String.format("%.1f", this.total);
        this.setStatus();
    }
    protected void setStatus(){
        if(this.total < 24) this.status = "TRUOT";
        else this.status = "TRUNG TUYEN";
    }
    //
    protected double getTotalScore(){
        return Double.parseDouble(String.valueOf(this.total));
    }
    //
    private double getBonus(){
        String check = this.code.substring(0, 3);
        if(check.compareTo("KV1") == 0) return 0.5;
        else if(check.compareTo("KV2") == 0) return 1.0;
        else return 2.5;
    }
    //
    @Override
    public int compareTo(Student s){
        if(s.total != this.total) return Double.compare(s.total, this.total);
        return this.code.compareTo(s.code);
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.bonus + " " + this.totalScore + " " + this.status;
    }
}
//
public class Sap_Xep_Ket_Qua_Tuyen_SInh {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Student x: solve){
            System.out.println(x);
        }
    }
}
