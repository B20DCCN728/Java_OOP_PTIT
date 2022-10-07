//Created by Campus
package bang_theo_doi_nhap_xuat_hang;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Bang_Theo_Doi_Nhap_Xuat_Hang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Employee(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        for(Employee x: set){
            System.out.println(x);
        }
    }
    
}
