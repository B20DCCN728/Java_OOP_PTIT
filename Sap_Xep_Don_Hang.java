//Created by Campus
package sap_xep_don_hang;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.io.*;
//
public class Sap_Xep_Don_Hang {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Product(sc));
        }
        Collections.sort(set);
        for(Product x : set){
            System.out.println(x);
        }
    }
    
}
