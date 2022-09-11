package tinh_tong_file;

import java.io.*;
import java.util.*;

public class Tinh_Tong_FILE {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        long res = 0;
        File creat = new File("DATA.in");
        Scanner myReader = new Scanner(creat);
        while(myReader.hasNext()){
            String data = myReader.next();
            try{
                res += Integer.parseInt(data);
            } catch(Exception e){ 
            }
        }
        System.out.println(res);
    }
    
}
