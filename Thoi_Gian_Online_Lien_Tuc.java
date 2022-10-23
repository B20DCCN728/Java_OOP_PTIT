//Created by Campus
package thoi_gian_online_lien_tuc;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Thoi_Gian_Online_Lien_Tuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("ONLINE.in"));
        SimpleDateFormat myDate = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        ArrayList<Online> solve = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String name = sc.nextLine();
            Date x = myDate.parse(sc.nextLine());
            Date y = myDate.parse(sc.nextLine());
            solve.add(new Online(name, x, y));
        }
        Collections.sort(solve);
        for(Online x: solve){
            System.out.println(x);
        }
    }
    
}
