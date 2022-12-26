//Created by Campus
package quan_li_khach_san;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
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
