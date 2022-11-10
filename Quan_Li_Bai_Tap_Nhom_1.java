//Created by Campus
package quan_li_bai_tap_nhom_1;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
class Topic {
    private String topic;
    private static HashMap<Integer, String> a = new HashMap<>();
    public static void setTopic(int i, String s){
        a.put(i, s);
    }
    public Topic(){
    }
    public static String getTopic(int x){
        return a.get(x);
    }   
}

//
class Developer {
    private String code, name, phoneNumber;
    private int numTopic;
    public Developer(String code, String name, String phoneNumber, int numTopic){
        this.code = code;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.numTopic = numTopic;
    }
    public int getNumTopic(){
        return this.numTopic;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.phoneNumber;
    }  
}

//
public class Quan_Li_Bai_Tap_Nhom_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] k = sc.nextLine().split(" ");
        ArrayList<Developer> solve = new ArrayList<>();
        for(int i = 0;i < Integer.parseInt(k[0]);i++){
            solve.add(new Developer(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        for(int i = 0;i < Integer.parseInt(k[1]);i++){   
            Topic.setTopic(i + 1, sc.nextLine());
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int p = sc.nextInt();
            System.out.println("DANH SACH NHOM " + p + ":");
            for(Developer x: solve){
                if(x.getNumTopic() == p) System.out.println(x);
            }
            System.out.println("Bai tap dang ky: " + Topic.getTopic(p));
        }
    }
}
