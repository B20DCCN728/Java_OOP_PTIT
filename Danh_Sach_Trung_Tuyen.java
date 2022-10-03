package danh_sach_trung_tuyen;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;

public class Danh_Sach_Trung_Tuyen {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        int k = Integer.parseInt(sc.nextLine());
        Collections.sort(solve);
        int cnt = 0;
        double c = 0;
        for(Student x: solve){
            cnt++;
            if(cnt == k) {
                c = x.getTotalScore();
                break;
            }
        }
        System.out.println(String.format("%.1f", c));
        for(Student x: solve){
            if(x.getTotalScore() >= c) System.out.println(x + " " + "TRUNG TUYEN");
            else System.out.println(x + " " + "TRUOT");
        }
    }
    
}
