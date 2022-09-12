package sap_xep_danh_sach_doi_tuong_nhan_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Employee{
    public static int id = 0;
    private String code = "", name, sex, date, addr, taxCode, signDate, day, month, year;
    public Employee(Scanner sc){
        id++;
        this.code += String.format("%05d", id);
        this.name = sc.nextLine();
        this.sex = sc.nextLine();
        this.date = sc.nextLine();
        this.addr = sc.nextLine();
        this.taxCode = sc.nextLine();
        this.signDate = sc.nextLine();
        this.day = this.date.split("/")[0];
        this.month = this.date.split("/")[1];
        this.year = this.date.split("/")[2];
    }
    protected int getDay(){
        return Integer.parseInt(this.day);
    }
    protected int getMonth(){
        return Integer.parseInt(this.month);
    }
    protected int getYear(){
        return Integer.parseInt(this.year);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.sex + " " + this.date + " " + this.addr + " " + this.taxCode + " " + this.signDate;
    }
}
//
public class Sap_Xep_Danh_Sach_Doi_Tuong_Nhan_Vien {
    /**
     * @tradingview.com
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Employee(sc));
        }
        Collections.sort(set, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2){
                if(o1.getYear() != o2.getYear()) return o1.getYear() - o2.getYear();
                if(o1.getMonth() != o2.getMonth()) return o1.getMonth() - o2.getMonth();
                return o1.getDay() - o2.getDay();
        }
        });
        for(Employee x : set){
            System.out.println(x);
        }
    }
}
