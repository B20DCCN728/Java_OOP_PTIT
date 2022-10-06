//Created by Campus
package tinh_gia_ban_1;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tinh_Gia_Ban_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Calculate> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Calculate(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        for(Calculate x: set){
            System.out.println(x);
        }
    }
    
}
