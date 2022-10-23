//Created by Campus
package kiem_tra_va_tinh_dien_tich_tam_giac;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Kiem_Tra_Va_Tinh_Dien_Tich_Tam_Giac {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Triangle solve = new Triangle(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));
            if(solve.isCheck()){
                System.out.println(solve.getArea());
            }
            else System.out.println("INVALID");
        }
    }
    
}
