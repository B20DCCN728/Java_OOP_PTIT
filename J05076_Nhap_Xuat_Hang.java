//Created by Campus
package nhap_xuat_hang;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Bills {
    private Product product;
    private long totalIn, totalOut;
    public Bills(Product product, long cIn, long price, long cOut){
        this.product = product;
        this.totalIn = cIn * price;
        long target = (long)Math.round((price * cOut) * this.product.getTarget() / 100);
        this.totalOut = price * cOut + target;
    }
    @Override
    public String toString(){
        return this.product + " " + this.totalIn + " " + this.totalOut;
    }       
}
//
class Product {
    private String code, name, rank;
    private long target;
    public Product(String code, String name, String rank){
        this.code = code;
        this.name = name;
        this.rank = rank;
        this.target = this.setTarget();
    }
    public String getCode(){
        return this.code;
    }
    public long getTarget(){
        return this.target;
    }
    public String getName(){
        return this.name;
    }
    private long setTarget(){
        if(rank.equals("A")){
            return 8;
        }
        else if(rank.equals("B")){
            return 5;
        }
        else return 2;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name;
    }
}
//
public class Nhap_Xuat_Hang {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> product = new HashMap<>();
        for(int i = 0;i < n;i++){
            Product tmp = new Product(sc.nextLine(), sc.nextLine(), sc.nextLine());
            product.put(tmp.getCode(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Bills> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String data[] = sc.nextLine().split(" ");
            solve.add(new Bills(product.get(data[0]), Long.parseLong(data[1]), Long.parseLong(data[2]), Long.parseLong(data[3])));
        }
        for(Bills x: solve){
            System.out.println(x);
        }
    }
    
}
