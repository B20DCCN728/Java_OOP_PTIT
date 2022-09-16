package tim_kiem_giang_vien;
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
        return this.fullname;
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
public class Tim_Kiem_Giang_Vien {
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
            String solve = sc.next();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + solve + ":");
            solve = solve.toLowerCase();
            for(Teacher x : set){
                if(x.getName().toLowerCase().contains(solve)){
                    System.out.println(x);
                }
            }
        }
    }
}
