package loai_bo_so_nguyen;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Loai_Bo_So_Nguyen {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> set = new ArrayList<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            try {
                Integer.parseInt(tmp);
            } catch (Exception e) {
                set.add(tmp);
            }
        }
        Collections.sort(set);
        for(String x : set){
            System.out.print(x + " ");
        }
    }
    
}
