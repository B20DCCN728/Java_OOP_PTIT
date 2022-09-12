package liet_ke_tu_khac_nhau;
import java.io.*;
import java.util.*;
import java.math.*;

class WordSet{
    TreeSet<String> set;
    public WordSet(String file) throws FileNotFoundException{
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }
    @Override
    public String toString(){
        String s = "";
        for(String x : set){
            s += x + "\n";
        }
        return s;
    }
}

public class Liet_Ke_Tu_Khac_Nhau {
    /**
     * @CampusETH
     */
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}   
