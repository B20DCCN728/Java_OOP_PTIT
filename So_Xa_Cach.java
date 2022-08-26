package so_xa_cach;
import java.util.*;
import java.lang.*;
public class So_Xa_Cach {
    static  boolean check(int[] res, int n){
        for(int i = 1;i <= n;i++){
            if(res[i] == 0) return false;
            if(i == 1) continue;
            if(Math.abs(res[i] - res[i - 1]) == 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] res = new int[1005];
            for(int i = 1;i <= n;i++) res[i] = i;
            int count = 0;
            while(true){
                count = n - 1;
                while(res[count + 1] < res[count]&&count >= 1) count--;
                if(count == 0) break;
                for(int i = n;i > count; i--){
                    if(res[i] > res[count]){
                        int tmp = res[i]; res[i] = res[count]; 
                        res[count] = tmp;
                        break;
                    }
                }
                int left = count + 1;
                int right = n;
                while(left < right){
                    int tmp = res[left];
                    res[left] = res[right];
                    res[right] = tmp;
                    left++; right--;
                }
                if(check(res, n)) {
                    for(int i = 1;i <= n;i++) System.out.print(res[i]);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    
}
