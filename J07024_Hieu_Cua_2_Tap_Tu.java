//Created by Campus
package hieu_cua_2_tap_tu;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class WordSet {
    private ArrayList<String> solve = new ArrayList<>();
    public WordSet(String fileName) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNext()){
            this.solve.add(sc.next().toLowerCase());
        }
    }
    public String difference(WordSet q){
        ArrayList<String> init = new ArrayList<>(solve);
        init.removeAll(q.solve);
        TreeSet<String> res = new TreeSet<>(init);
        String tmp = "";
        for(String x: res){
            tmp += x + " ";
        }
        return tmp;
    }
}
//
public class Hieu_Cua_2_Tap_Tu {
    public static void main(String[] args) throws IOException {
            WordSet s1 = new WordSet("DATA1.in");
            WordSet s2 = new WordSet("DATA2.in");
            System.out.println(s1.difference(s2));
            System.out.println(s2.difference(s1));
        }
}
