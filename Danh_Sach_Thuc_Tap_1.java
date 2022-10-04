//Created by Campus
package danh_sach_thuc_tap_1;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.*;
//
public class Danh_Sach_Thuc_Tap_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Trainning> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Trainning(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String query = sc.nextLine();
            for(Trainning x: solve){
                if(x.getEnterprise().compareTo(query) == 0) System.out.println(x);
            }
        }
    }
    
}
