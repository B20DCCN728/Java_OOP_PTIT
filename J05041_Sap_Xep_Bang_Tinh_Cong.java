//Created by Campus
package sap_xep_bang_tinh_cong;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Salary implements Comparable<Salary> {
    static int id = 0;
    private String code = "NV", name, position;
    private long day, salary, bonus, allowance, total;
    public Salary(String name, long salary, long day, String position){
        id += 1;
        this.code += String.format("%02d", id);
        this.name = name;
        this.day = day;
        this.position = position;
        this.salary = salary * day;
        this.bonus = this.getBonus();
        this.allowance = this.getAllowance();
        this.total = this.salary + this.bonus + this.allowance;
    }
    //
    private long getAllowance(){
        if(this.position.compareTo("GD") == 0) return 250000;
        else if(this.position.compareTo("PGD") == 0) return 200000;
        else if(this.position.compareTo("TP") == 0) return 180000;
        else return 150000;
    }
    //
    private long getBonus(){
        if(this.day >= 25) return this.salary * 20 / 100;
        else if(this.day >= 22) return this.salary * 10 / 100;
        else return 0;
    }
    //
    @Override
    public int compareTo(Salary x){
        return Long.compare(x.total, this.total);
    }
    //
    @Override 
    public String toString(){
        return this.code + " " + this.name + " " + this.salary + " " + this.bonus + " " + this.allowance + " " + this.total;
    }
}
//
public class Sap_Xep_Bang_Tinh_Cong {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Salary> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Salary(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Salary x: solve){
            System.out.println(x);
        }
    }
    
}
