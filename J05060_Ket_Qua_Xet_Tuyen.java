//Created by Campus
package ket_qua_xet_tuyen;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class PhuHo {
    static int id = 0;
    private String code = "PH", name, dateOfBirth, status;
    private double th, lt, bonus, average;
    private int age;
    public PhuHo(String name, String dateOfBirth, double lt, double th) {
        id += 1;
        this.code += String.format("%02d", id);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        int first = Integer.parseInt(this.dateOfBirth.substring(6));
        this.age = 2021 - first;
        this.lt = lt;
        this.th = th;
        this.bonus = this.getBonus();
        this.average = Math.round((this.th + this.lt) / 2 + this.bonus);
        if(this.average > 10) this.average = 10;
        this.status = this.getStatus();
    }
    public PhuHo(){     
    }
    public double getBonus(){
        if(lt >= 8&&th >= 8) return 1.0;
        else if(lt >= 7.5&&th >= 7.5) return 0.5;
        else return 0;
    }
    public String getStatus(){
        if(average < 5) return "Truot";
        else if(average <= 6) return "Trung binh"; 
        else if(average == 7) return "Kha";
        else if(average == 8) return "Gioi";
        else return "Xuat sac";
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.age + " " + (int)(this.average) + " " + this.status;
    }
}
//
public class Ket_Qua_Xet_Tuyen {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PhuHo> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new PhuHo(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(PhuHo x: solve){
            System.out.println(x);
        }
    }
    
}
