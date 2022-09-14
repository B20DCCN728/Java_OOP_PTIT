package liet_ke_sinh_vien_theo_lop;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Student{
    private String _code, _name, _class, _email;
    public Student(String _code, String _name, String _class, String _email){
        this._code = _code;
        this._name = _name;
        this._class = _class;
        this._email = _email;
    }
    
    protected String _getClass(){
        return this._class;
    }
    
    @Override
    public String toString(){
        return this._code + " " + this._name + " " + this._class + " " + this._email;
    }
} 
public class Liet_Ke_Sinh_Vien_Theo_Lop{
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }      
        int numQuery = Integer.parseInt(sc.nextLine());
        while(numQuery-- > 0){
            String compare = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + compare + ":");
            for(Student x : solve){
                if(x._getClass().compareTo(compare) == 0){
                    System.out.println(x);
                }
            }
        }
    }
    
}
