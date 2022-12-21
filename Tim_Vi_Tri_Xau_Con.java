//Created by Campus
package tim_vi_tri_xau_con;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Tim_Vi_Tri_Xau_Con {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s_1 = sc.nextLine();
            String s_2 = sc.nextLine();
            try {
                int index = -1;
                while(index < s_1.length() - 1){
                    index = s_1.indexOf(s_2, index + 1);
                    if(index == -1) break;
                    System.out.print(index + 1 +" ");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println();
        }
    }
    
}
