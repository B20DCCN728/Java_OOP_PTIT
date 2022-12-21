//Created by Campus
package tinh_cuoc_dien_thoai_co_dinh_2;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Tinh_Cuoc_Dien_Thoai_Co_Dinh_2 {
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat myDate = new SimpleDateFormat("HH:mm");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            City tmp = new City(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            City.list_city.put(tmp.getCode(), tmp);
        }
        ArrayList<Phone> list_phone = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < m;i++){
            String [] tmp = sc.nextLine().split(" ");
            list_phone.add(new Phone(tmp[0], myDate.parse(tmp[1]), myDate.parse(tmp[2])));
        }
        Collections.sort(list_phone);
        for(Phone x: list_phone){
            System.out.println(x);
        }
    } 
}
