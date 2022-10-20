//Created by Campuss
package danh_sach_ca_thi_1;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
public class Danh_Sach_Ca_Thi_1 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/mm/yyyy");
        ArrayList<Test> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Test(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Test x: solve){
            System.out.println(x);
        }
    }
    
}
