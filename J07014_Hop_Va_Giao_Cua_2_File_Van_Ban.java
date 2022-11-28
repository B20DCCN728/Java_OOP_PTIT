//Created by Campus
package hop_va_giao_cua_2_file_van_ban;
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
    public String union(WordSet q){
        ArrayList<String> init = new ArrayList<>(solve);
        init.addAll(q.solve);
        TreeSet<String> res = new TreeSet<>(init);
        String tmp = "";
        for(String x: res){
            tmp += x + " ";
        }
        return tmp;
    }
    public String intersection(WordSet q){
        ArrayList<String> init = new ArrayList<>(solve);
        init.retainAll(q.solve);
        TreeSet<String> res = new TreeSet<>(init);
        String tmp = "";
        for(String x: res){
            tmp += x + " ";
        }
        return tmp;
    }
}
//
public class Hop_Va_Giao_Cua_2_File_Van_Ban {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
