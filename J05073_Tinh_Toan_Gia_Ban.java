//Created by Campus
package tinh_toan_gia_ban;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class Bills {
    private String code;
    private double price, count, sum, finalPrice;
    public Bills(String code, double price, double count){
        this.code = code;
        this.price = price;
        this.count = count;
        this.sum = this.price *  this.count;
        this.finalPrice = this.setFinalPrice();
    }
    private double setFinalPrice(){
        double tax, fee;
        if(code.startsWith("T")){
            tax = 29 * sum / 100;
            fee = 4 * sum / 100;
        }
        else if(code.startsWith("C")){
            tax = 10 * sum / 100;
            fee = 3 * sum / 100;
        }
        else if(code.startsWith("D")){
            tax = 8 * sum / 100;
            fee = 2.5 * sum / 100;
        } 
        else {
            tax = 2 * sum / 100;
            fee = 0.5 * sum / 100;
        }
        if(code.endsWith("C")){
            tax = tax * 95 / 100;
        }
        return ((sum + tax + fee) * 1.2)/ count;
    }
    @Override
    public String toString(){
        return code + " " + String.format("%.2f", (double)Math.round(finalPrice * 100) / 100);
    }
}

//
public class Tinh_Toan_Gia_Ban {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Bills> solve = new ArrayList<>();
        while(t-- > 0){
            String [] arg = sc.nextLine().trim().split("\\s+");
            solve.add(new Bills(arg[0], Double.parseDouble(arg[1]), Double.parseDouble(arg[2])));
        }
        for(Bills x: solve){
            System.out.println(x);
        }
    }
    
}
