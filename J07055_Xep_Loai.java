//Created by Campus
package xep_loai;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Compare implements Comparable<Compare>{
    static int id = 0;
    private String code = "SV", name = "", rank;
    private double res;
    public Compare(String notName, int lt, int on, int thi){
        id += 1;
        this.code += String.format("%02d", id);
        String[] a = notName.trim().toLowerCase().split("\\s+");
        for(int i = 0;i < a.length;i++){ 
            this.name += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1) + " ";
        }
        this.name = this.name.trim();
        this.res = (double)(lt * 25 + on * 35 + thi * 40) / 100;
        this.rank = this.getRank();
    }
    //
    protected String getRank(){
        if(this.res >= 8) return "GIOI";
        else if(this.res >= 6.5) return "KHA";
        else if(this.res >= 5) return "TRUNG BINH";
        else return "KEM";
    }
    //
    @Override
    public int compareTo(Compare x){
        return Double.compare(x.res, this.res);
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + String.format("%.2f", this.res) + " " + this.rank;
    }
}

//
public class Xep_Loai {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Compare> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Compare(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Compare x: solve){
            System.out.println(x);
        }
    }
    
}                                                                              
