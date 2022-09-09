package tinh_thu_nhap_nhan_vien;
import java.util.*;
import java.lang.*;
class Salary{
    //
    private String hahCode, teachCode, name;
    private int salary, allowance, levelSalary;
    //
    public Salary(String teachCode, String name, int salary){
        this.hahCode = teachCode;
        this.teachCode = teachCode.substring(0, 2);
        this.levelSalary = Integer.parseInt(teachCode.substring(2));
        this.name = name;
        this.salary = salary;
        if(this.teachCode.compareTo("HT") == 0){
            this.allowance = 2000000;
        }
        else if(this.teachCode.compareTo("HP") == 0){
            this.allowance = 900000;
        }
        else this.allowance = 500000;
    }
    protected String getTeachCode(){
        return this.hahCode;
    }
    protected String getName(){
        return this.name;
    }
    protected int getAllowance(){
        return this.allowance;
    }
    protected int getLevelSalary(){
        return this.levelSalary;
    }
    protected int getSalary(){
        int solve = this.levelSalary * this.salary + this.allowance;
        return solve;
    }
}
public class Tinh_Thu_Nhap_Nhan_Vien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String teachCode = sc.nextLine();
        String name = sc.nextLine();
        int salary = Integer.parseInt(sc.nextLine());
        Salary A = new Salary(teachCode, name, salary);
        System.out.println(A.getTeachCode() + " " + A.getName() + " " + A.getLevelSalary() + " " + A.getAllowance() + " " + A.getSalary());
    }
    
}
