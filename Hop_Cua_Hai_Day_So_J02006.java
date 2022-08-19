import java.util.*;
public class Hop_Cua_Hai_Day_So {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> set_1 = new TreeSet<>();
        TreeSet<Integer> set_2 = new TreeSet<>();
        for(int i = 1;i <= n;i++) set_1.add(sc.nextInt());
        for(int i = 1;i <= m;i++) set_2.add(sc.nextInt());
        set_1.addAll(set_2);
        for(int x : set_1) System.out.print(x + " ");
    }
}
