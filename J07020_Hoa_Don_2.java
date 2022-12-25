//Created by Campus
package hoa_don_2;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class Clients {
    static int id = 0;
    private String code, name, sex, dof, address;
    public Clients(String name, String sex, String dof, String address){
        id += 1;
        this.code = String.format("KH%03d", id);
        this.name = name;
        this.sex = sex;
        this.dof = dof;
        this.address = address;
    }
    public String getCode(){
        return code;
    }
    @Override
    public String toString(){
        return name + " " + address;
    }
}
//
class Products {
    static int id = 0;
    private String code, name, type;
    private int buyPrice, sellPrice;
    public Products(String name, String type, int buyPrice, int sellPrice){
        id += 1;
        this.code = String.format("MH%03d", id);
        this.name = name;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }    
    public String getCode(){
        return code;
    }
    public int getSellPrice(){
        return sellPrice;
    }
    @Override
    public String toString(){
        return name + " " + type + " " + buyPrice + " " + sellPrice;    
    }
}
//
class Bills {
    static int id = 0;
    private Clients cli;
    private Products pro;
    private String code;
    private int count, total;
    public Bills(Clients cli, Products pro, int count){
        id += 1;
        this.code = String.format("HD%03d", id);
        this.cli = cli;
        this.pro = pro;
        this.count = count;
        this.total = this.count * this.pro.getSellPrice();
    }    
    @Override
    public String toString(){
        return code + " " + cli + " " + pro + " " + count + " " + total;
    }
}
//
public class Hoa_Don_2 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner f1 = new Scanner(new File("KH.in"));
        Scanner f2 = new Scanner(new File("MH.in"));
        Scanner f3 = new Scanner(new File("HD.in"));
        HashMap<String, Clients> clients = new HashMap<>();
        int n = Integer.parseInt(f1.nextLine());
        for(int i = 0;i < n;i++){
            Clients tmp = new Clients(f1.nextLine(), f1.nextLine(), f1.nextLine(), f1.nextLine());
            clients.put(tmp.getCode(), tmp);
        }
        HashMap<String, Products> products = new HashMap<>();
        n = Integer.parseInt(f2.nextLine());
        for(int i = 0;i < n;i++){
            Products tmp = new Products(f2.nextLine(), f2.nextLine(), Integer.parseInt(f2.nextLine()), Integer.parseInt(f2.nextLine()));
            products.put(tmp.getCode(), tmp);
        }
        ArrayList<Bills> bills = new ArrayList<>();
        n = Integer.parseInt(f3.nextLine());
        for(int i = 0;i < n;i++){
            String [] tmp = f3.nextLine().split(" ");
            bills.add(new Bills(clients.get(tmp[0]), products.get(tmp[1]), Integer.parseInt(tmp[2])));
        }
        for(Bills x: bills){
            System.out.println(x);
        }
    }
}
