//Created by Campus
package hoc_bong_sinh_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Hoc_Bong_Sinh_Vien {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String tmp[] = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(tmp[0]);
        int k = Integer.parseInt(tmp[1]);
        ArrayList<SinhVien> solve = new ArrayList<>();
        SinhVien.k = k;
        for(int i = 0;i < n;i++){
            String name = sc.nextLine();
            String data[] = sc.nextLine().split("\\s+");
            solve.add(new SinhVien(name, Double.parseDouble(data[0]),Double.parseDouble(data[1])));
        }
        Collections.sort(solve);     
        for(int i = 0;i < n;i++){
            solve.get(i).setStatus();
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(solve.get(j).getCode().equals(SinhVien.member.get(i))){
                    System.out.println(solve.get(j));
                    break;
                }
            }
        }
    }
    
}
