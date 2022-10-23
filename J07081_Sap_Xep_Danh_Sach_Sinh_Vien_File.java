//Created by Campus
package sap_xep_danh_sach_sinh_vien_file;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Student implements Comparable<Student>{
    private String code, name, phoneNumber, email, ho, dem = "",ten;
    public Student(String code, String name, String phoneNumber, String email){
        this.code = code;
        this.name = name;
        String[] format = name.split(" ");
        this.ho = format[0];
        this.ten = format[format.length - 1];
        for(int i = 1;i < format.length - 1;i++){
            this.dem += format[i] + " ";
        }
        this.dem = this.dem.trim();
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public int compareTo(Student x){
        if(this.ten.compareTo(x.ten) != 0) return this.ten.compareTo(x.ten);
        if(this.ho.compareTo(x.ho) != 0) return this.ho.compareTo(x.ho);
        if(this.dem.compareTo(x.dem) != 0) return this.dem.compareTo(x.dem);
        return this.code.compareTo(x.code);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.phoneNumber + " " + this.email;
    }
}
//
public class Sap_Xep_Danh_Sach_Sinh_Vien_File {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Student x: solve){
            System.out.println(x);
        }
    }
    
}
