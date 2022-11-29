//Created by Campus
package nguyen_to_va_thuan_nghich;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Nguyen_To_Va_Thuan_Nghich {
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    static boolean isReverse(int n){
        StringBuilder s = new StringBuilder(String.valueOf(n));
        String x = s.reverse().toString();
        if(x.equals(s.reverse().toString())){
            return true;
        }  
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj_1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj_2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> data_1 = (ArrayList<Integer>) obj_1.readObject();
        ArrayList<Integer> data_2 = (ArrayList<Integer>) obj_2.readObject();
        int a[] = new int[10000], b[] = new int[10000];
        for(int i = 0;i < data_1.size();i++){
            if(isPrime(data_1.get(i))&&isReverse(data_1.get(i))){
                a[data_1.get(i)]++;
            }
        }
        TreeSet<Integer> res = new TreeSet<>();
        for(int i = 0;i < data_2.size();i++){
            if(a[data_2.get(i)] > 0){
                res.add(data_2.get(i));
                b[data_2.get(i)]++;
            }
        }
        for(Integer x: res){
            System.out.println(x + " " + a[x] + " " + b[x]);
        }
    }
    
}
