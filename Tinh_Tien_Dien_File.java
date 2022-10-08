//Created by Campus
package tinh_tien_dien_file;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tinh_Tien_Dien_File {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Electricity> solve = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String[] data = sc.nextLine().split(" ");
            solve.add(new Electricity(name, data[0], Long.parseLong(data[1]), Long.parseLong(data[2])));
        }
        Collections.sort(solve);
        for(Electricity x: solve){
            System.out.println(x);
        }
    }
    
}
