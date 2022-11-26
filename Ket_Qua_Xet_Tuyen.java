//Created by Campus
package ket_qua_xet_tuyen;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Ket_Qua_Xet_Tuyen {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PhuHo> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new PhuHo(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(PhuHo x: solve){
            System.out.println(x);
        }
    }
    
}
