//Created by Campuss
package danh_sach_ca_thi_1;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Test implements Comparable<Test>{
    static int id = 0;
    private String code = "C", roomCode, x, y;
    Date day, time;
    long totalMinutes;
    public Test(String day, String time, String roomCode) throws ParseException{
        id += 1;
        this.code += String.format("%03d", id);
        this.x = day;
        this.y = time;
        this.day = new SimpleDateFormat("dd/mm/yyyy").parse(day);
        this.time = new SimpleDateFormat("hh:mm").parse(time);
        this.roomCode = roomCode;
    }
    @Override
    public int compareTo(Test a){
        if(this.day.compareTo(a.day) != 0) return this.day.compareTo(a.day);
        if(this.time.compareTo(a.time) != 0) return this.time.compareTo(a.time);
        return this.code.compareTo(a.code);
    }
    
    @Override
    public String toString(){
        return this.code + " " + this.x + " " + this.y + " " + this.roomCode;
    }
}
//
public class Danh_Sach_Ca_Thi_1 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/mm/yyyy");
        ArrayList<Test> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Test(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve);
        for(Test x: solve){
            System.out.println(x);
        }
    }
    
}
