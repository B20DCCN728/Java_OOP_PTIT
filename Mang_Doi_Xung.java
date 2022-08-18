import java.util.Scanner;
public class Mang_Doi_Xung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] _arr = new int[n + 5];
            int ok = 1;
            for(int i = 0;i < n;i++) _arr[i] = sc.nextInt();
            for(int i = 0;i < n / 2;i++){
                if(_arr[i] == _arr[n - i - 1]) continue;
                else {
                    ok = 0;
                    break;
                }
            }
            if(ok == 1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
