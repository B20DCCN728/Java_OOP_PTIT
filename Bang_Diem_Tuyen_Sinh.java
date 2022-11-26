//Created by Campus
package bang_diem_tuyen_sinh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Bang_Diem_Tuyen_Sinh {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(Student x: solve){
            System.out.println(x);
        }
    }
}
