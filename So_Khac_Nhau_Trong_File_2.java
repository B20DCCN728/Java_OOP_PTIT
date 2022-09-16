package so_khac_nhau_trong_file_2;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;
import java.math.*;

public class So_Khac_Nhau_Trong_File_2 {
    /**
     * @CampusETH
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        DataInputStream data = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] solve = new int[100005];
        for(int i = 0;i < 100000;i++){
            solve[data.readInt()]++;
        }
        for(int i = 0;i < 1000;i++){
            if(solve[i] > 0) System.out.println(i + " " + solve[i]);
        }
        data.close();
    }
    
}
