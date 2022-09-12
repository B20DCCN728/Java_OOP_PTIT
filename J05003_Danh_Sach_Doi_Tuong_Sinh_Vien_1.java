package danh_sach_doi_tuong_sinh_vien;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.text.*;
//
class Student{
    public static int id = 0;
    private String code = ""; 
    private String name, classmate, date;
    private double gpa;
    public Student(Scanner sc){
        id++;
        this.name = sc.nextLine();
        this.classmate = sc.nextLine();
        this.date = sc.nextLine();
        this.gpa = Double.parseDouble(sc.nextLine());
        this.code += String.valueOf(id);
        while(this.code.length() != 3) this.code = "0" + this.code;
        this.code = "B20DCCN" + this.code;
    }
    
    protected String getStudentCode(){
        return this.code;
    }
    
    protected String getName(){
        return this.name;
    }

    protected String get_Class(){
        return this.classmate;
    }
    
    protected String getDateOfBirth(){
        String[] solve = this.date.split("/");
        if(solve[0].length() != 2) solve[0] = "0" + solve[0];
        if(solve[1].length() != 2) solve[1] = "0" + solve[1];
        return solve[0] + "/" + solve[1] + "/" + solve[2];
    }
    
    protected String getGpa(){
        return String.format("%.2f", this.gpa);
    }
}
//
public class Danh_Sach_Doi_Tuong_Sinh_Vien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Student x = new Student(sc);
            System.out.println(x.getStudentCode() + " " + x.getName() + " " + x.get_Class() + " " + x.getDateOfBirth() + " " + x.getGpa());
        }
    }
    
}
