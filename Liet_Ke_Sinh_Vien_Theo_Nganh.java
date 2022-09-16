package liet_ke_sinh_vien_theo_nganh;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Student{
    private String code, name, eclass, email;
    public Student(Scanner sc){
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.eclass = sc.nextLine();
        this.email = sc.nextLine();
    }
    protected String getEclass(){
        return this.eclass;
    }
    protected String getCode(){
        return this.code;
    }
    @Override 
    public String toString(){
        return this.code + " " + this.name + " " + this.eclass + " " + this.email;
    }
}
//
public class Liet_Ke_Sinh_Vien_Theo_Nganh {
    static boolean isCheck(String solve, String eclass, String code){
        if(solve.compareTo("ke toan") == 0 && code.contains("DCKT")) return true;
        if(solve.compareTo("vien thong") == 0&& code.contains("DCVT")) return true;
        if(solve.compareTo("dien tu") == 0 && code.contains("DCDT")) return true;
        if((solve.compareTo("cong nghe thong tin") == 0 &&code.contains("DCCN"))||(solve.compareTo("an toan thong tin") == 0&& code.contains("DCAT"))){
            if(eclass.charAt(0) != 'E') return true;
            return false;
        }
        return false;      
    }
    /**
     * @param args the command line arg uments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String tmp = sc.nextLine().toLowerCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + tmp.toUpperCase() + ":");
            for(Student x : solve){
                if(isCheck(tmp, x.getEclass(), x.getCode())){
                    System.out.println(x);
                }
            }
        }
    }
    
}
