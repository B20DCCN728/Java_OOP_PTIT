package loc_email_trung_nhau;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
public class Loc_Email_Trung_Nhau {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNextLine()){
            set.add(sc.nextLine().toLowerCase());
        }
        for(String x : set){
            System.out.println(x);
        }
    }
    
}
