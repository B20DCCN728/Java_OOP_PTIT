//Created by Campus
package tinh_luong;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tinh_Luong {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, PhongBan> phongban = new HashMap<>();
        for(int i = 0;i < n;i++){
            String data = sc.nextLine();
            PhongBan tmp = new PhongBan(data.substring(0, 2), data.substring(3));
            phongban.put(tmp.getCode(), tmp);
        }
        ArrayList<Salary> solve = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int count = Integer.parseInt(sc.nextLine());
            int price = Integer.parseInt(sc.nextLine());
            solve.add(new Salary(code, name, count, price, phongban.get(code.substring(3))));
        }
        for(Salary x: solve){
            System.out.println(x);
        }
    }
    
}
