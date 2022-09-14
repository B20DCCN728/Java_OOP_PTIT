package sap_xep_theo_ma_sinh_vien;
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
    
    protected String getCode(){
        return this._code;
    }
    
    @Override
    public String toString(){
        return this._code + " " + this._name + " " + this._class + " " + this._email;
    }
} 
//
class sortTheArrayList implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return o1.getCode().compareTo(o2.getCode());
    }
}
//
public class Sap_Xep_Theo_Ma_Sinh_Vien {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> solve = new ArrayList<>();
        while(sc.hasNext()){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));            
        }
        Collections.sort(solve, new sortTheArrayList());
        for(Student x : solve){
            System.out.println(x);
        }
    }
    
}
