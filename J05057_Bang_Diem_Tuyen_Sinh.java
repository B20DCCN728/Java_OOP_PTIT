//Created by Campus
package bang_diem_tuyen_sinh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Student{
    private String code, name = "", totalScore, bonus, status;
    private double total, campus;
    public Student(String code, String name, double math, double phy, double che){
        this.code = code;
        String[] format = name.trim().toLowerCase().split("\\s+");
        for(int i = 0;i < format.length;i++){
            this.name += Character.toUpperCase(format[i].charAt(0)) + format[i].substring(1) + " ";
        }
        this.name = this.name.trim();
        this.campus = math * 2 + phy + che;
        this.total = this.campus + this.getBonus();
        if(this.getBonus() == 0.5 || this.getBonus() == 2.5) this.bonus = String.valueOf(this.getBonus());
        else this.bonus = "1";
        if((int)this.campus == this.campus) this.totalScore = String.valueOf((int)this.campus);
        else this.totalScore = String.format("%.1f", this.campus);
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
    public String toString(){
        return this.code + " " + this.name + " " + this.bonus + " " + this.totalScore + " " + this.status;
    }
}
//
public class Bang_Diem_Tuyen_Sinh {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(Student x: solve){
            System.out.println(x);
        }
    }
}
