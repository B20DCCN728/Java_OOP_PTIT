import java.util.*;
public class Dem_So_Lan_Xuat_Hien{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 0;
        while(t-- > 0){
            test++;
            int n = sc.nextInt();
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            int[] res = new int[100005];
            int[] a = new int[n + 1];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                set.add(a[i]);
                res[a[i]]++;
            }
            System.out.println("Test " + (test) + ":");
            for(int x : set) System.out.println(x +  " xuat hien " + res[x] + " lan");
        }
    }
}