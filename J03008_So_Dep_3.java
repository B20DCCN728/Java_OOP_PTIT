package so_dep_3;
import java.util.*;
public class So_Dep_3 {
    static boolean Check(String number){
        String re_number = "";
        int n = number.length();
        for(int i = 0;i < n;i++){
            if(number.charAt(i) == '2'||number.charAt(i) == '3'||number.charAt(i) == '5'||number.charAt(i) == '7'){
                re_number = number.charAt(i) + re_number;
            }
            else return false;
        }
        if(re_number.compareTo(number) == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String number = sc.next();
            if(Check(number) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
