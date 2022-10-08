//Created by Campus
package tinh_diem_trung_binh;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Score implements Comparable<Score>{
    static int id = 0;
    private String code = "SV", name = "", ave;
    private int rank;
    public Score(String notName, int score1, int score2, int score3){
        id += 1;
        this.code += String.format("%02d", id);
        String[] a = notName.trim().toLowerCase().split("\\s+");
        for(int i = 0;i < a.length;i++){ 
            this.name += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1) + " ";
        }
        this.name = this.name.trim();
        this.ave = String.format("%.2f", (double)(score1 * 3 + score2 * 3 + score3 * 2) / 8);
    }
    //
    protected double getAve(){
        return Double.parseDouble(this.ave);
    }
    //
    protected void setRank(int rank){
        this.rank = rank;
    }
    //
    protected int getRank(){
        return this.rank;
    }
    //
    @Override
    public int compareTo(Score x){
        return Double.compare(x.getAve(), this.getAve());
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.ave + " " + this.rank;
    }
}

//
public class Tinh_Diem_Trung_Binh {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Score> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Score(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(set);    
        set.get(0).setRank(1);
        System.out.println(set.get(0));
        for(int i = 1;i < set.size();i++){
            if(set.get(i).getAve() == set.get(i - 1).getAve()){
                int x = set.get(i - 1).getRank();
                set.get(i).setRank(x);
                System.out.println(set.get(i));
            }
            else {
                set.get(i).setRank(i + 1);
                System.out.println(set.get(i));
            }
        }
    }
}
