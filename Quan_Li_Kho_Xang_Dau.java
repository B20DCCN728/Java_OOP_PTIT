//Created by Campus
package quan_li_kho_xang_dau;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;   
import java.text.*;
//
public class Quan_Li_Kho_Xang_Dau {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Bills> solve = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            solve.add(new Bills(sc.next(), sc.nextLong()));
        }
        Collections.sort(solve);
        for(Bills x: solve){
            System.out.println(x);
        }
    }
}
