//Created by Campus
package sap_xep_bang_tinh_cong;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
public class Sap_Xep_Bang_Tinh_Cong {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Salary> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Salary(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Salary x: solve){
            System.out.println(x);
        }
    }
    
}
