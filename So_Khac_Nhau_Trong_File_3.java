package so_khac_nhau_trong_file_3;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class So_Khac_Nhau_Trong_File_3 {
    /**
     * @CampusETH
     */
    public static void main(String[] args) throws IOException, ClassCastException, ClassNotFoundException{
        // TODO code application logic here
        ObjectInputStream data = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> solve = (ArrayList<Integer>) data.readObject();
        data.close();
        int[] res = new int[10001];
        for(int x: solve){
            res[x]++;
        }
        for(int i = 0;i <= 1000;i++){
            if(res[i] > 0) System.out.println(i + " " + res[i]);
        }
    }
    
}
