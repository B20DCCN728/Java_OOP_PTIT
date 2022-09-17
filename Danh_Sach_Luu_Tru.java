package danh_sach_luu_tru;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.TimeUnit;

//
class Client implements Comparable<Client>{
    static int id = 0;
    private String code = "KH", fullName, roomCode;
    private long totalDays;
    private Date comeDate, outDate;
    public Client(String fullName, String roomCode, Date comeDate, Date outDate){
        id += 1;
        this.code += String.format("%02d", id);
        this.fullName = fullName;
        this.roomCode = roomCode;
        this.comeDate = comeDate;
        this.outDate = outDate;
    }
    //
    protected long getDay(){
        this.totalDays = this.outDate.getTime() - this.comeDate.getTime();
        return TimeUnit.DAYS.convert(totalDays, TimeUnit.MILLISECONDS);
    }
    //
    @Override
    public int compareTo(Client t){
        return Long.compare(t.getDay(), this.getDay());
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.fullName + " " + this.roomCode + " " + this.getDay();
    }
}
//
public class Danh_Sach_Luu_Tru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Client> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Client(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), myDate.parse(sc.nextLine())));
        }
        Collections.sort(set);
        for(Client x : set){
            System.out.println(x);
        }
    }
    
}
