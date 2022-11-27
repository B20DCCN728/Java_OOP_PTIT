//Created by Campus
package diem_danh_2;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Student {
    private String code, name, clas, finalStatus;
    private int score;
    public Student(String code, String name, String clas){
        this.code = code;
        this.name = name;
        this.clas = clas;
    }
    public void setData(String data){
        int res = 10;
        for(int i = 0;i < data.length();i++){
            if(data.charAt(i) == 'v') res -= 2;
            else if(data.charAt(i) == 'm') res -= 1;
            else res -= 0;
        }
        if(res <= 0) this.score = 0;
        else this.score = res;
        if(this.score == 0) this.finalStatus = "0 KDDK";
        else this.finalStatus = String.valueOf(res);
    }
    public String getClas(){
        return this.clas;
    }
    public String getCode(){
        return this.code;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.clas + " " + finalStatus;
    }
}
//
public class Diem_Danh_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, Student> solve = new LinkedHashMap<>();
        for(int i = 0;i < n;i++){
            Student tmp = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
            solve.put(tmp.getCode(), tmp);
        }
        for(int i = 0;i < n;i++){
            String cnt[] = sc.nextLine().split(" ");
            solve.get(cnt[0]).setData(cnt[1]);
        }
        String check = sc.nextLine();
        for(Map.Entry<String, Student> x: solve.entrySet()){
            if(x.getValue().getClas().equals(check)){
                System.out.println(x.getValue());
            }
        }
    }
    
}
