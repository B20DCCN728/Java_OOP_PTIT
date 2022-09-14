package bo_ba_so_pytago;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
public class Bo_Ba_So_PYTAGO {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] solve = new long[n + 1];
            ArrayList<Long> set = new ArrayList<>();
            for(int i = 0;i < n;i++) {
                set.add(sc.nextLong());
            }
            int ok = 0;
            for(int i = 0;i < n - 1;i++){
                for(int j = i + 1;j < n;j++){
                    long k = set.get(i) * set.get(i) + set.get(j) * set.get(j);
                    long x = (long)Math.sqrt(k);
                    if(x * x == k && set.contains(x)){
                        ok = 1;
                        System.out.println("YES");
                        break;
                    }
                }
                if(ok == 1) break;
            }
            if(ok == 0){
                System.out.println("NO");
            }
        }
    }
    
}