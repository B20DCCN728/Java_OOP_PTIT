//Created by Campus
package cau_lac_bo_bong_da;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Cau_Lac_Bo_Bong_Da {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Club tmp = new Club(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            Club.Item.put(tmp.getCode(), tmp);
        }
        ArrayList<InfoOfMatch> solve = new ArrayList<>();
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String data[] = sc.nextLine().split(" ");
            solve.add(new InfoOfMatch(data[0], Integer.parseInt(data[1])));
        }
        Collections.sort(solve);
        for(InfoOfMatch x: solve){
            System.out.println(x);
        }
    }
    
}
