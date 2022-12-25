//Created by Campus
package tinh_toan_gia_ban;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Tinh_Toan_Gia_Ban {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Bills> solve = new ArrayList<>();
        while(t-- > 0){
            String [] arg = sc.nextLine().trim().split("\\s+");
            solve.add(new Bills(arg[0], Double.parseDouble(arg[1]), Double.parseDouble(arg[2])));
        }
        for(Bills x: solve){
            System.out.println(x);
        }
    }
    
}
