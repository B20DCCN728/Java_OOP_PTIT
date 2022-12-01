//Created by Campus
package test;
//package liet_ke_cap_so_2;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Pair implements Serializable, Comparable<Pair> {
    private int first, second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
    public int getFirst(){
        return first;
    }
    public int getSecond(){
        return second;
    }
    @Override
    public int compareTo(Pair o){
        return this.first - o.first;
    }
    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}
//
//public class Liet_Ke_Cap_So_2 {
public class Test {
    static boolean isCheck(int a, int b){
        while(a * b != 0){
            if(a > b) a %= b;
            else b %= a;
        }
        if(a + b == 1) return true;
        else return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream obs = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> solve = (ArrayList<Pair>) obs.readObject();
        Pair tmp = null;
        Collections.sort(solve);
        for(int i = 0;i < solve.size();i++){
            if((solve.get(i).getFirst() < solve.get(i).getSecond())&&isCheck(solve.get(i).getFirst(), solve.get(i).getSecond())){
                if(tmp == null||!tmp.equals(solve.get(i))){
                    System.out.println(solve.get(i));
                }
            }
        }
    }
    
}
