package sap_xep_danh_sach_giang_vien;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class Teacher{
    static int id = 0;
    private String code = "GV", fullname, name, industry = "";
    public Teacher(Scanner sc){
        id += 1;
        this.code += String.format("%02d", id);
        this.fullname = sc.nextLine();
        String[] splitFullName = this.fullname.split(" ");
        this.name = splitFullName[splitFullName.length - 1];
        String[] Industry = sc.nextLine().toUpperCase().split(" ");
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
    @Override 
    public String toString(){
        return this.code + " " + this.fullname + " " + this.industry;
    }    
}

public class SaP_Xep_Danh_Sach_Giang_Vien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Teacher(sc));
        }
        Collections.sort(set, new Comparator<Teacher>(){
            @Override 
            public int compare(Teacher o1, Teacher o2){
                if(o1.getName().compareTo(o2.getName()) != 0) return o1.getName().compareTo(o2.getName());
                else return o1.getCode().compareTo(o2.getCode());
            }
        });
        for(Teacher x : set){
            System.out.println(x);
        }
    }
}