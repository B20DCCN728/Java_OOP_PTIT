package bang_diem_thanh_phan_2;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Student implements Comparable<Student>{
    private String code, name, eclass;
    private double p1, p2, p3;
    //
    public Student(Scanner sc){
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.eclass = sc.nextLine();
        this.p1 = Double.parseDouble(sc.nextLine());
        this.p2 = Double.parseDouble(sc.nextLine());
        this.p3 = Double.parseDouble(sc.nextLine());
    }
    private String getPoint(){
        return String.format("%.1f", this.p1) + " " + String.format("%.1f", this.p2) + " " + String.format("%.1f", this.p3); 
    }
    //
    public String getName(){
        return this.name;
    }
    //
    @Override
    public int compareTo(Student t){
        return this.getName().compareTo(t.getName());
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.eclass + " " + this.getPoint();
    }
}
//
public class Bang_Diem_Thanh_Phan_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Student(sc));
        }
        Collections.sort(set);
        int k = 0;
        for(Student x : set){
            k++;
            System.out.println(k + " " + x);
        }
    }
}
