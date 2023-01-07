//Created by Campus
package thong_ke_tu_khac_nhau_trong_file_nhi_phan;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
//
public class Thong_Ke_Tu_Khac_Nhau_Trong_File_Nhi_Phan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream obs = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> data = (ArrayList<String>) obs.readObject();
        String reGex = "[\\w]+";
        Pattern pattern = Pattern.compile(reGex, Pattern.CASE_INSENSITIVE);
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i = 0;i < data.size();i++){
            String solve = data.get(i);
            Matcher matcher = pattern.matcher(solve);
            while(matcher.find()){
                String tmp = solve.substring(matcher.start(), matcher.end()).toLowerCase();
                if(!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                }
                else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }
        }
        ArrayList<Map.Entry<String, Integer>> res = new ArrayList<>(map.entrySet());
        Collections.sort(res, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                if(o2.getValue() != o1.getValue()) return o2.getValue() - o1.getValue();
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<String, Integer> entry: res){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    
}
