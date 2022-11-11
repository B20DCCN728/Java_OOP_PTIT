//Created by Campus
package tinh_hoa_don_ban_quan_ao;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
class Products {
    private String code, name;
    private long type_1, type_2, res;
    public Products(String code, String name, long type_1, long type_2){
        this.code = code;
        this.name = name;
        this.type_1 = type_1;
        this.type_2 = type_2;
    }
    public String getCode(){
        return this.code;
    }
    public long getType(String code){
        if(code.substring(2).equals("1")) return this.type_1;
        return this.type_2;
    }
    public String getName(){
        return this.name;
    }
}
//
public class Bills {
    static int id = 0;
    private String code, name;
    private long discount, total;
    public Bills(String code, long count, Products product){
        id += 1;
        this.code = code + "-" + String.format("%03d", id);
        this.name = product.getName();
        long sum = count * product.getType(code);
        if(count >= 150) this.discount = 50 * sum / 100;
        else if(count >= 100) this.discount = 30 * sum / 100;
        else if(count >= 50) this.discount = 15 * sum / 100;
        else this.discount = 0;
        this.total = sum - this.discount;
    }      
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.discount + " " + this.total;
    }
}
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
