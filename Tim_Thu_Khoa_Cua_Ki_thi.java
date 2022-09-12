package tim_thu_khoa_cua_ki_thi;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Student{
    public static int id = 0;
    private String num, name, date; 
    double gpa;
    public Student(Scanner sc){
        id++;
        this.num = String.valueOf(id);
        this.name = sc.nextLine();
        this.date = sc.nextLine();
        this.gpa = Double.parseDouble(sc.nextLine()) + Double.parseDouble(sc.nextLine()) + Double.parseDouble(sc.nextLine());
    }
    protected double getGpa(){
        return this.gpa;
    }
    
    @Override
    public String toString(){
        return this.num + " " + this.name + " " + this.date + " " + this.gpa;
    }
}

public class Tim_Thu_Khoa_Cua_Ki_thi {
    /**
     * @CampusETH
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        double max = 0;
        ArrayList<Student> set = new ArrayList<>();
        while(t-- > 0){
            Student solve = new Student(sc);
            if(solve.getGpa() > max) max = solve.getGpa();
            set.add(solve);
        }
        for(Student x : set){
            if(x.getGpa() == max) System.out.println(x);
        }
    }
    
}
