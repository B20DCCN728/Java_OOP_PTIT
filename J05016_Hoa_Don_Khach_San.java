//Created by Campus
package hoa_don_khach_san;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Bills implements Comparable<Bills>{
    static int id = 0;
    private String name, numRoom, code = "KH";
    private SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
    private Date start, end;
    private long fee, price, total, day;
    public Bills(String name, String numRoom, Date start, Date end, long fee){
        id += 1;
        this.code += String.format("%02d", id);
        this.name = name;
        this.numRoom = numRoom;
        this.start = start;
        this.end = end;
        long tmp = this.end.getTime() - this.start.getTime();
        this.day = TimeUnit.DAYS.convert(tmp, TimeUnit.MILLISECONDS) + 1L;
        this.fee = fee;
        this.price = this.setPrice();
        this.total = this.day * this.price + this.fee;
    }
    public Bills() {
    }
    private long setPrice(){
        if(numRoom.charAt(0) == '1'){
            return 25;
        }
        else if(numRoom.charAt(0) == '2'){
            return 34;
        }
        else if(numRoom.charAt(0) == '3'){
            return 50;
        }
        else return 80;
    }
    @Override
    public int compareTo(Bills s){
        return Long.compare(s.total, this.total);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.numRoom + " " + this.day + " " + this.total;
    }
}

//
public class Hoa_Don_Khach_San {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Bills> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            solve.add(new Bills(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), myDate.parse(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Bills x: solve){
            System.out.println(x);
        }
    }
    
}
