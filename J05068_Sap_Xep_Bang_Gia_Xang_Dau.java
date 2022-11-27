//Created by Campus
package quan_li_kho_xang_dau;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;   
import java.text.*;
//
class Bills implements Comparable<Bills> {
    private String code, supplier, codeSup;
    private Character codeType;
    private long count, price, total, tax, finalTotal;
    public Bills(String code, long count){
        this.code = code;
        this.codeType = this.code.charAt(0);
        this.codeSup = this.code.substring(3);
        this.count = count;
        this.setType();
        this.setSupplier();
        this.finalTotal = this.total + this.tax;
    }
    private void setType(){
        if(codeType == 'X'){
            this.price = 128000;
            this.total = this.price * this.count;
            this.tax = (long)Math.round(this.total * 0.03);
        }
        else if(codeType == 'D'){
            this.price = 11200;
            this.total = this.price * this.count;
            this.tax = (long)Math.round(this.total * 0.035);
        }
        else {
            this.price = 9700;
            this.total = this.price * this.count;
            this.tax = (long)Math.round(this.total * 0.02);
        }
    }
    private void setSupplier(){
        if(codeSup.equals("TN")){
            this.supplier = "Trong Nuoc";
            this.tax = 0;
        }
        else if(codeSup.equals("BP")){
            this.supplier = "British Petro";
        }
        else if(codeSup.equals("ES")){
            this.supplier = "Esso";
        }
        else if(codeSup.equals("SH")){
            this.supplier = "Shell";
        }
        else if(codeSup.equals("CA")){
            this.supplier = "Castrol";
        }
        else this.supplier = "Mobil";
    }
    @Override
    public int compareTo(Bills s){
        return Long.compare(s.finalTotal, this.finalTotal);
    }
    @Override
    public String toString(){
        return this.code + " " + this.supplier + " " + this.price + " " + this.tax + " " + this.finalTotal;
    }
}

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
