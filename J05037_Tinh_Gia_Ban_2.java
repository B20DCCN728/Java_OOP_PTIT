//Created by Campus
package tinh_gia_ban_2;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Calculate implements Comparable<Calculate>{
    static int id = 0;
    private String code = "MH", name, unit;
    private long fee, money, sellPrice;
    public Calculate(String name, String unit, long price, long count){
        id += 1;
        this.code += String.format("%02d", id);
        this.name = name;
        this.unit = unit;
        this.fee = Math.round((double)(price * count * 5) / 100);
        this.money = Math.round((double)(price * count + this.fee));
        this.sellPrice = (long)Math.ceil((double)((this.money + Math.round((double)(this.money * 2) / 100)) / count) / 100) * 100;
    }
    //
    @Override
    public int compareTo(Calculate s){
        return Long.compare(s.sellPrice, this.sellPrice);
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.unit + " " + this.fee + " " + this.money + " " + this.sellPrice;
    }
}
//
public class Tinh_Gia_Ban_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Calculate> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Calculate(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(set);
        for(Calculate x: set){
            System.out.println(x);
        }
    }
    
}
