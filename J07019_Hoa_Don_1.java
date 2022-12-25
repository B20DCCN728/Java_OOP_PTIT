//Created by Campus
package hoa_don_1;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class Products {
    static HashMap<String, Products> elements = new HashMap<>();
    private String code, name;
    private HashMap<Integer, Integer> type = new HashMap<>();
    public Products(String code, String name, int price_1, int price_2){
        this.code = code;
        this.name = name;
        this.type.put(1, price_1);
        this.type.put(2, price_2);
    }
    public int getPrice(String t){
        return type.get(Integer.parseInt(t));
    }
    public String getCode(){
        return code;
    }
    @Override
    public String toString(){
        return name;
    }
}
//
class Bills {
    static int id = 0;
    private String code = "";
    private int count, sum, total;
    private Products pro;
    public Bills(String code, int count){
        id += 1;
        this.code += code + String.format("-%03d", id);
        this.count = count;
        this.pro = Products.elements.get(code.substring(0, 2));
        this.sum = this.pro.getPrice(code.substring(2)) * this.count;
        this.total = this.setTotal();
    }
    public int setTotal(){
        if(count >= 150){
            return sum / 2;
        }
        else if(count >= 100){
            return sum * 7 / 10;
        }
        else if(count >= 50){
            return sum * 17 / 20;
        }
        else return sum;
    }
    @Override
    public String toString(){
        return code + " " + pro + " " + (sum - total) + " " + total;
    }
}
//
public class Hoa_Don_1 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int n = Integer.parseInt(sc1.nextLine());
        for(int i = 0;i < n;i++){
            Products tmp = new Products(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()), Integer.parseInt(sc1.nextLine()));
            Products.elements.put(tmp.getCode(), tmp);
        }
        n = Integer.parseInt(sc2.nextLine());
        ArrayList<Bills> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String [] tmp = sc2.nextLine().split("\\s+");
            solve.add(new Bills(tmp[0], Integer.parseInt(tmp[1])));
        }
        for(Bills x: solve){
            System.out.println(x);
        }
    }
    
}
