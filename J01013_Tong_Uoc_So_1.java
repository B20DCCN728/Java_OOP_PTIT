import java.util.*;
public class Tong_Uoc_So_1 {
    static int mod = (int)1e6 * 2;
    static int[] era = new int[mod + 5];
    static void Era(){
        for(int i = 2;i <= Math.sqrt(mod);i++){
            if(era[i] == 0){
                for(int j = i * i; j <= mod;j += i){
                    if(era[j] == 0) era[j] = i;
                }
            }
        }
        for(int i = 2;i <= mod;i++){
            if(era[i] == 0) era[i] = i;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Era();
        long res = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            while(n != 1){
                res += era[n];
                n /= era[n];
            }
        }
        System.out.println(res);
    }
}
