//Created by Campus
package diem_tuyen_sinh;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.io.*;
//
class Student implements Comparable<Student> {
    static int id = 0;
    private String code = "TS", name = "", ethnic, area, status;
    private double score, total, bonus;
    public Student(String notName, double score, String ethnic, String area){
        id += 1;
        this.code += String.format("%02d", id);
        String[] a = notName.trim().toLowerCase().split("\\s+");
        for(int i = 0;i < a.length;i++){ 
            this.name += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1) + " ";
        }
        this.name = this.name.trim();
        this.score = score;
        this.ethnic = ethnic;
        this.area = area;
        this.bonus = this.getBonus();
        this.total = this.score + this.bonus;
        this.status = this.getStatus();
    }
    //
    private double getBonus(){
        double res = 0;
        if(this.area.compareTo("1") == 0) res += 1.5;
        else if(this.area.compareTo("2") == 0) res += 1.0;
        else res += 0;
        if(this.ethnic.compareTo("Kinh") == 0) return res;
        else return res + 1.5;
    }
    //
    private String getStatus(){
        if(this.total < 20.5) return "Truot";
        else return "Do";
    }
    //
    @Override
    public int compareTo(Student x){
        if(Double.compare(x.total, this.total) != 0) return Double.compare(x.total, this.total);
        else return this.code.compareTo(x.code);
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + String.format("%.1f", this.total) + " " + this.status;
    }
}

//
public class Diem_Tuyen_Sinh {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Student x: solve){
            System.out.println(x);
        }
    }
    
}
