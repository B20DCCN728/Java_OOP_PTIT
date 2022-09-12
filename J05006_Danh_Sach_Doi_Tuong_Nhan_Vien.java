package danh_sach_doi_tuong_nhan_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
/**
 * @CampusETH
 */
class Employee{
    public static int id = 0;
    private String code = "", name, sex, date, addr, taxCode, signDate;
    public Employee(Scanner sc){
        id++;
        this.code += String.format("%05d", id);
        this.name = sc.nextLine();
        this.sex = sc.nextLine();
        this.date = sc.nextLine();
        this.addr = sc.nextLine();
        this.taxCode = sc.nextLine();
        this.signDate = sc.nextLine();
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.sex + " " + this.date + " " + this.addr + " " + this.taxCode + " " + this.signDate;
    }
}
//
public class Danh_Sach_Doi_Tuong_Nhan_Vien {
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
        for(Employee x : set){
            System.out.println(x);
        }
    }
    
}
