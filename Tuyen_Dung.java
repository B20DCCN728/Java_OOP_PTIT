//Created by Campus
package tuyen_dung;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tuyen_Dung {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TuyenDung> solve = new ArrayList<>();
        for(int i = 0 ;i < n;i++){
            solve.add(new TuyenDung(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(solve);
        for(TuyenDung x: solve) {
            System.out.println(x);
        }
    }
    
}
