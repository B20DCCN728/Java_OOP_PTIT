//Created by Campus
package quan_li_ban_hang_2;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Quan_Li_Ban_Hang_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HashMap<String, Clients> clientsPair = new HashMap<>();
        HashMap<String, Products> productsPair = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Clients x = new Clients(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());  
            clientsPair.put(x.getCode(), x);
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Products y = new Products(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            productsPair.put(y.getCode(), y);
        }
        ArrayList<Bills> solve = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String[] data = sc.nextLine().split(" ");
            solve.add(new Bills(clientsPair.get(data[0]), productsPair.get(data[1]), Integer.parseInt(data[2])));
        }
        Collections.sort(solve);
        for(Bills x: solve){
            System.out.println(x);
        } 
    }
    
}
