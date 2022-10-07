//Created by Campus
package liet_ke_xuat_hang_theo_nhom;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Liet_Ke_Xuat_Hang_Theo_Nhom {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Employee(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(set);
        String compare = sc.nextLine();
        for(Employee x: set){
            if(x.getGroup().compareTo(compare) == 0) System.out.println(x);
        }
    }  
}
