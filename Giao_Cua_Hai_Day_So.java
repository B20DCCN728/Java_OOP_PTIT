import java.util.*;
public class Giao_Cua_Hai_Day_So {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> arr_1 = new TreeSet<>();
        TreeSet<Integer> arr_2 = new TreeSet<>();
        for(int i = 1;i <= n;i++) arr_1.add(sc.nextInt());
        for(int i = 1;i <= m;i++) arr_2.add(sc.nextInt());
        arr_1.retainAll(arr_2);
        for(int x : arr_1) System.out.print(x + " ");
    }
}
