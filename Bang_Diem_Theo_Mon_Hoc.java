//Created by Campus
package bang_diem_theo_mon_hoc;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Bang_Diem_Theo_Mon_Hoc {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner f1 = new Scanner(new File("SINHVIEN.in"));
        Scanner f2 = new Scanner(new File("MONHOC.in"));
        Scanner f3 = new Scanner(new File("BANGDIEM.in"));
        HashMap<String, Students> students = new HashMap<>();
        int n = Integer.parseInt(f1.nextLine());
        for(int i = 0;i < n;i++){
            Students tmp = new Students(f1.nextLine(), f1.nextLine(), f1.nextLine(), f1.nextLine());
            students.put(tmp.getCode(), tmp);
        }
        HashMap<String, Subjects> subjects = new HashMap<>();
        n = Integer.parseInt(f2.nextLine());
        for(int i = 0;i < n;i++){
            Subjects tmp = new Subjects(f2.nextLine(), f2.nextLine(), f2.nextLine());
            subjects.put(tmp.getCode(), tmp);
        }
        ArrayList<Points> res = new ArrayList<>();
        n = Integer.parseInt(f3.nextLine());
        for(int i = 0;i < n;i++){
            String [] tmp = f3.nextLine().split(" ");
            res.add(new Points(students.get(tmp[0]), subjects.get(tmp[1]), Double.parseDouble(tmp[2])));
        }
        Collections.sort(res);
        int t = Integer.parseInt(f3.nextLine());
        while(t-- > 0){
            String s = f3.nextLine();
            System.out.println("BANG DIEM MON " + subjects.get(s).getName() + ":");
            for(Points x: res){
                if(s.equals(x.getSubjectCode())){
                    System.out.println(x);
                }
            }
        }
    }
    
}
