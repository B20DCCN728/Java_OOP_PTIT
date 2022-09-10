package bai_toan_tinh_cong;

import java.util.*;
import java.lang.*;
import java.text.*;

class Employee{
    //static int id = 0;
    private String name, job, code = "NV01";
    private int salary, date;
    
    public Employee(Scanner sc){
        this.name = sc.nextLine();
        this.salary = Integer.parseInt(sc.nextLine());
        this.date = Integer.parseInt(sc.nextLine());
        this.job = sc.nextLine();
        /*
        id++;
        if(id < 10) this.code += ("0" + Integer.toString(id));
        else this.code += Integer.toString(id);
        this.code = "NV" + this.code;
        */
    }
    
    protected String getCode(){
        return this.code;
    }
    
    protected String getName(){
        return this.name;
    }
    
    protected int getSalary(){
        return this.date * this.salary;
    }
    
    protected int getBonus(){
        if(this.date >= 25) return getSalary() / 5;
        if(this.date >= 22 && this.date < 25) return getSalary() / 10;
        return 0;
    }
    
    protected int getSubsidize(){
        if(this.job.compareTo("GD") == 0) return 250000;
        if(this.job.compareTo("PGD") == 0) return 200000;
        if(this.job.compareTo("TP") == 0) return 180000;
        return 150000;
    }
    
    protected int getProfit(){
        return getBonus() + getSalary() + getSubsidize();
    }
}

public class Bai_Toan_Tinh_Cong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Employee x = new Employee(sc);
        System.out.println(x.getCode() + " " + x.getName() + " " + x.getSalary() + " " + x.getBonus() + " " + x.getSubsidize() + " " + x.getProfit());
    }
    
}
