package danh_sach_sinh_vien_trong_file_1;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Student implements Comparable<Student>{
    private String code, name = "", eclass, email;
    public Student(String code, String notTrueName, String eclass, String email){
        this.code = code;
        String[] solve = notTrueName.toLowerCase().replaceAll("\\s+", " ").split(" ");
        for(int i = 0;i < solve.length;i++){
            this.name += Character.toUpperCase(solve[i].charAt(0)) + solve[i].substring(1);
            this.name += " ";
        }
        this.name.trim();
        this.eclass = eclass;
        this.email = email;
    }
    protected String getCode(){
        return this.code;
    }
    @Override
    public int compareTo(Student t){
        return this.getCode().compareTo(t.getCode());
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.eclass + " " + this.email;
    }
}
//
public class Danh_Sach_Sinh_Vien_Trong_File_1 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(set);
        for(Student x : set){
            System.out.println(x);
        }
    }
    
}
