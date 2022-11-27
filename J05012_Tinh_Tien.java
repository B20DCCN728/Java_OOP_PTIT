//Created by Campus
package tinh_tien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Products implements Comparable<Products> {
    private String code, name;
    private long count, price, discount, total;
    public Products(String code, String name, long count, long price, long discount){
        this.code = code;
        this.name = name;
        this.count = count;
        this.price = price;
        this.discount = discount;
        this.total = this.count * this.price - this.discount;
    }
    @Override
    public int compareTo(Products s){
        return Long.compare(s.total, this.total);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.count + " " + this.price + " " + this.discount + " " + this.total;
    }
}

//
public class Tinh_Tien {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Products> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            solve.add(new Products(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Products x: solve){
            System.out.println(x);
        }
    }
    
}
