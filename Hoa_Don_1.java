//Created by Campus
package hoa_don_1;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Hoa_Don_1 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int n = Integer.parseInt(sc1.nextLine());
        for(int i = 0;i < n;i++){
            Products tmp = new Products(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()), Integer.parseInt(sc1.nextLine()));
            Products.elements.put(tmp.getCode(), tmp);
        }
        n = Integer.parseInt(sc2.nextLine());
        ArrayList<Bills> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String [] tmp = sc2.nextLine().split("\\s+");
            solve.add(new Bills(tmp[0], Integer.parseInt(tmp[1])));
        }
        for(Bills x: solve){
            System.out.println(x);
        }
    }
    
}
