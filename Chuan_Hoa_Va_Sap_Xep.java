//Created by Campus
package chuan_hoa_va_sap_xep;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
public class Chuan_Hoa_Va_Sap_Xep {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<FormatName> solve = new ArrayList<>();
        while(sc.hasNextLine()){
            String fullName = sc.nextLine();
            solve.add(new FormatName(fullName));
        }
        Collections.sort(solve);
        for(FormatName x: solve){
            System.out.println(x);
        }
    }
    
}