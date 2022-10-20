//Created by Campus
package chuan_hoa_va_sap_xep;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class FormatName implements Comparable<FormatName> {
    private String ho, dem = "", ten;
    public FormatName(String fullName){
        String[] data = fullName.trim().toLowerCase().split("\\s+");
        this.ho = Character.toUpperCase(data[0].charAt(0)) + data[0].substring(1);
        this.ten = Character.toUpperCase(data[data.length - 1].charAt(0)) + data[data.length - 1].substring(1);
        for(int i = 1;i < data.length - 1;i++){
            this.dem += Character.toUpperCase(data[i].charAt(0)) + data[i].substring(1) + " ";
        }
        this.dem = this.dem.trim();
    }
    @Override
    public int compareTo(FormatName a){
        if(this.ten.compareTo(a.ten) != 0) return this.ten.compareTo(a.ten);
        if(this.ho.compareTo(a.ho) != 0) return this.ho.compareTo(a.ho);
        return this.dem.compareTo(a.dem);
    }
    @Override
    public String toString(){
        return this.ho + " " + this.dem + " " + this.ten;
    }
}

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
