//Created by Campus
package xep_hang_van_dong_vien_1;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Xep_Hang_Van_Dong_Vien_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("hh:mm:ss");
        ArrayList<Athlete> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Athlete(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), myDate.parse(sc.nextLine())));
        }
        ArrayList<Athlete> sort = new ArrayList<>(solve);
        Collections.sort(sort);
        int rank = 1;
        sort.get(0).setRank(1);
        for(int i = 1;i < sort.size();i++){             
            if(sort.get(i).getTotal() == sort.get(i - 1).getTotal()){
                sort.get(i).setRank(rank);
            }
            else {
                rank = i + 1;
                sort.get(i).setRank(rank);
            }
        }
        for(int i = 0;i < sort.size();i++){
            for(int j = 0;j < solve.size();j++){
                if(sort.get(i).getCode().equals(solve.get(j).getCode())){
                    solve.get(j).setRank(sort.get(i).getRank());
                    break;
                }
            }
        }
        for(Athlete x: solve){
            System.out.println(x);
        }
    }
    
}
