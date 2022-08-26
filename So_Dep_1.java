package so_dep_1;
import java.io.InputStream;
import java.util.*;
public class So_Dep_1 {
    static boolean BeautifulNumber(String number){
        String re_number = "";
        int n = number.length();
        for(int i = 0;i < n;i++){
            if((int)number.charAt(i) % 2 == 0){
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
            if(BeautifulNumber(number) == false) System.out.println("NO");
            else System.out.println("YES");
        }
    }
    
}
