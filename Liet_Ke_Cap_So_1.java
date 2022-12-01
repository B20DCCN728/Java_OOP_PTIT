//Created by Campus
package test;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
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
