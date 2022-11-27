//Created by Campus
package lop_hoc_phan_1;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Lop_Hoc_Phan_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Group> solve = new ArrayList<>();
        HashMap<String, Group> data = new HashMap<>();
        for(int i = 0;i < n;i++){
            Group tmp = new Group(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            data.put(tmp.getCode(), tmp);
            solve.add(tmp);
        }
        Collections.sort(solve);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String check = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + data.get(check).getName() + ":");
            for(int i = 0;i < n;i++){
                if(solve.get(i).getCode().equals(check)){
                    System.out.println(solve.get(i));
                }
            }
        }
    }
    
}
