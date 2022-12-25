//Created by Campus
package bang_diem_theo_lop;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class Students {
    private String code, name = "", group, email;
    public Students(String code, String nameNotFormat, String group, String email){
        this.code = code;
        String [] tmp = nameNotFormat.trim().toLowerCase().split("\\s+");
        for(int i = 0;i < tmp.length;i++){
            this.name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1) + " ";
        }
        this.name = this.name.trim();
        this.name = name;
        this.group = group;
        this.email = email;
    }
    public String getCode(){    
        return code;
    }    
    public String getGroup(){
        return group;
    }
    @Override
    public String toString(){
        return code + " " + name;
    }    
}
//
class Subjects {
    private String code, name, count;
    public Subjects(String code, String name, String count){
        this.code = code;
        this.name = name;
        this.count = count;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }    
    @Override
    public String toString(){
        return code + " " + name;
    }
}
//
class Points implements Comparable<Points> {
    private Students stu;
    private Subjects sub;
    private String point;
    public Points(Students stu, Subjects sub, String point){
        this.stu = stu;
        this.sub = sub;
        this.point = point;
    }
    public String getGroup(){
        return stu.getGroup();
    }
    @Override
    public int compareTo(Points x){
        if(!this.sub.getCode().equals(x.sub.getCode())) return this.sub.getCode().compareTo(x.sub.getCode());
        return this.stu.getCode().compareTo(x.stu.getCode());
    }
    @Override
    public String toString(){
        return stu + " " + sub + " " + point;
    }
}
//
public class Bang_Diem_Theo_Lop {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner f1 = new Scanner(new File("SINHVIEN.in"));
        Scanner f2 = new Scanner(new File("MONHOC.in"));
        Scanner f3 = new Scanner(new File("BANGDIEM.in"));
        HashMap<String, Students> students = new HashMap<>();
        int n = Integer.parseInt(f1.nextLine());
        for(int i = 0;i < n;i++){
            Students tmp = new Students(f1.nextLine(), f1.nextLine(), f1.nextLine(), f1.nextLine());
            students.put(tmp.getCode(), tmp);
        }
        HashMap<String, Subjects> subjects = new HashMap<>();
        n = Integer.parseInt(f2.nextLine());
        for(int i = 0;i < n;i++){
            Subjects tmp = new Subjects(f2.nextLine(), f2.nextLine(), f2.nextLine());
            subjects.put(tmp.getCode(), tmp);
        }
        ArrayList<Points> res = new ArrayList<>();
        n = Integer.parseInt(f3.nextLine());
        for(int i = 0;i < n;i++){
            String [] tmp = f3.nextLine().split(" ");
            res.add(new Points(students.get(tmp[0]), subjects.get(tmp[1]), tmp[2]));
        }
        Collections.sort(res);
        int t = Integer.parseInt(f3.nextLine());
        while(t-- > 0){
            String s = f3.nextLine();
            System.out.println("BANG DIEM lop " + s + ":");
            for(Points x: res){
                if(s.equals(x.getGroup())){
                    System.out.println(x);
                }
            }
        }
    }
}
