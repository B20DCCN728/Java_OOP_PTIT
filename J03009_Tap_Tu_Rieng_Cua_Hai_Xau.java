package tap_tu_rieng_cua_hai_xau;
import java.util.*;
import java.math.*;
public class Tap_Tu_Rieng_Cua_Hai_Xau {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String[] s_1 = sc.nextLine().split(" ");
            String[] s_2 = sc.nextLine().split(" ");
            TreeSet<String> S_1 = new TreeSet<>();
            TreeSet<String> S_2 = new TreeSet<>();
            for(int i = 0;i < s_1.length;i++) S_1.add(s_1[i]);
            for(int i = 0;i < s_2.length;i++) S_2.add(s_2[i]);
            S_1.removeAll(S_2);
            for(String x : S_1) System.out.print(x + " ");
            System.out.println();
        }
    }
}
