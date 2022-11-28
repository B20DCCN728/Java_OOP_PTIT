//Created by Campus
package danh_sach_khach_hang_trong_file;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Clients implements Comparable<Clients> {
    static int id = 0;
    private String code = "KH", name = "", sex, address;
    private Date dateOfBirth;
    private SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
    public Clients(String nameNotFormat, String sex, Date dateOfBirth, String address){
        id += 1;
        this.code += String.format("%03d", id);
        String tmp[] = nameNotFormat.trim().split("\\s+");
        for(int i = 0;i < tmp.length;i++){
            this.name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        this.name = this.name.trim();
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
    @Override
    public int compareTo(Clients s){
        return dateOfBirth.compareTo(s.dateOfBirth);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.sex + " " + this.address + " " + myDate.format(dateOfBirth);
    }
}
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
