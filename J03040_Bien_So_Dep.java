package bien_so_dep;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.time.*;
public class Bien_So_Dep {
    static boolean isCheck(String solve){
        if(solve.charAt(1) > solve.charAt(0)&&solve.charAt(2) > solve.charAt(1)&&solve.charAt(3) > solve.charAt(2)&&solve.charAt(4) > solve.charAt(3)){
            return true;
        }
        if(solve.charAt(1) == solve.charAt(0)&&solve.charAt(2) == solve.charAt(1)&&solve.charAt(4) == solve.charAt(3)){
            return true;
        }
        for(int i = 0;i < solve.length();i++){
            if(solve.charAt(i) != '6'&&solve.charAt(i) != '8') return false;
        }
        return true;
    }
    /**
     * @CampusETH
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String solve = sc.nextLine();
            solve = solve.substring(5, 8) + solve.substring(9);
            if(isCheck(solve)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
