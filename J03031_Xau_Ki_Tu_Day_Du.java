package xau_ki_tu_day_du;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
public class Xau_Ki_Tu_Day_Du {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String solve = sc.nextLine().toLowerCase();
            int k = Integer.parseInt(sc.nextLine());
            Set<Character> set = new HashSet<>();
            for(int i = 0;i < solve.length();i++){
                set.add(solve.charAt(i));
            }
            if(26 - set.size() <= k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
