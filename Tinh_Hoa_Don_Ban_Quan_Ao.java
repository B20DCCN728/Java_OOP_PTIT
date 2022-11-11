//Created by Campus
package tinh_hoa_don_ban_quan_ao;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Tinh_Hoa_Don_Ban_Quan_Ao {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Products> clothes = new HashMap<>();
        for(int i = 0;i < n;i++){
            Products tmp = new Products(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            clothes.put(tmp.getCode(), tmp);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Bills> solve = new ArrayList<>();
        for(int i = 0;i < m;i++){
            String data[] = sc.nextLine().split(" ");
            String code = data[0];
            long count = Long.parseLong(data[1]);
            solve.add(new Bills(code, count, clothes.get(code.substring(0, 2))));
        }
        for(Bills x: solve){
            System.out.println(x);
        }
    }
    
}
