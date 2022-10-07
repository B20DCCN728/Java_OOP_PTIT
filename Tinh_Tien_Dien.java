//Created by Campus
package tinh_tien_dien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tinh_Tien_Dien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Electricity> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Electricity(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Electricity x: solve){
            System.out.println(x);
        }
    }
    
}
