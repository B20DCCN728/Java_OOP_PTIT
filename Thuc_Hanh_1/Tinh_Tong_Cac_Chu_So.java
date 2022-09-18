package tinh_tong_cac_chu_so;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
//
public class Tinh_Tong_Cac_Chu_So {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            char[] solve = sc.nextLine().toCharArray();
            Arrays.sort(solve);
            int count = 0;
            String res = "";
            for(int i = 0;i < solve.length;i++){
                if(solve[i] <= '9' && solve[i] >= 0){
                    count += Integer.parseInt(String.valueOf(solve[i]));
                }
                else {
                    res += solve[i];
                }
            }
            res += String.valueOf(count);
            System.out.println(res);
        }
    }
    
}
