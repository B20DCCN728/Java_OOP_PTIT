package so_uu_the;
import java.util.*;
public class So_Uu_The {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String solve = sc.next();
            int n = solve.length();
            int odd = 0;
            int even = 0;
            int ok = 1;
            if(solve.charAt(0) == '0') {
                ok = 2;
            }
            for(int i = 0;i < n / 2;i++){
                if(solve.charAt(i) - '0' <= 9 && solve.charAt(i) - '0' >= 0){
                    if((solve.charAt(i) - '0') % 2 == 0) even++;
                    else odd++;
                }
                else {
                    ok = 0;
                    break;
                }
                if(solve.charAt(n - i - 1) <= '9' && solve.charAt(n - i - 1) >= '0'){
                    if((solve.charAt(n - i - 1) - '0') % 2 == 0) even++;
                    else odd++;
                }
                else{
                    ok = 0;
                    break;
                }
            }
            if(solve.charAt(n / 2) - '0' >= 0 && solve.charAt(n / 2) - '0' <= 9 ) {
                if(n % 2 == 1){
                    if(solve.charAt(n / 2) % 2 == 0) even++;
                    else odd++;
                }
            }
            else ok = 0;
            if(ok == 0) System.out.println("INVALID");
            else if(ok == 2) System.out.println("NO");
            else{
                if(odd == even) System.out.println("NO");
                else {
                    if(n % 2 == 0&& even > odd) System.out.println("YES");
                    else if (n % 2 == 1 && odd > even) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
    
}
