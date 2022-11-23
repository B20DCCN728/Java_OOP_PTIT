//Created by Campus
package ten_viet_tat;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class InFo implements Comparable<InFo> {
    private String name, code = "", ho = "", ten = "";
    public InFo(String name){
        this.name = name;
        this.set();
    }
    private void set(){
        String a[] = this.name.split(" ");
        this.ho += a[0];
        for(int i = 0;i < a.length;i++){
            this.code += a[i].charAt(0);
        }
        this.ten += a[a.length - 1];
    }
    public boolean isEqual(String x){
        String[] a = x.split("[.]");
        if(a.length != this.code.length()) return false;
        for(int i = 0;i < a.length;i++){
            if(a[i].charAt(0) >= 'A'&&a[i].charAt(0) <= 'Z'){
                if(this.code.charAt(i) != a[i].charAt(0)) return false;
            }
        }
        return true;
    }
    @Override
    public int compareTo(InFo x){
        if(!this.ten.equals(x.ten)) return this.ten.compareTo(x.ten);
        return this.ho.compareTo(x.ho);
    }
    @Override
    public String toString(){
        return this.name + "";
    }
}

//
public class Ten_Viet_Tat {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<InFo> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new InFo(sc.nextLine()));
        }
        Collections.sort(solve);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String tir = sc.nextLine();
            for(InFo x: solve){
                if(x.isEqual(tir.toUpperCase())) System.out.println(x);
            }
        }
    }
    
}
