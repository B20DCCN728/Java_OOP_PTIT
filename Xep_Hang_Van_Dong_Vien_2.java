/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xep_hang_van_dong_vien_2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Xep_Hang_Van_Dong_Vien_2 {
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
        Collections.sort(solve);
        int rank = 1;
        solve.get(0).setRank(1);
        for(int i = 1;i < solve.size();i++){             
            if(solve.get(i).getTotal() == solve.get(i - 1).getTotal()){
                solve.get(i).setRank(rank);
            }
            else {
                rank = i + 1;
                solve.get(i).setRank(rank);
            }
        }
        for(Athlete x: solve){
            System.out.println(x);
        }
    }
    
}
