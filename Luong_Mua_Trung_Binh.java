//Created by Campus
package luong_mua_trung_binh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
//
public class Luong_Mua_Trung_Binh {
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Campus> solve = new LinkedHashMap<>();
        SimpleDateFormat myDate = new SimpleDateFormat("hh:mm");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String tenTram = sc.nextLine();
            Date start = myDate.parse(sc.nextLine());
            Date end = myDate.parse(sc.nextLine());
            long luongMua = Long.parseLong(sc.nextLine());
            if(solve.containsKey(tenTram)){
                long time = TimeUnit.MINUTES.convert(end.getTime() - start.getTime(), TimeUnit.MILLISECONDS);
                solve.get(tenTram).setLuongMua(luongMua, time);
            }
            else {
                Campus cmp = new Campus(tenTram, start, end, luongMua);
                solve.put(cmp.getTenTram(), cmp);               
            }
        }
        for(Map.Entry<String, Campus> x: solve.entrySet()){
            System.out.println(x.getValue());
        }
    }
    
}
