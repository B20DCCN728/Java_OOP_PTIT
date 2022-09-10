package sap_xep_thoi_gian;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Time{
    private int hours, minutes, seconds;
    
    public Time(Scanner sc){
        this.hours = sc.nextInt();
        this.minutes = sc.nextInt();
        this.seconds = sc.nextInt();
    }
    
    public int getHour(){
        return this.hours;
    }
    
    public int getMinute(){
        return this.minutes;
    }
    
    public int getSecond(){
        return this.seconds;
    }
    
    @Override
    public String toString(){
        return this.hours + " " + this.minutes + " " + this.seconds;
    }
}
//
class sortTheArrayList implements Comparator<Time>{
    @Override
    public int compare(Time o1, Time o2){
        if(o1.getHour() != o2.getHour()) return o1.getHour() - o2.getHour();
        if(o1.getMinute() != o2.getMinute()) return o1.getMinute() - o2.getMinute();
        return o1.getSecond() - o2.getSecond();
    }
}
//
public class Sap_Xep_Thoi_Gian {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> time = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            time.add(new Time(sc));
        }
        Collections.sort(time, new sortTheArrayList());
        for(int i = 0;i < n;i++){
            System.out.print(time.get(i).getHour() + " " + time.get(i).getMinute() + " " + time.get(i).getSecond());
            System.out.println();
        }
    }
    
}
