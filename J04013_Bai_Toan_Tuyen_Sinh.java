package bai_toan_tuyen_sinh;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.io.*;

class Student{  
    private String code, name;
    private double ma, phy, che;
    
    public Student(Scanner sc){
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.ma = sc.nextDouble();
        this.phy = sc.nextDouble();
        this.che = sc.nextDouble();
    }
    
    private double getBonus(){
        String solve = this.code.substring(0, 3);
        if(solve.compareTo("KV1") == 0) return 0.5;
        if(solve.compareTo("KV2") == 0) return 1.5;
        return 2.5;
    }
    
    protected String getCode(){
        return this.code;
    }
    
    protected String getName(){
        return this.name;
    }
    
    protected int getAdd(){
        return (int) getBonus();
    }
    
    protected double getScore(){
        double Score = this.che + this.ma * 2 + this.phy;
        return Score;
    }
    
    protected String result(){
        if(getScore() + getBonus() >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
}
public class Bai_Toan_Tuyen_Sinh{
    public static void main(String[] args){
        //var df = new DecimalFormat(".");
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Student solve = new Student(sc);
        double Score = solve.getScore();
        String score;
        if(Score == (int) Score) score = String.format("%d", (int)Score);
        else score = String.format("%.1f", Score);
        System.out.println(solve.getCode() + " " + solve.getName() + " " + solve.getAdd() + " " + score + " " + solve.result());
    }
    
}
