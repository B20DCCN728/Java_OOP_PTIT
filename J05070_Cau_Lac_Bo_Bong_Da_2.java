//Created by Campus
package cau_lac_bo_bong_da;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class InfoOfMatch implements Comparable<InfoOfMatch>{
    private String code, name;
    private int count, total;
    public InfoOfMatch(String code, int count){
        this.code = code;
        this.count = count;
        this.total = this.count * Club.Item.get(this.code.substring(1, 3)).getPrice();
        this.name = Club.Item.get(code.substring(1, 3)).getName();
    } 
    @Override
    public int compareTo(InfoOfMatch s){
        if(this.total != s.total) return s.total - this.total;
        return this.name.compareTo(s.name);
    }
    @Override
    public String toString(){
        return this.code + " " + name + " " + this.total;
    }
}

//
public class Club {
    private String code, name;
    private int price;
    static HashMap<String, Club> Item = new HashMap<>();
    public Club(String code, String name, int price){
        this.code = code;
        this.name = name;
        this.price = price;
    }
    public Club(){      
    }
    protected String getName(){
        return this.name;
    }
    protected String getCode(){
        return this.code;
    }
    protected int getPrice(){
        return this.price;
    }
}
//
class Cau_Lac_Bo_Bong_Da {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Club tmp = new Club(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            Club.Item.put(tmp.getCode(), tmp);
        }
        ArrayList<InfoOfMatch> solve = new ArrayList<>();
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String data[] = sc.nextLine().split(" ");
            solve.add(new InfoOfMatch(data[0], Integer.parseInt(data[1])));
        }
        Collections.sort(solve);
        for(InfoOfMatch x: solve){
            System.out.println(x);
        }
    }
    
}
