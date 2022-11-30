//Created by Campus
package luong_mua_trung_binh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
//
class Campus {
    static int id = 0;
    private String tenTram, code = "T";
    private SimpleDateFormat myDate = new SimpleDateFormat("hh:mm");
    private Date start, end;
    private long luongMua, time;
    public Campus(String tenTram, Date start, Date end, long luongMua){
        id += 1;
        this.code += String.format("%02d", id);
        this.tenTram = tenTram;
        this.start = start;
        this.end = end;
        this.luongMua = luongMua;
        long tmp = this.end.getTime() - this.start.getTime();
        this.time = TimeUnit.MINUTES.convert(tmp, TimeUnit.MILLISECONDS);
    }
    public String getTenTram(){
        return tenTram;
    }
    public void setLuongMua(long luongMua, long time){
        this.luongMua += luongMua;
        this.time += time;
    }
    @Override
    public String toString(){
        double asw = (double)((double)this.luongMua / this.time) * 60;
        return code + " " + tenTram + " " + String.format("%.2f", asw); 
    }
}

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
