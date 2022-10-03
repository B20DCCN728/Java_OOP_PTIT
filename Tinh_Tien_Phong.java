package tinh_tien_phong;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
//
class Employee implements Comparable<Employee>{
    static int id = 0;
    private String code = "KH", name = "", roomNumber;
    private long totalTime, dateOfStay, total, except;
    //
    public Employee(String name, String room, Date checkIn, Date checkOut, long except){
        id += 1;
        this.code += String.format("%02d", id);
        String[] format = name.split("\\s+");
        for(int i = 0;i < format.length;i++){
            this.name += Character.toUpperCase(format[i].charAt(0)) + format[i].substring(1) + " ";
        }
        this.name = this.name.trim();
        this.roomNumber = room;
        this.except = except;
        this.totalTime = checkOut.getTime() - checkIn.getTime();
        this.dateOfStay = TimeUnit.DAYS.convert(this.totalTime, TimeUnit.MILLISECONDS) + 1;
        this.total = this.getPrice() * this.dateOfStay + this.except;
    }
    //
    private long getPrice(){
        int check = Integer.parseInt(this.roomNumber.substring(0, 1));
        if(check == 1) return 25;
        else if (check == 2) return 34;
        else if (check == 3) return 50;
        else return 80;
    }
    //
    @Override
    public int compareTo(Employee t){
        return Long.compare(t.total, this.total);
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.roomNumber + " " + this.dateOfStay + " " + this.total;
    }
}
//
public class Tinh_Tien_Phong {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Employee> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Employee(sc.nextLine().trim().toLowerCase(), sc.nextLine(), myDate.parse(sc.nextLine()), myDate.parse(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Employee x: solve){
            System.out.println(x);
        }
    }
}
