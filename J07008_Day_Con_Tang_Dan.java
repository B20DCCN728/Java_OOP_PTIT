package day_con_tang_dan;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Day_Con_Tang_Dan {
    static ArrayList<String> res = new ArrayList<>();
    static int[] a = new int[21];
    static Vector<Integer> tmp = new Vector<>();
    static void push_Back(){
        String solve = "";
        for(int i = 0;i < tmp.size();i++){
            solve += String.valueOf(tmp.get(i)) + " ";
        }
        solve.trim();
        res.add(solve);
    }
    static void Try(int i, int n){
        for(int j = i + 1;j <= n;j++){
            if(a[j] > a[i]){
                tmp.add(a[j]);
                if(tmp.size() > 1) push_Back();
                Try(j, n);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
    /*
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(sc.next());
        a[0] = 0;
        for(int i = 1;i <= n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        /*
        for(int i = 1;i <= n;i++) {
            System.out.print(a[i] + " ");
        }
        */
        Try(0, n);
        Collections.sort(res);
        for(String x : res){
            System.out.println(x);
        }
    }
    
}
