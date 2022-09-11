package so_khac_nhau_trong_file_1;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;
import java.math.*;

public class So_Khac_Nhau_Trong_File_1 {
    /**
     * @CampusETH
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeSet<Integer> set = new TreeSet<>();
        int[] count = new int[100005];
        while(sc.hasNext()){
            int solve = Integer.parseInt(sc.next());
            count[solve]++;
            set.add(solve);
        }
        for(int x : set){
            System.out.println(x + " " + count[x]);
        }
    }
    
}
