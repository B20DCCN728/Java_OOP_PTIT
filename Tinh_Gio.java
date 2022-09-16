package tinh_gio;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
import java.text.*;
//
class player{
    private String code, name, inhour, outhour;
    private int hour, minute, diffrent;
    public player(Scanner sc){
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.inhour = sc.nextLine();
        this.outhour = sc.nextLine();
        solved();
    }
    protected void solved(){
        String[] t1 = this.inhour.split(":");
        String[] t2 = this.outhour.split(":");
        this.diffrent = Integer.parseInt(t2[0]) * 60 + Integer.parseInt(t2[1]);
        this.diffrent -= Integer.parseInt(t1[0]) * 60 + Integer.parseInt(t1[1]);
        this.hour = this.diffrent / 60;
        this.minute = this.diffrent - this.hour * 60;
    }
    protected int getTime(){
        return this.diffrent;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.hour + " gio " + this.minute + " phut";
    }
}
public class Tinh_Gio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<player> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new player(sc));
        }
        Collections.sort(set, new Comparator<player>(){
            @Override
            public int compare(player o1, player o2){
                if(o1.getTime() > o2.getTime()) return -1;
                if(o1.getTime() == o2.getTime()) return 0;
                return 1;
            }
        });
        for(player x : set){
            System.out.println(x);
        }
    }
    
}
