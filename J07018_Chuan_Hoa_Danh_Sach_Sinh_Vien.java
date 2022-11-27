//Created by Campus
package chuan_hoa_danh_sach_sinh_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class SinhVien {
    static int id = 0;
    private String code = "B20DCCN", name = "", group;
    private double GPA;
    private SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
    private Date dateOfBirth;
    public SinhVien(String nameNotFormat, String group, Date dateOfBirth, double GPA){
        id += 1;
        this.code += String.format("%03d", id);
        String tmp[] = nameNotFormat.trim().split("\\s+");
        for(int i = 0;i < tmp.length;i++){
            this.name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        this.name = this.name.trim();
        this.group = group;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.group + " " + myDate.format(dateOfBirth) + " " + String.format("%.2f", GPA);
    }
}

//
public class Chuan_Hoa_Danh_Sach_Sinh_Vien {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<SinhVien> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            solve.add(new SinhVien(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(SinhVien x: solve){
            System.out.println(x);
        }
    }
    
}
