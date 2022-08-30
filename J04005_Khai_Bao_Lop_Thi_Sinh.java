package khai_bao_lop_thi_sinh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
//
class Student{
    private String name;
    private String dateOfBirth;
    private double score_1;
    private double score_2;
    private double score_3;
    public Student(Scanner sc){
        this.name = sc.nextLine();
        this.dateOfBirth = sc.next();
        this.score_1 = sc.nextDouble();
        this.score_2 = sc.nextDouble();
        this.score_3 = sc.nextDouble();
    }
    protected double totalScore(){
        return this.score_1 + this.score_2 + this.score_3;
    }
    protected String getName(){
        return this.name;
    }
    protected String getDateOfBirth(){
        return dateOfBirth;
    }
}
//
public class Khai_Bao_Lop_Thi_Sinh {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Student A = new Student(sc);
        System.out.println(A.getName() + " " + A.getDateOfBirth() + " " + A.totalScore());
    }
    
}
