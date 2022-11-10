//Created by Campus
package quan_li_ban_hang;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
class Client {
    static int id = 0;
    private String code = "KH", name, sex, dateOfBirth, address;
    public Client(String name, String sex, String dateOfBirth, String address){
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
class Product {
    static int id = 0;
    private String code = "MH", name, donVi;
    private int buyPrice, sellPrice;
    public Product(String name, String donVi, int buyPrice, int sellPrice){
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
    @Override 
    public String toString(){
        return this.name + " " + this.donVi + " " + this.buyPrice + " " + this.sellPrice;
    }
}
//
class Bill {
    static int id = 0;
    private Client client;
    private Product product; 
    private int total, count;
    private String code = "HD";
    public Bill(Client client, Product product, int count){
        id += 1;
        this.code += String.format("%03d", id);
        this.client = client;
        this.product = product;
        this.count = count;
        this.total = this.product.getSellPrice() * count;
    }
    @Override
    public String toString(){
        return this.code + " " + client + " " + product + " " + count + " " + total;
    }
}

//
public class Quan_Li_Ban_Hang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HashMap<String, Client> clientPair = new HashMap<>();
        HashMap<String, Product> productPair = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Client x = new Client(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());  
            clientPair.put(x.getCode(), x);
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Product y = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            productPair.put(y.getCode(), y);
        }
        ArrayList<Bill> solve = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String[] data = sc.nextLine().split(" ");
            solve.add(new Bill(clientPair.get(data[0]), productPair.get(data[1]), Integer.parseInt(data[2])));
        }
        for(Bill x: solve){
            System.out.println(x);
        }
    }
    
}
