package khai_bao_lop_nhan_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
//
class Employee{
    private String employeeCode = "00001";
    private String name;
    private String sex;
    private String dateOfBirth;
    private String address;
    private String taxCode;
    private String contractSigningDate;
    public Employee(Scanner sc){
        this.name = sc.nextLine();
        this.sex = sc.next();
        this.dateOfBirth = sc.next();
        String s = sc.nextLine();
        //String c = sc.nextLine();
        this.address = sc.nextLine();
        this.taxCode = sc.next();
        this.contractSigningDate = sc.next();
    }
    protected String getEmployeeCode(){
        return employeeCode;
    }
    protected String getName(){
        return name;
    }
    protected String getSex(){
        return sex;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    protected String getAddress(){
        return this.address;
    }
    protected String getTaxCode(){
        return this.taxCode;
    }
    protected String getContractSigningDate(){
        return this.contractSigningDate;
    }
}
//
public class Khai_Bao_Lop_Nhan_Vien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Employee christine = new Employee(sc);
        System.out.println(christine.getEmployeeCode() + " " + christine.getName() + " " + christine.getSex() + " " + christine.getDateOfBirth() + " " + christine.getAddress() + " " + christine.getTaxCode() + " " + christine.getContractSigningDate());
    }
    
}
