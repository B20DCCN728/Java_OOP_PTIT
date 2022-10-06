//Created by Campus
package bang_xep_hang;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
public class Bang_Xep_Hang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Ranking> solve = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String[] data = sc.nextLine().split(" ");
            solve.add(new Ranking(name, Integer.parseInt(data[0]), Integer.parseInt(data[1])));
        }
        Collections.sort(solve);
        for(Ranking x: solve){
            System.out.println(x);
        }
    }
    
}
