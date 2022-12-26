//Created by Campus
package quan_li_khach_san;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class Rooms {
    static HashMap<Character, Rooms> rooms = new HashMap<>();
    private Character code;
    private String name;
    private double price, fee;
    public Rooms(Character code, String name, double price, double fee){
        this.code = code;
        this.name = name;
        this.price = price;
        this.fee = fee;
    }
    public Character getCode(){
        return code;
    }
    public double getPrice(){
        return price;
    }
    public double getFee(){
        return fee;
    }
}
//
class Clients implements Comparable<Clients>{
    static int id = 0;
    private String code = "", name, roomCode;
    private SimpleDateFormat myDate = new SimpleDateFormat();
    private long totalDay, _totalDay;
    private double totalMoney;
    private Rooms room;
    public Clients(String name, String roomCode, Date start, Date end){
        id += 1;
        this.code = String.format("KH%02d", id);
        this.name = name;
        this.roomCode = roomCode;
        this.totalDay = TimeUnit.DAYS.convert(end.getTime() - start.getTime(), TimeUnit.MILLISECONDS);
        this._totalDay = this.totalDay;
        if(this.totalDay == 0){
            this.totalDay = 1L;
            this._totalDay = 0L;
        }
        this.room = Rooms.rooms.get(this.roomCode.charAt(2));
        this.totalMoney = this.setTotalMoney();
    }   
    private double setTotalMoney(){
        double total = totalDay * room.getPrice() * (1 + room.getFee());
        if(totalDay >= 30) return total * 0.94;
        else if(totalDay >= 20) return total * 0.96;
        else if(totalDay >= 10) return total * 0.98;
        else return  total;
    }
    @Override
    public int compareTo(Clients x){
        return Long.compare(x._totalDay, this._totalDay);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + roomCode + " " + _totalDay + " " + String.format("%.2f", totalMoney);
    }
}
//
public class Quan_Li_Khach_San {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String [] tmp = sc.nextLine().trim().split("\\s+");
            Rooms cnt = new Rooms(tmp[0].charAt(0), tmp[1], Double.parseDouble(tmp[2]), Double.parseDouble(tmp[3]));
            Rooms.rooms.put(cnt.getCode(), cnt);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Clients> clients = new ArrayList<>();
        for(int i = 0;i < n;i++){
            clients.add(new Clients(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), myDate.parse(sc.nextLine())));
        }
        Collections.sort(clients);
        for(Clients x: clients){
            System.out.println(x);
        }
    }
    
}
