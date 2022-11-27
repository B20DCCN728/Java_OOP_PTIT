//Created by Campus
package tinh_luong;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class PhongBan {
    private String code, name;
    public PhongBan(String code, String name){
        this.code = code;
        this.name = name;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
}
//
class Salary {
    private String code, name, group;
    private int count, price, total, year, heSo;
    private PhongBan ban;
    public Salary(String code, String name, int count, int price, PhongBan ban){
        this.code = code;
        this.group = this.code.substring(0, 1);
        this.year = Integer.parseInt(this.code.substring(1, 3));
        this.name = name;
        this.count = count;
        this.price = price;
        this.ban = ban;
        this.heSo = this.getHeSoNhan();
        this.total = this.heSo * this.price * this.count * 1000;
    }
    private int getHeSoNhan(){
        if(group.equals("A")){
            if(year <= 3) return 10;
            else if(year <= 8) return 12;
            else if(year <= 15) return 14;
            else return 20;
        }
        else if(group.equals("B")){
            if(year <= 3) return 10;
            else if(year <= 8) return 11;
            else if(year <= 15) return 13;
            else return 16;
        }
        else if(group.equals("C")){
            if(year <= 3) return 9;
            else if(year <= 8) return 10;
            else if(year <= 15) return 12;
            else return 14;
        }
        else {
            if(year <= 3) return 8;
            else if(year <= 8) return 9;
            else if(year <= 15) return 11;
            else return 13;
        }
    }
    public String getPhongBan(){
        return this.ban.getCode();
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.total;
    }
}
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
        String phongBan = sc.nextLine();
        System.out.println("Bang luong phong " + phongban.get(phongBan).getName() + ":");
        for(Salary x: solve){
            if(x.getPhongBan().equals(phongBan)){
                System.out.println(x);
            }
        }
    }
    
}

