//Created by Campus
package tinh_tien_dien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Electricity {
    static int id = 0;
    private String code = "KH", type;
    private long change, k, money, bonus, total;
    public Electricity(String type, long previous, long latest){
        id += 1;
        this.code += String.format("%02d", id);
        this.type = type;
        this.k = this.getK();
        this.change = latest - previous;
        this.money = this.change * this.k * 550;
        this.bonus = this.getBonus();
        this.total = this.money + this.bonus;
    }
    //
    private long getK(){
        if(this.type.compareTo("KD") == 0) return 3;
        else if(this.type.compareTo("NN") == 0) return 5;
        else if(this.type.compareTo("TT") == 0) return 4;
        else return 2; 
    }
    //
    private long getBonus(){
        if(this.change < 50) return 0;
        else if(this.change >= 50&&this.change <= 100) return (long)Math.round((double)(this.money * 35) / 100);
        else return this.money;
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.k + " " + this.money + " " + this.bonus + " " + this.total;
    }
}
//
public class Tinh_Tien_Dien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Electricity> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Electricity(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        for(Electricity x: solve){
            System.out.println(x);
        }
    }
    
}
