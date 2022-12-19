//Created by Campus
package tinh_gio_chuan;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class GiangVien {
    private String code, name;
    private double total;
    public GiangVien(String code, String name){
        this.code = code;
        this.name = name;
        this.total = 0;
    }
    public void addTime(double time){
        this.total += time;
    }
    public String getCode(){
        return this.code;
    }
    @Override
    public String toString(){
        return name + " " + String.format("%.2f", total);
    }
}

//
public class Tinh_Gio_Chuan {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner mh = new Scanner(new File("MONHOC.in"));
        Scanner gv = new Scanner(new File("GIANGVIEN.in"));
        Scanner gc = new Scanner(new File("GIOCHUAN.in"));
        int n = Integer.parseInt(mh.nextLine());
        HashMap<String, String> subject = new HashMap<>();
        for(int i = 0;i < n;i++){
            String tmp = mh.nextLine();
            subject.put(tmp.substring(0, 7), tmp.substring(8));
        }
        n = Integer.parseInt(gv.nextLine());
        LinkedHashMap<String, GiangVien> teacher = new LinkedHashMap<>();
        for(int i = 0;i < n;i++){
            String tmp = gv.nextLine();
            GiangVien otp = new GiangVien(tmp.substring(0, 4), tmp.substring(5));
            teacher.put(otp.getCode(), otp);
        }
        int m = Integer.parseInt(gc.nextLine());
        for(int i = 0;i < m;i++){
            String tmp = gc.nextLine();
            String code = tmp.substring(0, 4);
            String codeSubject = tmp.substring(5, 12);
            double point = Double.parseDouble(tmp.substring(13));
            teacher.get(code).addTime(point);
        }
        for(Map.Entry<String, GiangVien> entry: teacher.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
