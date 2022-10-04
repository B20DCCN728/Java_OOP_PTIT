//Created by Campus
package danh_sach_thuc_tap_1;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.*;
//
class Trainning implements Comparable<Trainning>{
    static int id = 0;
    private String num, code, fullName, group, email, enterprise;
    public Trainning(String code, String fullName, String group, String email, String enterprise){
        id += 1;
        this.num = String.valueOf(id);
        this.code = code;
        this.fullName = fullName;
        this.group = group;
        this.email = email;
        this.enterprise = enterprise;
    } 
    //
    protected String getEnterprise(){
        return this.enterprise;
    }
    //
    @Override
    public int compareTo(Trainning s){
        return this.fullName.compareTo(s.fullName);
    }
    //
    @Override
    public String toString(){
        return this.num + " " + this.code + " " + this.fullName + " " + this.group + " " + this.email + " " + this.enterprise;
    }
}
//
public class Danh_Sach_Thuc_Tap_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Trainning> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Trainning(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String query = sc.nextLine();
            for(Trainning x: solve){
                if(x.getEnterprise().compareTo(query) == 0) System.out.println(x);
            }
        }
    }
    
}
