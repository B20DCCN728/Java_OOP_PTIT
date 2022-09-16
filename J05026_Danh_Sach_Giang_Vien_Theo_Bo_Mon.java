package danh_sach_giang_vien_theo_bo_mon;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Teacher{
    static int id = 0;
    private String code = "GV", fullname, name, fullIndustry, industry = "";
    public Teacher(Scanner sc){
        id += 1;
        this.code += String.format("%02d", id);
        this.fullname = sc.nextLine();
        String[] splitFullName = this.fullname.split(" ");
        this.name = splitFullName[splitFullName.length - 1];
        this.fullIndustry = sc.nextLine();
        String[] Industry = this.fullIndustry.toUpperCase().split(" ");
        for(int i = 0;i < Industry.length;i++){
            this.industry += Industry[i].charAt(0);
        }
    }
    protected String getName(){
        return this.name;
    }
    protected String getCode(){
        return this.code;
    }
    protected String getFullIndusTry(){
        return this.fullIndustry;
    }
    protected String getIndustry(){
        return this.industry;
    }
    @Override 
    public String toString(){
        return this.code + " " + this.fullname + " " + this.industry;
    }    
}
//
public class Danh_Sach_Giang_Vien_Theo_Bo_Mon {
    static boolean isCheck(String solve, String tmp){
        if(solve.compareTo(tmp) == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Teacher(sc));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String solve = sc.nextLine();
            int ok = 0;
            for(Teacher x : set){
                if(isCheck(solve, x.getFullIndusTry())){
                    if(ok == 0) System.out.println("DANH SACH GIANG VIEN BO MON " + x.getIndustry() + ":");
                    ok = 1;
                    System.out.println(x);
                }
            }
        }
    }
    
}
