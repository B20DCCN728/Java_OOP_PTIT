//Created by Campus
package bang_ke_tien_luong;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
public class Bang_Ke_Tien_Luong {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Salary> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Salary(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
        }
        long total = 0;
        for(Salary x: solve){
            System.out.println(x);
            total += x.getTotal();
        }
        System.out.println("Tong chi phi tien luong: " + total);
    }
    
}
