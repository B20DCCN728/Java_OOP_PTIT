//Created by Campus
package sap_xep_ket_qua_tuyen_sinh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Sap_Xep_Ket_Qua_Tuyen_SInh {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Student x: solve){
            System.out.println(x);
        }
    }
}
