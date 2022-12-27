//Created by Campus
package sap_xep_lich_thi;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class MonThi {
    static HashMap<String, MonThi> list = new HashMap<>();
    private String maMon, tenMon, hinhThucThi;
    public MonThi(String maMon, String tenMon, String hinhThucThi){
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }
    public String getMaMon(){
        return maMon;
    }
    @Override
    public String toString(){
        return tenMon;
    }
}
//
class CaThi {
    static int thuTu = 0;
    static HashMap<String, CaThi> list = new HashMap<>();
    private String maCaThi, phongThi;
    private Date ngayThi, gioThi;
    private SimpleDateFormat myDate_1 = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat myDate_2 = new SimpleDateFormat("HH:mm");
    public CaThi(Date ngayThi, Date gioThi, String phongThi){
        thuTu += 1;
        this.maCaThi = String.format("C%03d", thuTu);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }
    public String getMaCaThi(){
        return maCaThi;
    }
    public Date getNgayThi(){
        return ngayThi;
    }
    public Date getGioThi(){
        return gioThi;
    }
    @Override
    public String toString(){
        return myDate_1.format(ngayThi) + " " + myDate_2.format(gioThi) + " " + phongThi;
    }
}
//
class LichThi implements Comparable<LichThi>{
    private MonThi monThi;
    private CaThi caThi;
    private String nhom, soSinhVien;
    public LichThi(String maCaThi, String maMonThi, String nhom, String soSinhVien){
        this.caThi = CaThi.list.get(maCaThi);
        this.monThi = MonThi.list.get(maMonThi);
        this.nhom = nhom;
        this.soSinhVien = soSinhVien;
    }
    @Override
    public int compareTo(LichThi x){
        if(!this.caThi.getNgayThi().equals(x.caThi.getNgayThi())) return this.caThi.getNgayThi().compareTo(x.caThi.getNgayThi());
        if(!this.caThi.getGioThi().equals(x.caThi.getGioThi())) return this.caThi.getGioThi().compareTo(x.caThi.getGioThi());
        return this.caThi.getMaCaThi().compareTo(x.caThi.getMaCaThi());
    }
    @Override
    public String toString(){
        return caThi + " " + monThi + " " + nhom + " " + soSinhVien;
    }
}
//
public class Sap_Xep_Lich_Thi {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc_1 = new Scanner(new File("MONTHI.in"));
        Scanner sc_2 = new Scanner(new File("CATHI.in"));
        Scanner sc_3 = new Scanner(new File("LICHTHI.in"));
        SimpleDateFormat myDate_1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat myDate_2 = new SimpleDateFormat("HH:mm");
        int n = Integer.parseInt(sc_1.nextLine());
        for(int  i = 0;i < n;i++){
            MonThi tmp = new MonThi(sc_1.nextLine(), sc_1.nextLine(), sc_1.nextLine());
            MonThi.list.put(tmp.getMaMon(), tmp);
        }
        n = Integer.parseInt(sc_2.nextLine());
        for(int  i = 0;i < n;i++){
            CaThi tmp = new CaThi(myDate_1.parse(sc_2.nextLine()), myDate_2.parse(sc_2.nextLine()), sc_2.nextLine());
            CaThi.list.put(tmp.getMaCaThi(), tmp);
        }
        n = Integer.parseInt(sc_3.nextLine());
        ArrayList<LichThi> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String [] tmp = sc_3.nextLine().split(" ");
            solve.add(new LichThi(tmp[0], tmp[1], tmp[2], tmp[3]));
        }
        Collections.sort(solve);
        for(LichThi x: solve){
            System.out.println(x);
        }
    }
    
}
