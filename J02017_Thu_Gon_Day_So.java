package thu_gon_day_so;
import java.util.*;
public class Thu_Gon_Day_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 5];
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
        Stack<Integer> res = new Stack<>();
        for(int i = 0;i < n;i++){
            if(res.isEmpty()) res.push(arr[i]);
            else{
                if((res.peek() + arr[i]) % 2 == 0) res.pop();
                else res.push(arr[i]);
            }
        }
        System.out.println(res.size());
    } 
}
