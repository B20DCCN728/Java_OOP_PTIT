//Created by Campus
package test;
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
    @Override
    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}

//
public class test {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> solve = (ArrayList<Pair>) ois.readObject();
        Collections.sort(solve);
        Pair tmp = null;
        for(int i = 0;i < solve.size();i++){
            if(solve.get(i).getFirst() < solve.get(i).getSecond()){
                if(tmp == null||!tmp.equals(solve.get(i))){
                    System.out.println(solve.get(i));
                    tmp = solve.get(i);
                }
            }
        }
    }
    
}
