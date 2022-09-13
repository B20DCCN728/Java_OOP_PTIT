package chuan_hoa_xau_ho_ten_trong_file;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Chuan_Hoa_Xau_Ho_Ten_Trong_File {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File data = new File("DATA.in");
        Scanner solve = new Scanner(data);
        ArrayList<String> set = new ArrayList<>();
        while (solve.hasNextLine()) {
            String tmp = solve.nextLine();
            if(tmp.compareTo("END") == 0) break;
            set.add(tmp.trim().toLowerCase().replaceAll("\\s+", " "));
        }
        for(int i = 0;i < set.size();i++){
            String[] tmp = set.get(i).split(" ");
            String re_set = "";
            for(int j = 0;j < tmp.length;j++){
                re_set += Character.toUpperCase(tmp[j].charAt(0)) + tmp[j].substring(1);
                re_set += " ";
            }
            re_set.trim();
            set.set(i, re_set);
        }
        for(String x : set){
            System.out.println(x);
        }
    }
    
}
