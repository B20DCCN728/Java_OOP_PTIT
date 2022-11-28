//Created by Campus
package hoa_don_tien_nuoc;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Clients implements Comparable<Clients>{
    static int id = 0;
    private String code = "KH", name;
    private int first, last, count;
    private double total;
    public Clients(String name, int first, int last){
        id += 1;
        this.code += String.format("%02d", id);
        this.name = name;
        this.first = first;
        this.last = last;
        this.count = last - first;
        this.setData();
    }
    public void setData(){
        if(count <= 50) {
            this.total = 100 * count * 1.02;
        }
        else if(count <= 100) {
            this.total = (100 * 50 + 150 * (count - 50)) * 1.03;
        }
        else {
            this.total = (100 * 50 + 150 * 50 + 200 * (count - 100)) * 1.05;
        }
    }
    @Override
    public int compareTo(Clients s){
        return Double.compare(s.total, this.total);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + (int)Math.round(total);
    }
}
//
public class Hoa_Don_Tien_Nuoc {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Clients> solve = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            solve.add(new Clients(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Clients x: solve){
            System.out.println(x);
        }
    }
    
}
