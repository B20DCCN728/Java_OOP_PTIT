//Created by Campus
package tre_nhat_gia_nhat;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.*;
//
class YoungAndOld implements Comparable<YoungAndOld>{
    private String name;
    private long time;
    public YoungAndOld(String name, Date date) throws ParseException{
        this.name = name;
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        Date now = myDate.parse("10/04/2022");
        time = now.getTime() - date.getTime();
    }
    //
    @Override
    public int compareTo(YoungAndOld s){
        return Long.compare(this.time, s.time);
    }
    //
    @Override 
    public String toString(){
        return this.name;
    }
}
//
public class Tre_Nhat_Gia_Nhat {
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<YoungAndOld> set = new ArrayList<>();
        while(t-- > 0){
            String[] solve = sc.nextLine().split(" ");
            set.add(new YoungAndOld(solve[0], myDate.parse(solve[1])));
        }
        Collections.sort(set);
        System.out.println(set.get(0) + "\n" + set.get(set.size() - 1));
    }
    
}
