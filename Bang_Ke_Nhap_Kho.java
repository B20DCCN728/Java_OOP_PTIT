//Created by Campus
package bang_ke_nhap_kho;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Bang_Ke_Nhap_Kho {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<WareHouse> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new WareHouse(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        for(WareHouse x: solve){
            System.out.println(x);
        }
    }
    
}