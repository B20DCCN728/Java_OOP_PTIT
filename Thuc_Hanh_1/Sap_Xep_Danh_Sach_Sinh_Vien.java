package sap_xep_danh_sach_sinh_vien;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Student implements Comparable<Student>{
    private String code, fullName, number, email, ho, dem = "", ten;
    public Student(Scanner sc){
        this.code = sc.nextLine();
        this.fullName = sc.nextLine();
        this.number = sc.nextLine();
        this.email = sc.nextLine();
        setName();
    }
    
    private void setName(){
        String[] solve = this.fullName.split(" ");
        this.ho = solve[0];
        this.ten = solve[solve.length - 1];
        for(int i = 1;i < solve.length - 1;i++){
            this.dem += solve[i];
            this.dem += " ";
        }
        this.dem = this.dem.trim();
    }
    
    protected String getTen(){
        return this.ten;
    }
    
    protected String getHo(){
        return this.ho;
    }
    
    protected String getDem(){
        return this.dem;
    }
    
    protected String getCode(){
        return this.code;
    }
    
    @Override
    public int compareTo(Student t){
        if(this.getTen().compareTo(t.getTen()) != 0) return this.getTen().compareTo(t.getTen());
        if(this.getHo().compareTo(t.getHo()) != 0) return this.getHo().compareTo(t.getHo());
        if(this.getDem().compareTo(t.getDem()) != 0) return this.getDem().compareTo(t.getDem());
        return this.getCode().compareTo(t.getCode());
    }
    
    @Override
    public String toString(){
        return this.code + " " + this.fullName + " " + this.number + " " + this.email;
    }
}
//
public class Sap_Xep_Danh_Sach_Sinh_Vien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Student(sc));
        }
        Collections.sort(set);
        for(Student x : set){
            System.out.println(x);
        }
    }
    
}
