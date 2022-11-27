//Created by Campus
package lop_hoc_phan_1;
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
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Group s){
        return Integer.parseInt(this.group) - Integer.parseInt(s.group);
    }
    @Override
    public String toString(){
        return this.group + " " + this.teacher;
    }
}

//
public class Lop_Hoc_Phan_1 {
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
            data.put(tmp.getCode(), tmp);
            solve.add(tmp);
        }
        Collections.sort(solve);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String check = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + data.get(check).getName() + ":");
            for(int i = 0;i < n;i++){
                if(solve.get(i).getCode().equals(check)){
                    System.out.println(solve.get(i));
                }
            }
        }
    }
    
}
