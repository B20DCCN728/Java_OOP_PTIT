//Created by Campus
package tim_kiem_nhan_vien_theo_ten;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Tim_Kiem_Nhan_Vien_Theo_ten {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String tmp = sc.nextLine().trim();
            solve.add(new NhanVien(tmp.substring(0, 7), tmp.substring(8)));
        }
        Collections.sort(solve);
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < m;i++){
            String cnt = sc.nextLine().toLowerCase();
            for(NhanVien x: solve){
                if(x.isCheck(cnt)) System.out.println(x);
            }
            System.out.println();
        }
    }
    
}
