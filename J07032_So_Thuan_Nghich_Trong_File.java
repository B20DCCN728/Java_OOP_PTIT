//Created by Campus
package so_thuan_nghich_trong_file;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
public class So_Thuan_Nghich_trong_File {
    static boolean isCheck(int n){
        String solve = String.valueOf(n);
        if(solve.length() < 2||solve.length() % 2 == 0||solve.charAt(solve.length() / 2) % 2 == 0) 
                return false;
        else {
            for(int i = 0;i < solve.length();i++){
                if(solve.charAt(i) != solve.charAt(solve.length() - i - 1)||solve.charAt(i) % 2 == 0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream ob_1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob_2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> data_1 = (ArrayList<Integer>) ob_1.readObject();
        ArrayList<Integer> data_2 = (ArrayList<Integer>) ob_2.readObject();
        int[] count  = new int[1000001];
        for(int x: data_1){
            count[x]++;
        }
        TreeSet<Integer> res = new TreeSet<>();
        for(int x: data_2){
            if(count[x] > 0&&isCheck(x)){
                res.add(x);
                count[x]++;
            }
        }
        int i = 0;
        for(int x: res){
            System.out.println(x + " " + count[x]);
            i++;
            if(i == 10) break;
        }
    }
}
    
