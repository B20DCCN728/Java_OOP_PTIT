//Created by Campus
package quan_li_ban_hang;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Quan_Li_Ban_Hang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HashMap<String, Client> clientPair = new HashMap<>();
        HashMap<String, Product> productPair = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Client x = new Client(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());  
            clientPair.put(x.getCode(), x);
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Product y = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            productPair.put(y.getCode(), y);
        }
        ArrayList<Bill> solve = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String[] data = sc.nextLine().split(" ");
            solve.add(new Bill(clientPair.get(data[0]), productPair.get(data[1]), Integer.parseInt(data[2])));
        }
        for(Bill x: solve){
            System.out.println(x);
        }
    }
    
}
