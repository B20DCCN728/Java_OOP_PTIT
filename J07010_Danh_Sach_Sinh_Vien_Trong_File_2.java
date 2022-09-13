package danh_sach_sinh_vien_trong_file_2;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Student{
    public static int id = 0;
    private String code = "B20DCCN", name, classmate, date = "", gpa;
    public Student(String name, String classmate, String date, String gpa){
        id++;
        String ccode = String.format("%03d", id);
        this.code += ccode;
        this.name = name;
        this.classmate = classmate;
        String[] birthDay = date.split("/");
        this.date = String.format("%02d", Integer.parseInt(birthDay[0])) + "/" + String.format("%02d", Integer.parseInt(birthDay[1])) + "/" + birthDay[2];
        this.gpa = String.format("%.2f", Double.parseDouble(gpa));
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.classmate + " " + this.date + " " + this.gpa;
    }
}
public class Danh_Sach_Sinh_Vien_Trong_File_2 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> set = new ArrayList<>();
        while (t-- > 0) {
             set.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(Student x : set){
            System.out.println(x);
        }
    }
    
}
