//Created by Campus
package xet_tuyen;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Recuit {
    static int id = 0;
    private String code = "PH", fullname = "", age, status;
    private double theoryPoint, practicalPoint;
    private long totalScore;
    public Recuit(String name, String date, double theoryPoint, double practicalPoint){
        id += 1;
        this.code += String.format("%02d", id);
        String[] format = name.trim().toLowerCase().split("\\s+");
        for(int i = 0;i < format.length;i++){
            this.fullname += Character.toUpperCase(format[i].charAt(0)) + format[i].substring(1) + " ";
        }
        this.fullname = this.fullname.trim();
        String[] formatDate = date.split("/");
        this.age = String.valueOf(2021 - Integer.parseInt(formatDate[2]));
        this.theoryPoint = theoryPoint;
        this.practicalPoint = practicalPoint;
        double score = (this.theoryPoint + this.practicalPoint) / 2 + this.getBonus();
        this.totalScore = Math.min(10, Math.round(score));
        setStatus();
    }   
    //
    private double getBonus(){
        if(this.theoryPoint >= 8&& this.practicalPoint >= 8) return 1.0;
        else if(this.theoryPoint >= 7.5&& this.practicalPoint >= 7.5) return 0.5;
        else return 0;
    }
    //
    private void setStatus(){
        if(this.totalScore == 10) {
            this.status = "Xuat sac";
        }
        else if(this.totalScore == 9) this.status = "Xuat sac";
        else if(this.totalScore == 8) this.status = "Gioi";
        else if(this.totalScore == 7) this.status = "Kha";
        else if(this.totalScore == 5 || this.totalScore == 6) this.status = "Trung binh";
        else this.status = "Truot";
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.fullname + " " + this.age + " " + this.totalScore + " " + this.status;
    }
}

//
public class Xet_Tuyen {
    /**
     * @OOP
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<Recuit> solve = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            solve.add(new Recuit(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(Recuit x: solve){
            System.out.println(x);
        }
    }
    
}

