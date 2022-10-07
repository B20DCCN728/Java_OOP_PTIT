//Created by Campus
package bang_ke_nhap_kho_sap_xep_theo_chiet_khau;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class WareHouse implements Comparable<WareHouse>{
    static LinkedHashMap<String, Integer> set = new LinkedHashMap<>();
    private String code = "", name;
    private long count, price, discount, total, res;
    public WareHouse(String name, long count, long price){
        this.name = name;
        setCode();
        this.count = count;
        this.price = price;
        this.total = this.price * this.count;
        this.discount = this.getDiscount();
        this.res = this.total - this.discount;
    }
    //
    private void setCode(){
        String[] data = this.name.split(" ");
        this.code += Character.toUpperCase(data[0].charAt(0)) + "" + Character.toUpperCase(data[1].charAt(0));
        if(set.containsKey(this.code)){
            int x = set.get(this.code);
            x += 1;
            set.put(this.code, x);
            this.code += String.format("%02d", x);
        }
        else{
            set.put(this.code, 1);
            this.code += "01";
        }
    }
    //
    private long getDiscount(){
        if(this.count > 10) return this.total * 5 / 100;
        else if(this.count >= 8) return this.total * 2 / 100;
        else if(this.count >= 5) return this.total / 100;
        else return 0;
    }
    //
    @Override
    public int compareTo(WareHouse x){
        return Long.compare(x.discount, this.discount);
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.discount + " " + this.res;
    }
}
//
public class Bang_Ke_Nhap_Kho_Sap_Xep_Theo_Chiet_Khau {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<WareHouse> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new WareHouse(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(solve);
        for(WareHouse x: solve){
            System.out.println(x);
        }
    }
}
