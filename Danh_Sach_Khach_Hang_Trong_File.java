//Created by Campus
package danh_sach_khach_hang_trong_file;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Danh_Sach_Khach_Hang_Trong_File {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Clients> solve = new ArrayList<>();
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            solve.add(new Clients(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Clients x: solve){
            System.out.println(x);
        }
    }
    
}
