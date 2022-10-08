//Created by Campus
package diem_tuyen_sinh;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.io.*;
//
public class Diem_Tuyen_Sinh {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Student x: solve){
            System.out.println(x);
        }
    }
    
}
