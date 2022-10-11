//Created by Campus
package cap_so_nguyen_to_trong_file_2;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
public class Cap_So_Nguyen_To_Trong_File_2 {
    static boolean isCheck(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here
        ObjectInputStream ob_1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob_2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ob_1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ob_2.readObject();
        Collections.sort(a);
        int i = 0;
        int j = a.size() - 1;
        while(i < j){
            int n = a.get(i);
            int m = a.get(j);
            if(n == m) {
                break;
            }
            if(n + m == 1000000){
                if(isCheck(n)&&isCheck(m)&&!b.contains(m)&&!b.contains(n)) System.out.println(n + " " + m);
                i += 1;
                j -= 1;
            }
            else if(n + m < 1000000) i += 1;
            else j -= 1;
        }
    }
    
}
