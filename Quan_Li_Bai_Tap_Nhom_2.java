//Created by Campus
package quan_li_bai_tap_nhom_2;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Quan_Li_Bai_Tap_Nhom_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] k = sc.nextLine().split(" ");
        ArrayList<Developer> solve = new ArrayList<>();
        for(int i = 0;i < Integer.parseInt(k[0]);i++){
            solve.add(new Developer(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        for(int i = 0;i < Integer.parseInt(k[1]);i++){   
            Topic.setTopic(i + 1, sc.nextLine());
        }
        Collections.sort(solve);
        for(Developer x: solve){
            System.out.println(x);
        }
    }
    
}
