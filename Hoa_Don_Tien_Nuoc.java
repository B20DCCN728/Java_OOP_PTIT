//Created by Campus
package hoa_don_tien_nuoc;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Hoa_Don_Tien_Nuoc {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Clients> solve = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            solve.add(new Clients(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Clients x: solve){
            System.out.println(x);
        }
    }
    
}