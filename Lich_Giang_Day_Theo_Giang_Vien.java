//Created by Campus
package lich_giang_day_theo_giang_vien;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Lich_Giang_Day_Theo_Giang_Vien {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Scanner sb = new Scanner(new File("LICHGD.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, MonHoc> monHoc = new HashMap<>();
        for(int i = 0;i < n;i++){
            MonHoc tmp = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            monHoc.put(tmp.getMaMon(), tmp);
        }
        n = Integer.parseInt(sb.nextLine());
        ArrayList<NhomLopHoc> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            solve.add(new NhomLopHoc(monHoc.get(sb.nextLine()), Integer.parseInt(sb.nextLine()),Integer.parseInt(sb.nextLine()), sb.nextLine(), sb.nextLine()));
        }
        Collections.sort(solve);
        String text = sb.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + text + ":");
        for(NhomLopHoc x: solve){
            if(x.getGiangVien().equals(text)){
                System.out.println(x);
            }
        }
    }
    
}
