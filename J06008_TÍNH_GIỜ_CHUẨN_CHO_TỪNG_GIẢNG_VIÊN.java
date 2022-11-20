//Created by Campus
package tinh_gio_chuan_cho_tung_giang_vien;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
class Pair<T, S> {
    private T first;
    private S second;
    public Pair(T first, S second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return this.first;
    }
    public S getSecond(){
        return this.second;
    }
}
class Subject {
    static HashMap<String, String> Campus = new HashMap<>();
    public Subject(){
    } 
    static void put(String code, String name){
        Campus.put(code, name); 
    }
    public String get(String i){
        return Campus.get(i);
    }
}
class Teacher {
    private String code, name;
    private double total = 0;
    private ArrayList<Pair<String, Double>> listSubject = new ArrayList<>();
    private Subject subject;
    public Teacher(String code, String name){
        this.code = code;
        this.name = name;
        this.subject = new Subject();
    }
    public String getCode(){
        return this.code;
    }
    public void add(String codeSubject, Double point){
        listSubject.add(new Pair<String, Double>(subject.get(codeSubject), point));
        this.total += point;
    }
    public void Out(){
        System.out.println("Giang vien: " + this.name);
        for(int i = 0;i < listSubject.size();i++){
            System.out.println(listSubject.get(i).getFirst() + " " + listSubject.get(i).getSecond());
        }
        System.out.println("Tong: " + String.format("%.2f", this.total));
    }
}

public class Tinh_Gio_Chuan_Cho_Tung_Giang_Vien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String cmp = sc.nextLine();
            Subject.put(cmp.substring(0, 7), cmp.substring(8));
        }
        HashMap<String, Teacher> solve = new HashMap<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String otd = sc.nextLine();
            Teacher tmp = new Teacher(otd.substring(0, 4), otd.substring(5));
            solve.put(tmp.getCode(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String cmd[] = sc.nextLine().split(" ");
            solve.get(cmd[0]).add(cmd[1], Double.parseDouble(cmd[2]));
        }
        String test = sc.nextLine();
        solve.get(test).Out();
    }
}
