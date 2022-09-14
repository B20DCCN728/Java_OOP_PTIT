package sap_xep_sinh_vien_theo_lop;
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
    
    protected String _getCode(){
        return this._code;
    }
    
    @Override
    public String toString(){
        return this._code + " " + this._name + " " + this._class + " " + this._email;
    }
} 
class sortTheArrayList implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        if(o1._getClass().compareTo(o2._getClass()) != 0) return o1._getClass().compareTo(o2._getClass());
        return o1._getCode().compareTo(o2._getCode());
    }
}
public class Sap_Xep_Sinh_Vien_Theo_Lop {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve, new sortTheArrayList());
        for(Student x : solve){
            System.out.println(x);
        }
    }
}
