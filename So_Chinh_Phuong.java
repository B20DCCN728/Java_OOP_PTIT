import java.util.*;
public class So_Chinh_Phuong {
    static String Solve(int n){
        int Sqrt = (int)Math.sqrt(n);
        if(Sqrt * Sqrt == n) return "YES";
        else return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(Solve(n));
        }
    }
}
