//Created by Campus
package lop_hoc_phan_2;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Group implements Comparable<Group>{
    private String code, name, group, teacher;
    public Group(String code, String name, String group, String teacher){
        this.code = code;
        this.name = name;
        this.group = group;
        this.teacher = teacher;
    }
    public String getCode(){
        return this.code;
    }
    public String getTeacher(){
        return this.teacher;
    }
    @Override
    public int compareTo(Group s){
        if(!this.code.equals(s.code)) return this.code.compareTo(s.code);
        return Integer.parseInt(this.group) - Integer.parseInt(s.group);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.group;
    }
}

//
public class Lop_Hoc_Phan_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Group> solve = new ArrayList<>();
        HashMap<String, Group> data = new HashMap<>();
        for(int i = 0;i < n;i++){
            Group tmp = new Group(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            data.put(tmp.getTeacher(), tmp);
            solve.add(tmp);
        }
        Collections.sort(solve);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String check = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + data.get(check).getTeacher() + ":");
            for(int i = 0;i < n;i++){
                if(solve.get(i).getTeacher().equals(check)){
                    System.out.println(solve.get(i));
                }
            }
        }
    }
}
