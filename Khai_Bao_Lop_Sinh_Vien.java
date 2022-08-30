package khai_bao_lop_sinh_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
//
class Student{
    private String name;
    private String Class;
    private String dateOfBirth;
    private double GPA;
    private String maSV = "B20DCCN001";
    public Student(){
        this.name = "";
        this.Class = "";
        this.dateOfBirth = "";
        this.GPA = 0;
    }
    protected String Solve(String[] S){
        String res = "";
        if (S[0].length() == 1) S[0] = '0' + S[0];
        if (S[1].length() == 1) S[1] = '0' + S[1];
        res += S[0] + '/' + S[1] + '/' + S[2];
        return res;
    }
    protected void setData(Scanner sc){
        this.name = sc.nextLine();
        this.Class = sc.next();
        String[] S = sc.next().split("/");
        this.GPA = sc.nextDouble();
        this.dateOfBirth = Solve(S);
    }
    protected String codeSV(){
        return maSV;
    }
    protected String Name(){
        return this.name;
    }
    protected String nameClass(){
        return this.Class;
    } 
    protected String dateofBirth(){
        return this.dateOfBirth;
    }
    protected double Gpa(){
        return this.GPA;
    }
}
//
public class Khai_Bao_Lop_Sinh_Vien {
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat(".00");
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.setData(sc);
        System.out.println(student.codeSV() + " " + student.Name() + " " + student.nameClass() + " " + student.dateofBirth() + " " + df.format(student.Gpa()));
    }
}
