//Created by Campus
package bang_tinh_gio_chuan;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
//
public class Bang_Tinh_Gio_Chuan {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Subject> subject = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String cmp = sc.nextLine();
            subject.add(new Subject(cmp.substring(0, 7), cmp.substring(8)));
        }
        HashMap<String, Teacher> solve = new HashMap<>();
        ArrayList<String> gv = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String otd = sc.nextLine();
            Teacher tmp = new Teacher(otd.substring(0, 4), otd.substring(5));
            solve.put(tmp.getCode(), tmp);
            gv.add(otd.substring(0, 4));
        }
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String cmd[] = sc.nextLine().split(" ");
            solve.get(cmd[0]).setTime(Double.parseDouble(cmd[2]));
        }
        for(String x: gv){
            System.out.println(solve.get(x));
        }
    }
    
}
