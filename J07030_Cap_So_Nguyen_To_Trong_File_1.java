//Created by Campus
package cap_so_nguyen_to_trong_file_1_ver2;
import java.util.*;
import java.lang.*;
import java.text.*;
//Created by Campus
import java.io.*;
public class Cap_So_Nguyen_To_Trong_File_1_ver2 {
    static boolean isCheck(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream ob_1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob_2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ob_1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ob_2.readObject();
        Collections.sort(a);
        Collections.sort(b, Comparator.reverseOrder());
        int i = 0, j = 0;
        while(i < a.size()||j < b.size()){
            int n = a.get(i);
            int m = b.get(j);
            if(m <= n) break;
            if(n + m == 1000000){
                if(isCheck(n)&&isCheck(m)) System.out.println(n + " " + m);
                i += 1;
                j += 1;
            }
            else if(n + m < 1000000) i += 1;
            else j += 1;
        }
    }
    
}
