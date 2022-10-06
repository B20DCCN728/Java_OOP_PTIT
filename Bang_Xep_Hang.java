//Created by Campus
package bang_xep_hang;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Ranking implements Comparable<Ranking> {
    private String name;
    private int solved, submit;
    public Ranking(String name, int solved, int submit){
        this.name = name;
        this.solved = solved;
        this.submit = submit;
    }
    //
    @Override
    public int compareTo(Ranking x){
        if(this.solved != x.solved) return x.solved - this.solved;
        if(this.submit != x.submit) return this.submit - x.submit;
        return this.name.compareTo(x.name);
    }
    //
    @Override
    public String toString(){
        return this.name + " " + this.solved + " " + this.submit;
    }
    //
}

//
public class Bang_Xep_Hang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Ranking> solve = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String[] data = sc.nextLine().split(" ");
            solve.add(new Ranking(name, Integer.parseInt(data[0]), Integer.parseInt(data[1])));
        }
        Collections.sort(solve);
        for(Ranking x: solve){
            System.out.println(x);
        }
    }
    
}
