//CampusETH
package so_nguyen_to_trong_file_nhi_phan;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
public class So_Nguyen_To_Trong_File_Nhi_Phan {
    static boolean isCheck(int n){
        if(n == 1||n == 0) return false;
        if(n == 2) return true;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    /**
     * @Code 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> data = (ArrayList<Integer>) file.readObject();
        file.close();
        TreeMap<Integer, Integer> set = new TreeMap<>();
        for(int i = 0;i < data.size();i++){
            if(set.containsKey(data.get(i))){
                int x = set.get(data.get(i));
                x++;
                set.put(data.get(i), x);
            }
            else {
                if(!isCheck(data.get(i))) continue;;
                set.put(data.get(i), 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : set.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    
}
