package danh_sach_sinh_vien_trong_file_nhi_phan;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Danh_Sach_Sinh_Vien_Trong_File_Nhi_Phan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> res = (ArrayList<SinhVien>) ob.readObject();
        for(SinhVien x: res){
            System.out.println(x);
        }
    }
    
}
