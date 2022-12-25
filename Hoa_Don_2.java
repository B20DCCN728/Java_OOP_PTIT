//Created by Campus
package hoa_don_2;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Hoa_Don_2 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner f1 = new Scanner(new File("KH.in"));
        Scanner f2 = new Scanner(new File("MH.in"));
        Scanner f3 = new Scanner(new File("HD.in"));
        HashMap<String, Clients> clients = new HashMap<>();
        int n = Integer.parseInt(f1.nextLine());
        for(int i = 0;i < n;i++){
            Clients tmp = new Clients(f1.nextLine(), f1.nextLine(), f1.nextLine(), f1.nextLine());
            clients.put(tmp.getCode(), tmp);
        }
        HashMap<String, Products> products = new HashMap<>();
        n = Integer.parseInt(f2.nextLine());
        for(int i = 0;i < n;i++){
            Products tmp = new Products(f2.nextLine(), f2.nextLine(), Integer.parseInt(f2.nextLine()), Integer.parseInt(f2.nextLine()));
            products.put(tmp.getCode(), tmp);
        }
        ArrayList<Bills> bills = new ArrayList<>();
        n = Integer.parseInt(f3.nextLine());
        for(int i = 0;i < n;i++){
            String [] tmp = f3.nextLine().split(" ");
            bills.add(new Bills(clients.get(tmp[0]), products.get(tmp[1]), Integer.parseInt(tmp[2])));
        }
        for(Bills x: bills){
            System.out.println(x);
        }
    }
}
