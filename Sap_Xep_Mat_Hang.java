package sap_xep_mat_hang;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Product implements Comparable<Product>{
    static int id = 0;
    private String code = "MH", name, group;
    private double buyPrice, sellPrice, profit;
    //
    public Product(String name, String group, double buyPrice, double sellPrice){
        id += 1;
        this.code += String.format("%02d", id);
        this.name = name;
        this.group = group;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = this.sellPrice - this.buyPrice;
    }
    protected double getProfit(){
        return this.profit;
    }
    //
    @Override
    public int compareTo(Product t){
        return Double.compare(t.getProfit(), this.getProfit());
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.group + " " + String.format("%.2f", this.sellPrice - this.buyPrice);
    }
}
//
public class Sap_Xep_Mat_Hang {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Product(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(set);
        for(Product x : set){
            System.out.println(x);
        }
    }
    
}
