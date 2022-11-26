//Created by Campus
package xep_hang_van_dong_vien_2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//
class Athlete implements Comparable<Athlete>{
    static int id = 0;
    private String code = "VDV", name, dateOfBirth, thucTe, uuTien, xepHang;
    Date start, end;
    private long time, age, bonus, total;
    private int rank;
    public Athlete(String name, String dateOfBirth, Date start, Date end){
        id += 1;
        this.code += String.format("%02d", id);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = 2021 - Long.parseLong(this.dateOfBirth.substring(6));
        this.start = start;
        this.end = end;
        long tmp = this.end.getTime() - this.start.getTime();
        this.time = TimeUnit.SECONDS.convert(tmp, TimeUnit.MILLISECONDS);
        this.bonus = this.getBonus();
        this.total = this.time + this.bonus;
        this.thucTe = String.format("%02d:%02d:%02d", (this.time) / 3600, (this.time % 3600) / 60, ((this.time % 3600) % 60));
        this.uuTien = String.format("%02d:%02d:%02d", (-this.bonus) / 3600, (-this.bonus % 3600) / 60, ((-this.bonus % 3600) % 60));
        this.xepHang = String.format("%02d:%02d:%02d", (this.total) / 3600, (this.total % 3600) / 60, ((this.total % 3600) % 60));
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public long getBonus(){
        if(age < 18) return 0;
        else if(age < 25) return -1;
        else if(age < 32) return -2;    
        else return -3;
    }
    public long getTotal(){
        return this.total;
    }
    public String getCode(){
        return this.code;
    }
    public int getRank(){
        return this.rank;
    }
    @Override
    public int compareTo(Athlete s){
        return Long.compare(this.total, s.total);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.thucTe + " " + this.uuTien + " " + this.xepHang + " " + this.rank;
    }
}
//
public class Xep_Hang_Van_Dong_Vien_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("hh:mm:ss");
        ArrayList<Athlete> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Athlete(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), myDate.parse(sc.nextLine())));
        }
        Collections.sort(solve);
        int rank = 1;
        solve.get(0).setRank(1);
        for(int i = 1;i < solve.size();i++){             
            if(solve.get(i).getTotal() == solve.get(i - 1).getTotal()){
                solve.get(i).setRank(rank);
            }
            else {
                rank = i + 1;
                solve.get(i).setRank(rank);
            }
        }
        for(Athlete x: solve){
            System.out.println(x);
        }
    }
    
}
