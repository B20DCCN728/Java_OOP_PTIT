//Created by Campus
package quan_li_bai_tap_nhom_2;
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
    public String getTopic(int x){
        return a.get(x);
    }
}
//
class Developer implements Comparable<Developer> {
    private String code, name, phoneNumber;
    private int numTopic;
    private Topic topic;
    public Developer(String code, String name, String phoneNumber, int numTopic){
        this.code = code;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.numTopic = numTopic;
        this.topic = new Topic();
    }
    @Override
    public int compareTo(Developer x){
        return this.code.compareTo(x.code);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.phoneNumber + " " + this.numTopic + " " + this.topic.getTopic(this.numTopic);
    }
}

//
public class Quan_Li_Bai_Tap_Nhom_2 {
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
        Collections.sort(solve);
        for(Developer x: solve){
            System.out.println(x);
        }
    }
    
}
