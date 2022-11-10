//Created by Campus
package quan_li_ban_hang_2;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
class Clients {
    static int id = 0;
    private String code = "KH", name, sex, dateOfBirth, address;
    public Clients(String name, String sex, String dateOfBirth, String address){
        id += 1;
        this.code += String.format("%03d", id);
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
    public String getCode(){
        return this.code;
    }
    @Override
    public String toString(){
        return this.name + " " + this.address;
    } 
}
//
class Products {
    static int id = 0;
    private String code = "MH", name, donVi;
    private int buyPrice, sellPrice;
    public Products(String name, String donVi, int buyPrice, int sellPrice){
        id += 1;
        this.code += String.format("%03d", id);
        this.name = name;
        this.donVi = donVi;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    public String getCode(){
        return this.code;
    }
    public int getSellPrice(){
        return this.sellPrice;
    }
    public int getBuyPrice(){
        return this.buyPrice;
    }
    @Override 
    public String toString(){
        return this.name;
    }  
}
//
class Bills implements Comparable<Bills>{
    static int id = 0;
    private Clients client;
    private Products product; 
    private int total, count, profit;
    private String code = "HD";
    public Bills(Clients client, Products product, int count){
        id += 1;
        this.code += String.format("%03d", id);
        this.client = client;
        this.product = product;
        this.count = count;
        this.total = this.product.getSellPrice() * count;
        this.profit = this.total - this.product.getBuyPrice() * count;
    }
    @Override
    public int compareTo(Bills x){
        if(x.profit != this.profit) return x.profit - this.profit;
        return this.code.compareTo(x.code);
    }
    @Override
    public String toString(){
        return this.code + " " + client + " " + product + " " + count + " " + total + " " + profit;
    }    
}
//
public class Quan_Li_Ban_Hang_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HashMap<String, Clients> clientsPair = new HashMap<>();
        HashMap<String, Products> productsPair = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Clients x = new Clients(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());  
            clientsPair.put(x.getCode(), x);
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Products y = new Products(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            productsPair.put(y.getCode(), y);
        }
        ArrayList<Bills> solve = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String[] data = sc.nextLine().split(" ");
            solve.add(new Bills(clientsPair.get(data[0]), productsPair.get(data[1]), Integer.parseInt(data[2])));
        }
        Collections.sort(solve);
        for(Bills x: solve){
            System.out.println(x);
        } 
    }
    
}
