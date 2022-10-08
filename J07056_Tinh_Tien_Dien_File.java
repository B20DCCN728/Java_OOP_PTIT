//Created by Campus
package tinh_tien_dien_file;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Electricity implements Comparable<Electricity> {
    static int id = 0;
    private String code = "KH", name = "", type;
    private long first, end, compare, change, in, out, vat, total;
    public Electricity(String notName, String type , long first, long end){
        id += 1;
        this.code += String.format("%02d", id);
        String[] a = notName.trim().toLowerCase().split("\\s+");
        for(int i = 0;i < a.length;i++){ 
            this.name += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1) + " ";
        }
        this.name = this.name.trim();
        this.first = first;
        this.end = end;
        this.type = type;
        this.change = this.end - this.first;
        this.compare = this.getCompare();
        this.in = this.getIn();
        this.out = this.getOut();
        this.vat = this.getVat();
        this.total = this.in + this.out + this.vat;
    }
    //
    private long getCompare(){
        if(this.type.compareTo("A") == 0) return 100;
        else if(this.type.compareTo("B") == 0) return 500;
        else return 200;
    }
    //
    private long getIn(){
        if(this.change <= this.compare) return this.change * 450;
        else return this.compare * 450;
    }
    //
    private long getOut(){
        if(this.change <= this.compare) return 0;
        else return (this.change - this.compare) * 1000;
    }
    //
    private long getVat(){
        return this.out * 5 / 100;
    }
    //
    @Override
    public int compareTo(Electricity x){
        return Long.compare(x.total, this.total);
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.in + " " + this.out + " " + this.vat + " " + this.total;
    }
}

//
public class Tinh_Tien_Dien_File {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Electricity> solve = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String[] data = sc.nextLine().split(" ");
            solve.add(new Electricity(name, data[0], Long.parseLong(data[1]), Long.parseLong(data[2])));
        }
        Collections.sort(solve);
        for(Electricity x: solve){
            System.out.println(x);
        }
    }
    
}
