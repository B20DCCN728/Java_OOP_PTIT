//Created by Campus
package nhap_xuat_hang;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Nhap_Xuat_Hang {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> product = new HashMap<>();
        for(int i = 0;i < n;i++){
            Product tmp = new Product(sc.nextLine(), sc.nextLine(), sc.nextLine());
            product.put(tmp.getCode(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Bills> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String data[] = sc.nextLine().split(" ");
            solve.add(new Bills(product.get(data[0]), Long.parseLong(data[1]), Long.parseLong(data[2]), Long.parseLong(data[3])));
        }
        for(Bills x: solve){
            System.out.println(x);
        }
    }
    
}
