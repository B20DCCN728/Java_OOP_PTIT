package sap_xep_danh_sach_mat_hang;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Items{
    public static int id = 0;
    private String code, name, group;
    private double profit;
    public Items(Scanner sc){
        id++;
        this.code = String.valueOf(id);
        this.name = sc.nextLine();
        this.group = sc.nextLine();
        this.profit = 0 - Double.parseDouble(sc.nextLine()) + Double.parseDouble(sc.nextLine());
    }
    protected double getProfit(){
        return this.profit;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.group + " " + String.format("%.2f", this.profit);
    }
}
//
class sortTheItems implements Comparator<Items>{
    @Override
    public int compare(Items o1, Items o2){
        return Double.compare(o2.getProfit(), o1.getProfit());
    }
}
//
public class Sap_Xep_Danh_Sach_Mat_Hang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Items> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Items(sc));
        }
        Collections.sort(set, new sortTheItems());
        for(Items x : set){
            System.out.println(x);
        }
    }
    
}
