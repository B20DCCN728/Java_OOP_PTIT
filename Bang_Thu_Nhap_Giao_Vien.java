//Created by Campus
package bang_thu_nhap_giao_vien;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Bang_Thu_Nhap_Giao_Vien {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> solve = new ArrayList<>();
        int ht = 0, hp = 0;
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int salary = Integer.parseInt(sc.nextLine());
            String compare = code.substring(0, 2);
            if(compare.equals("HT")){
                if(ht < 1) {
                    ht += 1;
                    solve.add(new Teacher(code, name, salary));
                }
            }
            else if(compare.equals("HP")){
                if(hp < 2){
                    hp += 1;
                    solve.add(new Teacher(code, name, salary));
                }
            }
            else solve.add(new Teacher(code, name, salary));
        }
        for(Teacher x: solve){
            System.out.println(x);
        }
    }
    
}
