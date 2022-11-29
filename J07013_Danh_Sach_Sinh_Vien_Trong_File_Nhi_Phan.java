//Created by Campus
package danhsachsinhvien1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//
class SinhVien implements Serializable {
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;
    public SinhVien(int id, String ten, String lop, String date, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return ma + " " +  ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}
//
public class Danhsachsinhvien1 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> res = (ArrayList<SinhVien>) ob.readObject();
        for(SinhVien x: res){
            System.out.println(x);
        }
    } 
}
