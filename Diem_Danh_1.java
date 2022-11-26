//Created by Campus
package diem_danh_1;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Diem_Danh_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, Student> solve = new LinkedHashMap<>();
        for(int i = 0;i < n;i++){
            Student tmp = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
            solve.put(tmp.getCode(), tmp);
        }
        for(int i = 0;i < n;i++){
            String cnt[] = sc.nextLine().split(" ");
            solve.get(cnt[0]).setData(cnt[1]);
        }
        for(Map.Entry<String, Student> x: solve.entrySet()){
            System.out.println(x.getValue());
        }
    }
    
}
