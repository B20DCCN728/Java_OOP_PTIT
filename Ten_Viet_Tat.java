//Created by Campus
package ten_viet_tat;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Ten_Viet_Tat {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<InFo> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new InFo(sc.nextLine()));
        }
        Collections.sort(solve);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String tir = sc.nextLine();
            for(InFo x: solve){
                if(x.isEqual(tir.toUpperCase())) System.out.println(x);
            }
        }
    }
    
}
