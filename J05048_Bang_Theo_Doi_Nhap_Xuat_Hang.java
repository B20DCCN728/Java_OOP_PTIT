//Created by Campus
package bang_theo_doi_nhap_xuat_hang;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Employee {
    private String first, end, code;
    private long money, price, outCount, inCount, tax, total;
    public Employee(String code, long inCount){
        this.code = code;
        this.inCount = inCount;
        this.first = String.valueOf(this.code.charAt(0));
        this.end = String.valueOf(this.code.charAt(this.code.length() - 1));
        this.outCount = this.getOutCount();
        this.price = this.getPrice();
        this.money = this.outCount * this.price;
        this.tax = this.getTax();
    }
    //
    private long getPrice(){
        if(this.end.compareTo("Y") == 0) return 110000;
        else return 135000;
    }
    //
    private long getOutCount(){
        if(this.first.compareTo("A") == 0)
            return (long) Math.round((double)(this.inCount * 60) / 100);
        else return (long) Math.round((double)(this.inCount * 70) / 100);
    }
    //
    private long getTax(){
        if(this.first.compareTo("A") == 0){
            if(this.end.compareTo("Y") == 0) return this.money * 8 / 100;
            else return this.money * 11 / 100;
        }
        else{
            if(this.end.compareTo("Y") == 0) return this.money * 17 / 100;
            else return this.money * 22 / 100;
        }
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.inCount + " " + this.outCount + " " + this.price + " " + this.money + " " + this.tax;
    }
    //
}

//
public class Bang_Theo_Doi_Nhap_Xuat_Hang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Employee(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        for(Employee x: set){
            System.out.println(x);
        }
    }
    
}
