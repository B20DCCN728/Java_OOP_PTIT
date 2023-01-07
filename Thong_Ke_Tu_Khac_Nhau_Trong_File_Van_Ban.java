//Created by Campus
package thong_ke_tu_khac_nhau_trong_file_van_ban;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//
public class Thong_Ke_Tu_Khac_Nhau_Trong_File_Van_Ban {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        String regex = "[\\w]+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        TreeMap<String, Integer> res = new TreeMap<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String solve = sc.nextLine();
            Matcher matcher = pattern.matcher(solve);
            while(matcher.find()){
                String tmp = solve.substring(matcher.start(), matcher.end()).toLowerCase();
                if(!res.containsKey(tmp)){
                    res.put(tmp, 1);
                }
                else {
                    res.put(tmp, res.get(tmp) + 1);
                }
            }
        }
        ArrayList<Map.Entry<String, Integer>> data = new ArrayList<>(res.entrySet());
        Collections.sort(data, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });
        for(Map.Entry<String, Integer> entry: data){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
