package lop_pair_2;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Pair<First, Second>{
    private First a;
    private Second b;
    //
    public Pair(First a, Second b){
        this.a = a;
        this.b = b;
    }
    //
    private boolean check_1(First a){
        if((Integer) a < 2) return false;
        if((Integer) a == 2) return true;
        for(int i = 2;i <= Math.sqrt((Integer) a);i++){
            if((Integer) a % i == 0) return false;
        }
        return true;
    }
    //
    private boolean check_2(Second a){
        if((Integer) a < 2) return false;
        if((Integer) a == 2) return true;
        for(int i = 2;i <= Math.sqrt((Integer) a);i++){
            if((Integer) a % i == 0) return false;
        }
        return true;
    }
    //
    protected boolean isPrime(){
        if(check_1(a) && check_2(b)) return true;
        return false;
    }
    //
    @Override
    public String toString(){
        return this.a + " " + this.b;
    }
}
//
public class Lop_Pair_2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
