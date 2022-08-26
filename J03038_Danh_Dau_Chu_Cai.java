package danh_dau_chu_cai;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Danh_Dau_Chu_Cai {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String s = sc.next();
        for(int i = 0;i < s.length();i++){
            set.add(String.valueOf(s.charAt(i)));
        }
        System.out.println(set.size());
    }
    
}
