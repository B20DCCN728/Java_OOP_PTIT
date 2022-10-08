//Created by Campus
package tinh_diem_trung_binh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;

public class Tinh_Diem_Trung_Binh {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Score> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Score(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(set);    
        set.get(0).setRank(1);
        System.out.println(set.get(0));
        for(int i = 1;i < set.size();i++){
            if(set.get(i).getAve() == set.get(i - 1).getAve()){
                int x = set.get(i - 1).getRank();
                set.get(i).setRank(x);
                System.out.println(set.get(i));
            }
            else {
                set.get(i).setRank(i + 1);
                System.out.println(set.get(i));
            }
        }
    }
}
