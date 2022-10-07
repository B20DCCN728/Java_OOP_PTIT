//Created by Campus
package liet_ke_nhan_vien_theo_chuc_vu;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
public class Liet_Ke_Nhan_Vien_Theo_Chuc_Vu {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Salary> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Salary(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        String compare = sc.nextLine();
        for(Salary x: solve){
            if(compare.compareTo(x.getPosition()) == 0){
                System.out.println(x);
            }
        }
    }
}
